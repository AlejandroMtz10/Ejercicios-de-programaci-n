package Beecrowd.Java;
import java.util.Scanner;
public class squared_and_cubic_1143 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n, square,cubic;
		
		n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			square = (int) Math.pow(i, 2);//Potencias con
			cubic = (int) Math.pow(i,3);//Math.pow 
			
			System.out.println(i+" "+square+" "+cubic);
		}	
		
	}

}   