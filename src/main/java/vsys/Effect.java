package vsys;


public interface Effect<T> {
  void apply(T t);
}