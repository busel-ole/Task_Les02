package exercise;

import java.util.Scanner;

public class Task13 {
	

	 
	public static void main(String[] args) {
		
		System.out.println("������� ����� ����� ������������� ����� �� �������");
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
        int y = 0;
		
		for(int x = 0; x <= a; x++) {
			y = y+x;
		}
	
		System.out.println("����� ����� �� ���������� ����� - " + y);
			
		
	}

}
