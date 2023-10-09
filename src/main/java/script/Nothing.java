package script;

public final class Nothing {
  public static final Nothing instance = new Nothing();
  private Nothing() {}

  @Override
  public String toString() {
    return "Nothing";
  }
}