package com.kook.bit;

public class BitOp1 {
	public static void main (String args[]) {
		int num1 = 0xFFFF0000; //16������ ǥ��
		//11111111111111110000000000000000
		int num2 = 0xFF00FF00;
		//11111111000000001111111100000000;
		//�� �ڸ������� ��Ʈ������ �ض�
		int result1 = num1 & num2; //AND bit���� (2�� ��� 1�Ͻø� 1)
		int result2 = num1 | num2; //OR bit����(2���� �ϳ��� 1�̸� 1)
		int result3 = num1 ^ num2; //Exclusive-or bit����
		int result4 = ~num1; // not��Ʈ���� (1�Ǻ����Ҷ� ����)
		
		System.out.printf("%08X %n", result1);
		//printf�� ������ ���߾� ��� " " �ȿ� ������ ��
		//%�� ���� ǥ�� 08x�� 16���� 8�ڸ� %n�� �ٹٲ� 
		//�ڸ��� �տ� -�� ���� ���ʺ��� ä��
		System.out.printf("%08X %n", result2);
		System.out.printf("%08X %n", result3);
		System.out.printf("%08X %n", result4);
		
		System.out.println(Integer.toBinaryString(result1));
		//int���� 2�������¹��ڿ��� ����ϴ� toBinaryString(intx)�ż���
		
	}
	

}
