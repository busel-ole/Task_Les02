package exercise;

public class Task08 {
	
	public static void main(String [] args) {
		
		int a = 2;			
		int b = 7;			
		
		int x = 1;			
		int y = 8;			
		int z = 8;			
		
		if(((a >= x) & (b >= y)) | ((a >= x) & (b >= z))) {
			System.out.print("Кирпич войдет в отверстие");
		}else {
			System.out.print("Кирпич не войдет в отверстие");
			
}
		
	}
}