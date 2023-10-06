package overloading;

	public class Demo {
	    public void bar(int x, double y) {
	        System.out.println("bar(int x, double y) called");
	    }

	    public void bar(double x, int y) {
	        System.out.println("bar(double x, int y) called");
	    }
 
	    public static void main(String[] args) {
	        Demo example = new Demo();
	        example.bar(5, 5.0); // This could lead to ambiguity error
	    }
	}



