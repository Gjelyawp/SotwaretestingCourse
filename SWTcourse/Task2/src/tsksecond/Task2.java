package tsksecond;
import java.util.Scanner;

public class Task2 {

	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Введите x1:");
		double x1 = in.nextDouble();
		System.out.println("Введите у1=");
		double y1 = in.nextDouble();
		System.out.println("Введите х2=");
		double x2 = in.nextDouble();
		System.out.println("Введите у2=");
		double y2 = in.nextDouble();
		Points p = new Points(x1,y1,x2,y2);
		System.out.println("Точка A("+p.x1+","+p.y1+")");
		System.out.println("Точка B("+p.x2+","+p.y2+")");
		System.out.println("Расстояние между точками А и B "+ " D="+ p.Distance());
	}
}
