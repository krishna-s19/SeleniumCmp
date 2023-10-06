package overloading;

public class Test1 {
	public static void main(String[] args) {
		OverLoading ob =new OverLoading();
		
		ob.myMethod(10);
		ob.myMethod(10.23f);
		ob.myMethod();
		ob.myMethod(10,20);
		ob.myMethod(10,20.34f);
		ob.myMethod(10.20f,20);
		ob.myMethod(10.23);
	}

}
