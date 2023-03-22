//switch 문제

import java.util.Scanner;

public class ex2 {	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("연산>>");
	float a = sc.nextFloat();
	String op = sc.next();
	float b = sc.nextFloat();
	float sum = 0;
	sc.close();
	
	switch (op) {
		case"+": 
			sum = a+b;
			System.out.print(a + op + b + "의 계산 결과는" + sum);
			break;
		case"-": 
			sum = a-b;
			System.out.print(a + op + b + "의 계산 결과는" + sum);
			break;
		case"*": 
		sum = a*b;
		System.out.print(a + op + b + "의 계산 결과는" + sum);
			break;
		case"/": 
			if (b==0) {
				System.out.print("0으로 나눌 수 없습니다.");
				break;
			}else {
				sum = a/b;
				System.out.print(a+ op + b + "의 계산 결과는" + sum);
				break;
			}
		default : {
			System.out.print("제대로 된 연산자를 입력하세요.");	
		}
	}
}}
