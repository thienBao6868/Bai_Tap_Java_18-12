package baiTap15_12;

import java.util.Scanner;

public class BaiTap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// Khai bao bien
		String name1, name2, name3, youngest = "";
		String sexOfName1, sexOfName2, sexOfName3;
		int birthYear1, birthYear2, birthYear3, birthYear, oldestBirthYear = 0;

		System.out.println("Nhập tên của cán bộ thứ nhất: ");
		name1 = scanner.nextLine();
		System.out.println("Nhập giới tính của cán bộ thứ nhất (nam/nu): ");
		sexOfName1 = scanner.nextLine();
		System.out.println("Nhập năm sinh của cán bộ thứ nhất: ");
		birthYear1 = scanner.nextInt();
		scanner.nextLine(); // Đọc dòng thừa sau khi đọc một số để xử lý Enter

		System.out.println("Nhập tên của cán bộ thứ hai: ");
		name2 = scanner.nextLine();
		System.out.println("Nhập giới tính của cán bộ thứ hai (nam/nu): ");
		sexOfName2 = scanner.nextLine();
		System.out.println("Nhập năm sinh của cán bộ thứ hai: ");
		birthYear2 = scanner.nextInt();
		scanner.nextLine(); // Đọc dòng thừa sau khi đọc một số để xử lý Enter

		System.out.println("Nhập tên của cán bộ thứ ba: ");
		name3 = scanner.nextLine();
		System.out.println("Nhập giới tính của cán bộ thứ ba (nam/nu): ");
		sexOfName3 = scanner.nextLine();
		System.out.println("Nhập năm sinh của cán bộ thứ ba: ");
		birthYear3 = scanner.nextInt();
		// xu ly
		if (birthYear1 > birthYear2) {
			if (sexOfName1.equals("nam")) {
				youngest = name1;
				oldestBirthYear = birthYear1;
			} else {
				if (sexOfName2.equals("nam")) {
					youngest = name2;
					oldestBirthYear = birthYear2;
				}
			}
		}

		else {
			if (sexOfName2.equals("nam")) {
				youngest = name2;
				oldestBirthYear = birthYear2;
			}
		}

		if (youngest.equals("")) {
			if (sexOfName3.equals("nam")) {
				youngest = name3;
			} else {
				youngest = "Không có ai là nam ";
			}
		} else {
			if (birthYear3 > oldestBirthYear) {
				if (sexOfName3.equals("nam")) {
					youngest = name3;
				}
			}
		}
		// xuat ra man hinh
		System.out.print("Cán bộ trẻ nhất là: " + youngest);
	}
}
