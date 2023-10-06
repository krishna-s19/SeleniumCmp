package operators;

public class OperatorsTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b =20;
		int z = a+b;
		System.out.println("result   :"+(a+b));
		System.out.println(((Object)z).getClass().getSimpleName());
		
		System.out.println("=================================");
		float f1 = 12.899f;
		float f2 = 13f;
		float f3 = f1+f2;
		System.out.println("result  :"+(f1+f2));
		System.out.println(((Object)f3).getClass().getSimpleName());
		
		System.out.println("=================================");
		double  d1=18;
		double d2 =19;
		double d3 =d1+d2;
		System.out.println("result   :"+(d1+d2));
		System.out.println(((Object)d3).getClass().getSimpleName());
		
		System.out.println("=================================");
		
		char c1 ='a';
		char c2 ='b';
		char c3 = (char) (c1+c2);
		System.out.println("result   :"+(c2+c1));
		System.out.println(((Object)c3).getClass().getSimpleName());
		System.out.println("=================================");
		
		
		float f4 = (float )d1+f1;
		System.out.println("result   :"+f4);
		System.out.println(((Object)f4).getClass().getSimpleName());
		
		int x =10;
		char ch ='s';
		char z1 = (char)(x+ch);
		System.out.println("result int --> char  :"+ z1);
		System.out.println(((Object)z1).getClass().getSimpleName());
		
		System.out.println("-------------"+(++f1));
		System.out.println("-------------"+(++ch));
		System.out.println("-------------"+(--ch));
		
		
		
	}

}
