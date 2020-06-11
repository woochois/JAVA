package com.hk.generic;

public class NewBox<T> { // 제네릭 표시 <T>
	private T data;

	protected T getData() {
		return data;
	}

	protected void setData(T data) {
		this.data = data;
	}

}
