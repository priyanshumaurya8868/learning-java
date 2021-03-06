package recursion.numbers;

import java.util.Scanner;
class tribonacci {
	   public static int tribonacci_(int n) {
	        if (n < 2) return n;
	        int a = 0, b = 1, c = 1, d;
	        while (n-- > 2) {
	            d = a + b + c;
	            a = b;
	            b = c;
	            c = d;
	        }
	        return c;
	    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
    	System.out.println(tribonacci_(n)); sc.close();
    }
   
}