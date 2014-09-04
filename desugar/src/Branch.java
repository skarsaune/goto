public class Branch {
  public void foo(final boolean test) {
    System.out.println("before");
    if (test) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }
    System.out.println("after");
  }

}
