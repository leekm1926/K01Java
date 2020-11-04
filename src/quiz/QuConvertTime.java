package quiz;

import java.util.Scanner;

/*
 문제2) 파일명 : QuConvertTime.java
‘초’를 ‘시간’으로 변환하기
초를 입력받아서 00시간 00분 00초 형태로 출력하는 프로그램을 메소드를 작성하시오.
출력예 : 2458초 -> 0시간 40분 58초
       	   3456초 -> 0시간 57분 36초
       	   
실행결과]
시간으로 변환할 초(second)를 입력하세요:5678
[1시간 34분 38초]

 */
public class QuConvertTime {

	static final int HOUR = 60 * 60;
	static final int MIN = 60;
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("시간으로 변환할 초(second)를 입력하세요:");
		int inputSec = scan.nextInt();
		convertSecToHMS(inputSec);
	}
	
	public static void convertSecToHMS(int sec)
	{
		//시, 분, 초를 저장하기 위한 지역변수 선언
		int h, m, s;
		
		/*
		 sec = 3661이라고 가정했을 때
		 3661 / 3600 = 1시간(몫)
		 3661 % 3600 = 61초(나머지)
		 
		 61 / 60 = 1분 (몫)
		 61 % 60 - 1초(나머지)
		 
		 변환결과 ===> 1시간 1분 1초
		 */
		
		h = sec / HOUR;//시간 구하기
		sec = sec % HOUR;//시간을 구하고 남은 초를 다시 저장
		
		m = sec / MIN;//분 구하기
		sec = sec % MIN;//분을 구하고 남은 초를 다시 저장
		
		s = sec;//초 구하기
		
		System.out.printf("%d시간 %d분 %d초", h ,m ,s);
	}

}
