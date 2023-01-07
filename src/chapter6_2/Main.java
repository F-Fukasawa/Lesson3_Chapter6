package chapter6_2;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		appleBasket.printName();
		
		appleBasket.replace(new Apple("紅玉"));
		appleBasket.printName();
	
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃"));
		peachBasket.printName();
	}
}
