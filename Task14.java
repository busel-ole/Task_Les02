package exercise;

import java.util.Scanner;

public class Task14 {
	
	
	
	    public static void main(String [] args) {
	    	
	    System.out.println("������� ����� ����� ������������� ����� �� �������");
			
		Scanner scan = new Scanner(System.in);
			
		int a = scan.nextInt();
		
		int y = 1;
	
		for(int x = 1; x <= a; x++) {
			y = y * x;
		}
		System.out.print(y);
	}	
}

