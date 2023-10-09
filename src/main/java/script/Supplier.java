package script;

public interface Supplier<A> {
  A get();

  default <B> Supplier<B> map(Function<A, B> f) {
    return () -> f.apply(this.get());
  }

  default <B> Supplier<B> flatMap(Function<A, Supplier<B>> f) {
    return () -> f.apply(this.get()).get();
  }

  default Runnable bindRunnable(Function<A, Runnable> f) {
    return () -> f.apply(this.get()).run();
  }

  default <B> Supplier<B> bind(Function<A, Supplier<B>> f) {
    return flatMap(f);
  }

  static Supplier<Nothing> fromRunnable(Runnable r){
    return () -> {
      r.run();
      return Nothing.instance;
    };
  }

  static Runnable toRunnable(Supplier<Nothing> s){
    return () -> s.get();
  }


}