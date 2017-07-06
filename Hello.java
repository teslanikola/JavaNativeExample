public class Hello {
  public native void sayHi(String who, int times); //1

  static { System.loadLibrary("HelloImpl"); } //2

  public static void main (String[] args) {
    Hello hello = new Hello();
    hello.sayHi(args[0], Integer.parseInt(args[1])); //3
  }
}