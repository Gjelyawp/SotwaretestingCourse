package tsksecond;

public class Points {
	public double x1,y1,x2,y2;

	public Points(double x1, double y1, double x2, double y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
		public double Distance (){
		double d= Math.sqrt(Math.pow((this.x1-this.x2),2)+ Math.pow((this.y1-this.y2),2));
		return d;
	}
	




}
