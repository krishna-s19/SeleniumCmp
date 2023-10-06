package overloading;

	public class MethodOverloadingExample {
	    public void foo(int x) {
	        System.out.println("foo(int x) called with value: " + x);
	    }

	    public void foo(double y) {
	        System.out.println("foo(double y) called with value: " + y);
	    }

	    public static void main(String[] args) {
	        MethodOverloadingExample example = new MethodOverloadingExample();
	        example.foo(5);    // Calls foo(int x)
	        example.foo(5.0);  // Calls foo(double y)
	    }
	}


