package LAB1;
import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("ax^2 + bx + c = 0:");
        System.out.print("a= ");
        double a = scanner.nextDouble();
        System.out.print("b= ");
        double b = scanner.nextDouble();
        System.out.print("c= ");;
        double c = scanner.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        double canDelta = Math.sqrt(delta);

        System.out.println("Ket qua la: " + canDelta);
    }
	
}
