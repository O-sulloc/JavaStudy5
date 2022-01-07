package com.jh.s9.himart;

public class Client {
	int money;
	int point;

	public void buy(Product t) {
		this.money = this.money - t.price;
		this.point = this.point + t.point;
		System.out.println("최종 금액: " + this.money);
		System.out.println("최종 포인트: " + this.point);
	}

}
