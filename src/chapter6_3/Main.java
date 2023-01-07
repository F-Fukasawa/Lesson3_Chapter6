package chapter6_3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<? extends Fruit> fruits = new ArrayList<>();
		List<Apple> apples = new ArrayList<>();
		
		// 以下は説明用の実現不可能なコードです。いずれもコンパイルエラーとなります。
		fruits = apples; // 要素は親子関係にあるが、この代入は成り立たずコンパイルエラー
		//fruits.add(new Peach("黄金桃", 300)); // 上記を許してしまうと、実体がAppleのListなのに別の型の要素を追加できてしまう
	}
}
