package com.java_lab3Generic1;

public class GenericsType<T> {
	private T t;
	
	public T get(){
		return this.t;
	}
	
	public void set(T t1){
		this.t=t1;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked" })
	public static void main(String args[]){
		GenericsType<String> type = new GenericsType<>();
		type.set("Hello World!"); 
		
		GenericsType type1 = new GenericsType(); 
		type1.set("Hello World!"); 
		type1.set(10); 
	}
}
