package script;

public interface Callable<A> {
  A call() throws Exception;

  static <A> Callable<A> pure(A a) {
    return () -> a;
  }

  default <B> Callable<B> map(Function<A, B> f) {
    return () -> f.apply(this.call());
  }

  default <B> Callable<B> flatMap(Function<A, Callable<B>> f) {
    return () -> f.apply(this.call()).call();
  }

  default <B> Callable<B> bind(Function<A, Callable<B>> f) {
    return flatMap(f);
  }

  default Runnable bindRunnable(Function<A, Runnable> f) {
    return () -> {
      try {
        f.apply(this.call()).run();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    };
  }

  default <B> Callable<B> append(Callable<B> cb) {
    return bind(ignore -> cb);
  }

  static Callable<Nothing> fromRunnable(Runnable r){
    return () -> {
      r.run();
      return Nothing.instance;
    };
  }

  static Runnable toRunnable(Callable<Nothing> s) {
    return () -> {
      try {
        s.call();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    };
  }

 default  Supplier<A> toSupplier() {
    return () -> {
      final A value;
      try {
        value = call();
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
      return value;
    };
  }


}