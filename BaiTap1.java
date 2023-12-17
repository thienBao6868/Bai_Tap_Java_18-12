package baiTap15_12;

import java.util.Scanner;

public class BaiTap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);

        // Khai báo biến cho thông tin của 3 sinh viên
        String name1, name2, name3;
        int birthYear1, birthYear2, birthYear3;

        // Nhập thông tin cho sinh viên thứ nhất
        System.out.println("Nhập tên của sinh viên thứ nhất: ");
        name1 = scanner.nextLine();
        System.out.println("Nhập năm sinh của sinh viên thứ nhất: ");
        birthYear1 = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng thừa sau khi đọc một số để xử lý Enter

        // Nhập thông tin cho sinh viên thứ hai
        System.out.println("Nhập tên của sinh viên thứ hai: ");
        name2 = scanner.nextLine();
        System.out.println("Nhập năm sinh của sinh viên thứ hai: ");
        birthYear2 = scanner.nextInt();
        scanner.nextLine();

        // Nhập thông tin cho sinh viên thứ ba
        System.out.println("Nhập tên của sinh viên thứ ba: ");
        name3 = scanner.nextLine();
        System.out.println("Nhập năm sinh của sinh viên thứ ba: ");
        birthYear3 = scanner.nextInt();


        // Tìm sinh viên trẻ nhất
        String youngestName;
        int youngestBirthYear;

        if (birthYear1 >= birthYear2 && birthYear1 >= birthYear3) {
            youngestName = name1;
            youngestBirthYear = birthYear1;
        } else if (birthYear2 >= birthYear1 && birthYear2 >= birthYear3) {
            youngestName = name2;
            youngestBirthYear = birthYear2;
        } else {
            youngestName = name3;
            youngestBirthYear = birthYear3;
        }

        // Xuất thông tin sinh viên trẻ nhất
        System.out.println("Sinh viên trẻ nhất là: " + youngestName);
        System.out.println("Năm sinh: " + youngestBirthYear);

        scanner.close();

	}

}
