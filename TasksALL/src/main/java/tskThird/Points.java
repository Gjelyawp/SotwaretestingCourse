package tskThird;

import java.text.DecimalFormat;

public class Points {
	public double x,y;

	public Points(double x, double y){
		this.x = x;
		this.y = y;

	}
		public double Distance (Points p2){
			double d= (Math.sqrt(Math.pow((this.x-p2.x),2)+ Math.pow((this.y-p2.y),2)));
		    return d;
	}
	




}
