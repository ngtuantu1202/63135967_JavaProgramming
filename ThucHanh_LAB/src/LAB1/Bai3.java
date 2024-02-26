package LAB1;
import java.util.Scanner;
public class Bai3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Chieu dai: ");
        
        double canh = scanner.nextDouble();
        double theTich = Math.pow(canh, 3);
        
        System.out.println("The tich la: " + theTich);
    }
}