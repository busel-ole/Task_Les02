package exercise;


public class Task01 {
   public static void main(String[] args) {
	  
	   int a = 2;
	   int b = 3;
	   int c = 5;
	   double d;
	   double e;
	 
	d = (float) (b + Math.sqrt(Math.pow(b,2) + 4 * a * c));  
	e = (float) (d / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
			
			
   System.out.print(e);  
   
   }
   
}
