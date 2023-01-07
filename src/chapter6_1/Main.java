package chapter6_1;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ"));
		System.out.println(appleBasket.get().getName());
		
		appleBasket.replace(new Apple("紅玉"));
		System.out.println(appleBasket.get().getName());
	
		Basket<Peach> peachBasket = new Basket<>(new Peach("黄金桃"));
		System.out.println(peachBasket.get().getName());
	}
}
