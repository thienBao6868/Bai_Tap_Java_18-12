package baiTap15_12;

import java.util.Scanner;

public class BaiTap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, n = 0, m = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Vao so nguyen thu nhat: ");
		a = sc.nextInt();
		System.out.println("Nhap Vao so nguyen thu hai: ");
		b = sc.nextInt();
		System.out.println("Nhap Vao so nguyen thu ba: ");
		c = sc.nextInt();
		if (a % 2 == 0) {
			n += 1;
		} else {
			m += 1;
		}
		if (b % 2 == 0) {
			n += 1;
		} else {
			m += 1;
		}
		if (c % 2 == 0) {
			n += 1;
		} else {
			m += 1;
		}

		System.out.println("Trong 3 so co " + n + " so chan va " + m + " so le ");
	}

}
