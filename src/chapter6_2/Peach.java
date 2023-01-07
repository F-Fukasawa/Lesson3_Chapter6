package chapter6_2;

public class Peach extends Fruit{
	public Peach(String name) {
		super(name);
	}
	
	@Override
	protected String getName() {
		return name;
	}
}
