package exercise;

public class Task06 {

	public static void main(String[] args) {
        
		int angle1 = 80;
		int angle2 = 40;
		
		
	   if (angle1 + angle2 < 180 && angle1 > 0 && angle2 > 0 ) {
		   System.out.println("Это треугольник");
		   if  (angle1 + angle2 ==90  || angle1 ==90 || angle2 ==90) {
				  System.out.println("Треугольник является прямоугольным");
			   }
				   else {
					   System.out.println("Треугольник не является прямоульным");
			   }
		   } 
	   else  System.out.println("Это не треугольник");
	   
	    }
	   
		 
	 
	}


	
	

