package baiTap15_12;

import java.util.Scanner;

public class BaiTap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Khai 
		int a,b,c,d,e,f;
		int x = 0, y =0;
		double d1,d2,d3;
		
		String name1, name2, name3, tenSinhVienOXaNhat = "";
		// nhap toa do cua cac sinh vien
		System.out.println("Nhập tên của sinh vien thứ nhất: ");
		name1 = scanner.nextLine();
		System.out.println("Nhập kinh độ của sinh viên thứ nhất: ");
		a = scanner.nextInt();
		System.out.println("Nhập vĩ độ của sinh viên thứ nhất: ");
		b = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Nhập tên của sinh vien thứ hai: ");
		name2 = scanner.nextLine();
		System.out.println("Nhập kinh độ của sinh viên thứ hai: ");
		c = scanner.nextInt();
		System.out.println("Nhập vĩ độ của sinh viên thứ hai: ");
		d = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Nhập tên của sinh vien thứ ba: ");
		name3 = scanner.nextLine();
		System.out.println("Nhập kinh độ của sinh viên thứ ba: ");
		e = scanner.nextInt();
		System.out.println("Nhập vĩ độ của sinh viên thứ ba: ");
		f = scanner.nextInt();
		// tinh khoang cach cua ba sinh vien so voi truong dai hoc
		
		d1 = Math.sqrt((Math.pow((a-x),2)+Math.pow((b-y), 2)));
		d2 = Math.sqrt((Math.pow((c-x),2)+Math.pow((d-y), 2)));
		d3 = Math.sqrt((Math.pow((e-x),2)+Math.pow((f-y), 2)));
		// so sanh chieu dai 
		if (d1 >= d2 && d1 >= d3) {
			tenSinhVienOXaNhat = name1;
		}
		if (d2 >= d3 && d2 >= d1) {
			tenSinhVienOXaNhat = name2;
		}
		if (d3 >= d1 && d3 >= d2) {
			tenSinhVienOXaNhat = name3;
		}
		// xuất ra màn hình sinh viên ở xa trường đại học nhất. 
		System.out.println("sinh viên ở xa trường đại học nhất là: " + tenSinhVienOXaNhat);
		scanner.close();
	}

}
