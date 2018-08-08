package program;

import java.util.Scanner;

public class ElectricBIll
{

	public static void main(String[] args)
	{
		int unit;
		double cost;
		Scanner u=new Scanner(System.in);
		System.out.println("enter the unit");
		unit=u.nextInt();
		if (unit>0&&unit<=200)
			cost=unit*0.5;
		else if(unit>200&&unit<=400)
			cost=unit*0.65+100;
		else if(unit>400&&unit<=600)
			cost=unit*0.85+230;
		else
			cost=unit*1+390;
		System.out.println("the cost of the unit "+cost);
			

	}

}
