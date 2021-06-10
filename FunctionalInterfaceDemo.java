package lambdaExpressions;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	//public void anonymous();
	public void lambda(int n1,int n2);
	default void display()
	{
		System.out.println("calling default method");
	}
	static void show()
	{
		System.out.println("calling static method");
	}

	}


