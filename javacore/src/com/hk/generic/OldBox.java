package com.hk.generic;

public class OldBox {
////////////////////////////////////////////
	private Object data;

	protected Object getData() {
		return data;
	}

	protected void setData(Object data) {
		this.data = data;
	}	
///////////////////////////////////////////
	
	public static void main(String[] args) {
		OldBox box1 = new OldBox();
		box1.setData("문자열데이터가 왔습니다");
		
		OldBox box2 = new OldBox();
		box2.setData(1000000);
		
		OldBox box3 = new OldBox();
		Lion king = new Lion();
		box3.setData(king);
		
		// 가져와서 확인
		String temp1 = box1.getData().toString();
		int temp2 = (int)box2.getData();
		Lion guess = (Lion)box3.getData();
		
		System.out.println(temp1 +""+ temp2 +""+ guess);
	}
}