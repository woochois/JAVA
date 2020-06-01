package com.hk.constructor;

class ProductTest2 {
	public static void main(String[] args) {
		Product2 p1 = new Product2();
		Product2 p2 = new Product2();
		Product2 p3 = new Product2();

		System.out.println("p1의 제품번호는 " + p1.serialNo);
		System.out.println("p2의 제품번호는 " + p2.serialNo);
		System.out.println("p3의 제품번호는 " + p3.serialNo);
		System.out.println("생산된 제품의 수는 모두 " + Product2.count + "개 입니다.");

	}
}