package LAB1;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Chieu dai: ");
        double dai = scanner.nextDouble();
        
        System.out.print("Chieu rong: ");
        double rong = scanner.nextDouble();
        
        double chuVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double canhNhoNhat = Math.min(dai, rong);
        
        System.out.println("Chu vi la: " + chuVi);
        System.out.println("Dien tich la: " + dienTich);
        System.out.println("Canh nho nhat la: " + canhNhoNhat);
    }
}
