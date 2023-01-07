package chapter6_2;

public class Apple extends Fruit{	
	public Apple(String name) {
		super(name);
	}
	
	@Override
	protected String getName() {
		return name;
	}
}
