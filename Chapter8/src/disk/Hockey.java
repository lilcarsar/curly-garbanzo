/*

Program: Hockey.java          Last Date of this Revision: March 16, 2022

Purpose: Application test for Puck.java

Author: Carter Sarney 
School: CHHS
Course: Computer Programming 30
 

*/
package disk;
import java.util.Scanner;


public class Hockey extends Puck{

	public Hockey(double g) {
		super(g);
	}
	
	
	public static void main(String[] args) {
		Scanner puck1 = new Scanner(System.in);
		System.out.println("Please enter a weight for puck one between 4 ounces and 5.5 ounces: ");
		double ans1 = puck1.nextDouble();
		
		Scanner puck2 = new Scanner(System.in);
		System.out.println("Please enter a weight for puck two between 4 ounces and 5.5 ounces: ");
		double ans2 = puck2.nextDouble();
		
		Puck cir1 = new Puck(ans1);
		Puck cir2 = new Puck(ans2);
		
		
		
		if(cir1.equals(cir2) == true) {
			System.out.println(cir1.toString());
			System.out.println(cir2.toString());
			System.out.println("The puck weights are the same :)");
		}
		else {
			System.out.println(cir1.toString());
			System.out.println(cir2.toString());
			System.out.println("The puck weights are not the same :( ");
		}
		
		
		
		Scanner puck3 = new Scanner(System.in);
		System.out.println("Please enter a weight for spot one between 4 ounces and 5.5 ounces: ");
		double ans3 = puck3.nextDouble();
		
		Scanner puck4 = new Scanner(System.in);
		System.out.println("Please enter a weight for spot two between 4 ounces and 5.5 ounces: ");
		double ans4 = puck4.nextDouble();
		
		Puck spot1 = new Puck(ans3);
		Puck spot2 = new Puck(ans4);
		
		if (spot1.compareTo(spot2)==0) {
			System.out.println(spot1.toString());
			System.out.println(spot2.toString());
			System.out.println("Both spots are equal");
		}
		else if (spot1.compareTo(spot2)<0) {
			System.out.println(spot1.toString());
			System.out.println(spot2.toString());
			System.out.println("Spot one is less than spot two");
		}
		else {
			System.out.println(spot1.toString());
			System.out.println(spot2.toString());
			System.out.println("Spot one is greater than spot two");
		}
	}

}


/* Screen Dump

Paste the output of your code here

Please enter a weight for puck one between 4 ounces and 5.5 ounces: 
4
Please enter a weight for puck two between 4 ounces and 5.5 ounces: 
5
The puck has a weight of 4.0 ounces, the type of puck is a youth puck
The puck has a weight of 5.0 ounces, the type of puck is a standard puck
The puck weights are not the same :( 
Please enter a weight for spot one between 4 ounces and 5.5 ounces: 
4.5
Please enter a weight for spot two between 4 ounces and 5.5 ounces: 
5.3
The puck has a weight of 4.5 ounces, the type of puck is a youth puck
The puck has a weight of 5.3 ounces, the type of puck is a standard puck
Spot one is less than spot two




Please enter a weight for puck one between 4 ounces and 5.5 ounces: 
4.5
Please enter a weight for puck two between 4 ounces and 5.5 ounces: 
4.5
The puck has a weight of 4.5 ounces, the type of puck is a youth puck
The puck has a weight of 4.5 ounces, the type of puck is a youth puck
The puck weights are the same :)
Please enter a weight for spot one between 4 ounces and 5.5 ounces: 
4.4
Please enter a weight for spot two between 4 ounces and 5.5 ounces: 
4.4
The puck has a weight of 4.4 ounces, the type of puck is a youth puck
The puck has a weight of 4.4 ounces, the type of puck is a youth puck
Both spots are equal




Please enter a weight for puck one between 4 ounces and 5.5 ounces: 
5
Please enter a weight for puck two between 4 ounces and 5.5 ounces: 
5
The puck has a weight of 5.0 ounces, the type of puck is a standard puck
The puck has a weight of 5.0 ounces, the type of puck is a standard puck
The puck weights are the same :)
Please enter a weight for spot one between 4 ounces and 5.5 ounces: 
5
Please enter a weight for spot two between 4 ounces and 5.5 ounces: 
4
The puck has a weight of 5.0 ounces, the type of puck is a standard puck
The puck has a weight of 4.0 ounces, the type of puck is a youth puck
Spot one is greater than spot two

 
 */