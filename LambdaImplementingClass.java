package lambdaExpressions;

public class LambdaImplementingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FunctionalInterfaceDemo f = ()->System.out.println("calling lambda method");
		FunctionalInterfaceDemo f= (n1,n2)->System.out.println(n1+n2);
		 //f.anonymous();
		 f.lambda(25,35);
         f.display();
         FunctionalInterfaceDemo.show();
		}
	}
	


