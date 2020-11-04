package quiz;

import java.util.Scanner;

/*
게임설명 : 가위바위보 게임을 메소드를 통해 구현한다.
난수생성기를 이용하여 1, 2, 3중 하나의 숫자를 생성한다.
사용자가 가위(1),바위(2),보(3) 중 하나를 낸다.
승부를 판단하여 출력한다.
1,2,3 이외의 숫자를 입력하면 잘못된 입력을 알려주고 재입력을 요구한다.
숫자입력을 잘못한 경우는 게임횟수에 포함하지 않는다.
게임은 5번 진행하고 5번째 게임을 끝내면 다시할지 물어본다. 재시작(1), 종료(0)
0, 1 이외의 숫자를 입력하면 재입력을 요구해야 한다.

scanner.nextLine(); << 무한루프에서 빠져나올 수 있는 것.(버퍼에 남은 엔터키 제거)

 */

class WrongNumberException extends Exception{
	public WrongNumberException()
	{
		super("[예외발생]1~3사이의 숫자를 입력하세요.");
	}
}
public class QuRockPaperScissors {

   public static void main(String[] args) {

     
      int i=1;
      for(;;) {
    	  Scanner sc = new Scanner(System.in);
         for( ; i<=5 ; i++) {
            System.out.print("무엇을 내겠습니다?(1.가위, 2.바위, 3.보) :");
            int com = (int)(Math.random()*100)%3+1;
            int user = sc.nextInt();
            if(com==1) {            
               if(user==1) {
                  System.out.println("사용자:가위, 컴퓨터:가위");
                  System.out.println("비겼습니다");
               }else if(user==2) {
                  System.out.println("사용자:바위, 컴퓨터:가위");
                  System.out.println("이겼습니다");
               }else if(user==3) {
                  System.out.println("사용자:보, 컴퓨터:가위");
                  System.out.println("졌습니다");
               }else {
                  System.out.println("가위바위보 할줄 모름? 제대로 내^^");
               }
            }
            if(com==2) {
               if(user==2) {
                  System.out.println("사용자:바위, 컴퓨터:바위");
                  System.out.println("비겼습니다");
               }else if(user==3) {
                  System.out.println("사용자:보, 컴퓨터:바위");
                  System.out.println("이겼습니다");
               }else if(user==1) {
                  System.out.println("사용자:가위, 컴퓨터:바위");
                  System.out.println("졌습니다");
               }else {
                  System.out.println("가위바위보 할줄 모름? 제대로 내^^");
               }
            }
            if(com==3) {
               if(user==3) {
                  System.out.println("사용자:보, 컴퓨터:보");
                  System.out.println("비겼습니다");
               }else if(user==1) {
                  System.out.println("사용자:가위, 컴퓨터:보");
                  System.out.println("이겼습니다");
               }else if(user==2) {
                  System.out.println("사용자:바위, 컴퓨터:보");
                  System.out.println("졌습니다");
               }else {
                  System.out.println("가위바위보 할줄 모름? 제대로 내^^");
               }
            }
         }
         
         System.out.print("5번의 게임이 끝났습니다. 게임을 계속하시겠습니까?"
               + "재시작(1), 종료(0) :");
         int j = sc.nextInt();
         if(j==1) {
        	 i=1;
            continue;
         }else if(j==0) {
            break;
         }else {
            System.out.println("잘못입력하셨습니다.재시작(1), 종료(0)중에 입력하세요");
         }
         
      }
   }
   

}