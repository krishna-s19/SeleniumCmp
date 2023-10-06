package overloading;

	
	public class AmbiguityExample {
	    public void bar(int x) {
	        System.out.println("bar(int x) called with value: " + x);
	    }

	    public void bar(long y) {
	        System.out.println("bar(long y) called with value: " + y);
	    }

	    public static void main(String[] args) {
	        AmbiguityExample example = new AmbiguityExample();
	        example.bar(5); // This could lead to ambiguity error
	    }
	}


