package in.thiru.singletondp;

public class Test2 {
	
	public static void main(String[] args) {
		
		
	
		
		
		SingletonPattern instance1 = SingletonPattern.getInstance();
		SingletonPattern instance2 = SingletonPattern.getInstance();
		SingletonPattern instance3 = SingletonPattern.getInstance();
		SingletonPattern instance4 = SingletonPattern.getInstance();
		
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		System.out.println(instance3.hashCode());
		System.out.println(instance4.hashCode());
		
		
		
	}

}
