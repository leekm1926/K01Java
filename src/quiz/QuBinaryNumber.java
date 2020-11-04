package quiz;

import java.util.Scanner;

/*
 문제) 파일명 : QuBinaryNumber.java
10진수를 입력받아서 2진수로 변환해서 출력하는 프로그램을 작성하시오.
 단, 이미 제공되는 변환함수를 사용하지말고 아래 예시에서 주어진데로 프로그램을 작성하고, 배열(Array)을 활용한다. 
10진수 12 는 2진수 1100으로 변환할 수 있다. 즉 12을 2로 나눈 나머지를 역순으로 이어붙이면 된다. 

 */
public class QuBinaryNumber {

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("2진수로 변환할 정수를 입력하세요: ");
				
		int index = 0;
		
		int num1 = scanner.nextInt();
		int[] num2 = new int[1000];

		for(int i=0; i<num2.length; i++)
		{
			if(num1<2)
			{
				num2[i]=num1;
				break;
			}
			
			num2[i] = num1 % 2;
			num1 /= 2;
			index++;
		}
		for(int i=index; i>=0; i--)
		{
			System.out.print(num2[i]);
		}
	}

}
