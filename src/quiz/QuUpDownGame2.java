package quiz;

/*
 내가 한거
 */
import java.util.Scanner;

public class QuUpDownGame2 {

	public static void main(String[] args)
	{
		UpDownGame();
	}
	
	static void UpDownGame()
	{
		System.out.println("업다운 게임을 시작합니다.");
		int num =(int) (Math.random()*100+1);
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=8; i++)
		{
			if(i==8)
			{
				System.out.println("실패");
				break;
			}
			System.out.println("숫자를 입력하세요");
			
			int a = sc.nextInt();
			if(a>num)
			{
				System.out.println(a+"보다 작은 숫자입니다.");
			}
			else if(a<num)
			{
				System.out.println(a+"보다 높은 숫자입니다.");
			}
			else if(a==num)
			{
				System.out.println("정답입니다!");
				break;
			}
			
		}
		
		restart();
	}
	
	static void restart()
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("계속하실거면 '1'을 종료하시려면'0'을 입력하세요");
		int b = sc.nextInt();
		
		if(b==1)
		{
			UpDownGame();
		}
		else if(b==0)
		{
			return;
		}
		else
		{
			System.out.println("잘못입력하셨습니다 다시 입력하세요");
			restart();
		}
		
	}

}
