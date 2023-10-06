package overloading;

public class OverLoading {
	
	
	public void myMethod() {
		System.out.println("--No argument myMethod");
	}
	public void myMethod(int x) {
		System.out.println("---OverLoading.myMethod(int)--");
	}
	public void myMethod(float x) {
		System.out.println("---OverLoading.myMethod(float)--");
	}
	public void myMethod(double x) {
		System.out.println("---OverLoading.myMethod(double)--");
	}
	public void myMethod(int x,int y) {
		System.out.println("---OverLoading.myMethod(int,int)--");
	}
	public void myMethod(float x,float y) {
		System.out.println("---OverLoading.myMethod(float,float)--");
	}
	public void myMethod(int x,float y) {
		System.out.println("---OverLoading.myMethod(int,float)--");
	}
	public void myMethod(float b,int x) {
		System.out.println("---OverLoading.myMethod(float ,int)--");
	}

}
