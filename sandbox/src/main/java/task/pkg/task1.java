package task.pkg;

public class task1 {

	public static void main(String[] args) {

     System.out.println("Task #1");
	 Square s = new Square(5);

	 Rectangle r = new Rectangle(5,6);


     System.out.println("Квадрат со стороной l="+ s.l + " S="+ Calc(s));
	 System.out.println("Квадрат со сторонами a="+ r.a + " b="+ r.b +" S="+ Calc(r));
	}
    public static double Calc (Square s){
     return s.l * s.l;
    }
	public static double Calc (Rectangle r){
		return r.a * r.b;
	}
}