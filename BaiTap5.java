package baiTap15_12;

import java.util.Scanner;

public class BaiTap5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// khai bao
		String nameProduct;
		int quantity;
		double price, total = 0;

		// nhap thong tin mat hang
		System.out.println("nhap ten san pham : ");
		nameProduct = scanner.nextLine();
		System.out.println("nhap so luong san pham : ");
		quantity = scanner.nextInt();
		scanner.nextLine();
		System.out.println("nhap gia san pham : ");
		price = scanner.nextDouble();
		// xu ly
		if (quantity >= 50 && quantity <= 100) {
			total = quantity * price * 0.92;
		} else if (quantity > 100) {
			total = (100 * price * 0.92) + ((quantity - 100) * price * 0.88);
		} else {
			total = quantity * price;
		}

		System.out.println(" Số tiền phải trả là : " + total);
		scanner.close();
	}

}
