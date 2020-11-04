package quiz;

import java.util.Scanner;


public class Tic_Tac_Toe {
	
	public static void main(String[] args) {
		
		char[][] tic = new char[3][3];
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{	
				tic[i][j] = ' ';
			
				do
				{
					for(i=0; i<3; i++)
					{
						System.out.println(" " + tic[i][0] + " | " + tic[i][1]
											+ " | " + tic[i][2]);
						if(i != 2)
							System.out.println("---|---|---");
					}
					System.out.print("다음 입력하실 좌표를 입력하세용");
					x = sc.nextInt();
					y = sc.nextInt();
					
					
					if(tic[x][y] != ' ')
					{
						System.out.println("잘못된 위치");
						continue;
					}
					else
						tic[x][y] = 'x';
				
					i=0; j=0;
					
					for(i=0; i<3; i++)
					{
						for(j=0; j<3; j++)
							if(tic[i][j] == ' ')
								break;
						if(tic[i][j] == ' ')
							break;
					}
					if(i<3 && j<3)
						tic[i][j] = 'O';
				} while(true);
				
				
			}
		}
	}	
}