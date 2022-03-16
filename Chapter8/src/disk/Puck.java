/*

Program: Puck.java          Last Date of this Revision: March 16, 2022

Purpose:Create a class that asks for weights of 2 pucks to test the weights against each other using getWeight(),getDivision(), equals(),
and toString().

Author: Carter Sarney 
School: CHHS
Course: Computer Programming 30
 

*/
package disk;

public class Puck implements Comparable {
	
	


	private double weight;
	private boolean standard;
	private boolean youth;
	
public Puck(double g) {
		
	weight = g;
		if(weight >= 5.0 && weight <= 5.5) 
		{
			standard = true;
			youth = false;
			}
	
	if(weight >= 4.0 && weight <= 4.5) 
	{
			youth = true;
			standard =  false;
	
	}
	if (weight > 5.5 && weight< 4.0) {
		standard = false;
		youth = false;
	}
	}

	

	public double getWeight() {
		
		return(weight);
	}

	
	public String getDivision() {
		String rep;
		
		if(standard) {
			rep = "a standard puck";
		}
		else if(youth){
			rep = "a youth puck";
		}
		else {
			rep = "not a standard puck or a youth puck";
		}
			return rep;
	}
	
	public String toString() {
		String ans;
		
		ans = "The puck has a weight of "+ getWeight()+ " ounces, the type of puck is "+ getDivision();
		return ans;
	}
	
	public boolean equals(Object d) {
		Puck disk = (Puck)d;
		
		if (disk.getDivision() == getDivision()) {
			return(true);
		}
		else {
			return(false);
		}
	}
	
	public int compareTo(Object s) {
		Puck obj = (Puck)s;
		
		if (weight < obj.getWeight()) {
			return(-1);
		}
		else if (weight == obj.getWeight()) {
			return(0);
		}
		else {
			return(1);
		}
	}
		
	}


