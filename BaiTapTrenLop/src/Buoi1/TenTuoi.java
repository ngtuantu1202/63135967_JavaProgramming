package Buoi1;
import java.util.Scanner;

public class TenTuoi {
	public static void main(String[] args) {
		int namSinh;
		String hoTen;

		Scanner banPhim = new Scanner(System.in);
		
		System.out.printf("Ho va ten");
		hoTen= banPhim.nextLine();
		
		System.out.printf("Nam sinh");
		namSinh= banPhim.nextInt();
		
		int tuoi = 2024 - namSinh + 1;
		
		System.out.printf("Ho va ten: " + hoTen);
		System.out.printf("\nTuoi: " + tuoi);
		
		
	}

}
