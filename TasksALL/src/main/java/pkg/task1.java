package pkg;

public class task1 {

	public static void main(String[] args) {

     System.out.println("Task #1");
	 Square s = new Square(5);
	 Rectangle r = new Rectangle(5,6);
     System.out.println("Квадрат со стороной l="+ s.l + " S="+ s.Calc());
	 System.out.println("Квадрат со сторонами a="+ r.a + " b="+ r.b +" S="+ r.Calc());
	}


}