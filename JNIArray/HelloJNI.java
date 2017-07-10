public class HelloJNI {
  public native void sayHiJNI(double a[]);

  static { System.loadLibrary("HelloJNIImpl"); }

  public static void main (String[] args) {
    HelloJNI hello = new HelloJNI();
    double a[]={1.3,2.5,6.3,4.2};
    hello.sayHiJNI(a);
  }
}