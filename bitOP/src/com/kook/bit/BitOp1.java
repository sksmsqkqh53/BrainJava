package com.kook.bit;

public class BitOp1 {
	public static void main (String args[]) {
		int num1 = 0xFFFF0000; //16진수로 표시
		//11111111111111110000000000000000
		int num2 = 0xFF00FF00;
		//11111111000000001111111100000000;
		//각 자리수별로 비트연산을 해라
		int result1 = num1 & num2; //AND bit연산 (2개 모두 1일시만 1)
		int result2 = num1 | num2; //OR bit연산(2개중 하나라도 1이면 1)
		int result3 = num1 ^ num2; //Exclusive-or bit연산
		int result4 = ~num1; // not비트연상 (1의보수할때 좋음)
		
		System.out.printf("%08X %n", result1);
		//printf는 서식을 갖추어 출력 " " 안에 서식을 줌
		//%로 서식 표시 08x는 16진수 8자리 %n은 줄바꿈 
		//자릿수 앞에 -가 오면 왼쪽부터 채움
		System.out.printf("%08X %n", result2);
		System.out.printf("%08X %n", result3);
		System.out.printf("%08X %n", result4);
		
		System.out.println(Integer.toBinaryString(result1));
		//int값을 2진수형태문자열로 출력하는 toBinaryString(intx)매서드
		
	}
	

}
