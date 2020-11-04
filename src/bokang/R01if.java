package bokang;

import java.util.Scanner;

public class R01if {

	/*
	 시나리오] 90점 이상 : A학점
	 		80점 이상~90점 미만 : B학점
	 		나머지는 : F학점
	 */
	public static void main(String[] args) {

		int jumsu = 85;
		
		if(jumsu>=90)
		{
			System.out.println("A학점");
		}
		else if(jumsu >= 80 && jumsu < 90)
		{
			System.out.println("B학점");
		}
		else
			System.out.println("F학점");

		/*
		 switch문
		 
		 형힉]
		 	switch(정수식 혹은 산술식)
		 	{
		 	case 값1:
		 		실행문;
		 		break;
		 		..................
		 	default:
		 		나머지 실행문;
		 	}
		 */
		/*
		시나리오] 월에 해당하는 1~12까지의 숫자를 입력받아서
			봄(3~5), 여름(6~9), 가을(10~11), 겨울(12~2)인지 판단하는 
			switch~case문을	작성해보시오.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("1~12사이의 정수를 입력하세요 : ");
		
		int month = sc.nextInt();
		
		switch(month)
		{
		case 3: case 4: case 5: //if문의 or조건같은 형식
			System.out.println("3~5월은 봄 입니다~!");
			break;
		
		case 6: case 7: case 8: case 9:
			System.out.println("6~9월은 여름입니다~!");
			break;
		case 10: case 11:
			System.out.println("10~11월은 가을입니다~!");
			break;
		case 12: case 1: case 2:
			System.out.println("12~2월은 겨울입니다~!");
			break;
			
		default :
			System.out.println("잘못입력하셨습니다.");
		}
		
	}

}
