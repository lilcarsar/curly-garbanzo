package disk;

public class Puck {
	
	


	private double weight;
	private boolean standard;
	private boolean youth;
	
public Puck(double g) {
		
	weight = g;
		if(weight >= 5.0 && weight <= 5.5) 
		{
			standard = true;
			}
	
	if(weight >= 4.0 && weight <= 4.5) 
	{
			standard =  false;
	
	}}

	

	public double getWeight() {
		
		return(weight);
	}

	
	public String getDivision() {
		String rep;
		
		if(standard) {
			rep = "standard";
		}
		else{
			rep = "youth";
		}
			return rep;
	}
	
	public String toString() {
		String ans;
		
		ans = "The puck has a weight of "+ getWeight()+ " ounces, the type of puck is "+ getDivision();
		return ans;
	}
}

