package com.jh.s9.himart;

public class HimartMain {

	public static void main(String[] args) {

		Computer c = new Computer();
		c.company = "Apple";
		c.brand = "Mac";
		c.cpu = "i7";
		c.price = 230;
		c.point = 2;

		Phone p = new Phone();
		p.company = "Apple";
		p.brand = "iphone14";
		p.pixel = 100;
		p.price = 190;
		p.point = 5;

		Tv t = new Tv();
		t.company = "LG";
		t.brand = "오브제";
		t.size = 100;
		t.price = 300;
		t.point = 10;

		Client jh = new Client();
		jh.money = 1000;
		jh.point = 0;
		jh.buy(c);
	}

}
