package quiz;

import java.util.Scanner;

/*
 현재 소유하고 있는 금액을 입력받아서 아래 물건을 잔돈을 남기지않고 최소 1개이상 구매하려면 어떻게 구매해야 하는지 프로그램을 통해 구현하시오.
빵 : 500원
과자 : 700원
음료수 : 400원
단, 1600원 이상을 입력받으세요...

실행결과]
구매할 금액을 입력하세요(1600원이상):2800
빵1개, 과자1개, 음료4개
빵2개, 과자2개, 음료1개
위 방법중 하나를 선택하세욤^^*

 */
public class QuBuyObject {

	static final int BREAD = 500;
	static final int SNACK = 700;
	static final int DRINK = 400;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 금액을 입력하세요(1600원 이상) : ");
		int buyMoney = sc.nextInt();
		
		//입력받은 금액을 매개변수로 물건 구매하기
		buyObject(buyMoney);
	}
	
	public static void buyObject(int bMoney)
	{
		//구매가능여부를 판단하기위한 변수
		int buyCount = 0;
		
		//빵구매
		for(int i=1; i<bMoney/BREAD; i++)
		{
			//과자구매
			for(int j=1; j<bMoney/SNACK; j++)
			{
				//음료구매
				for(int k=1; k<bMoney/DRINK; k++)
				{
					/*
					 거스름돈을 남기지 않아야 하므로 주어진 금액과
					 구매금액이 같으면 된다.
					 */
					if((BREAD * i + SNACK * j + DRINK * k) == bMoney)
					{
						System.out.printf("빵 : %d개,",i);
						System.out.printf("과자 : %d개,",j);
						System.out.printf("음료수 : %d개\n",k);
						
						//구매가 가능하다면 하나씩 증가시킨다.
						buyCount++;
					}
				}
			}
		}
		
		if(buyCount==0)
		{
			System.out.println("해당 금액으로는 구매가 불가능합니다.");
		}
		else
		{
			System.out.println("출력된 방법중 하나를 선택하세요.");
		}
	}

}
