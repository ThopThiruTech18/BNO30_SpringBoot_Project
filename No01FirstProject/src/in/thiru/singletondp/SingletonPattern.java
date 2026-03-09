package in.thiru.singletondp;

public class SingletonPattern {

	public static SingletonPattern instance = null;

	private SingletonPattern() {

	}

	public static SingletonPattern getInstance() {
		if (instance == null) {
			instance = new SingletonPattern();
		}

		return instance;
	}

}
