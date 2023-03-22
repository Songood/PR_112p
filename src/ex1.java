//if-else 문제

import java.util.Scanner;

public class ex1 {	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("연산>>");
	float a = sc.nextFloat();
	String op = sc.next();
	float b = sc.nextFloat();
	float sum = 0;
	sc.close();
	
	if (op.equals("+")) {
		sum = a+b;
		System.out.print(a + op + b + "의 계산 결과는" + sum);
	} else if (op.equals("-")) {
		sum = a-b;
		System.out.print(a + op + b + "의 계산 결과는" + sum);
	} else if (op.equals("*")) {
		sum = a*b;
		System.out.print(a + op + b + "의 계산 결과는" + sum);
	} else if (op.equals("/")) {
		if (b == 0) {
			System.out.print("0으로 나눌 수 없습니다.");
	
		} else {
			sum = a/b;
			System.out.print(a + op + b + "의 계산 결과는" + sum);
		}
	}else {
		System.out.println("제대로 된 연산자를 입력하세요.");
	}}}

