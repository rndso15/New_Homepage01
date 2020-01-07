package com.kh.ex;

public class MyCalculator {
	
	// 요약 : 해당 클래스는 calculator를 이용해서 기능지원
	// 		  컨트롤러 역할.
	
	public Calculator calculator;
	private int firstNum;
	private int secondNum;
	
	// 생성자.
	public MyCalculator() {
		
	}

	public void add() {
		calculator.addition(firstNum , secondNum);
	}

	public void sub() {
		calculator.subtraction(firstNum , secondNum);
	}

	public void mul() {
		calculator.multiplication(firstNum , secondNum);
	}

	public void div() {
		calculator.division(firstNum , secondNum);
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	
	// Getter , Setter 
	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}
}
