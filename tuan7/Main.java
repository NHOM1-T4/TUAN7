package tuan7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		TaiKhoan tk1 = new TaiKhoan("1234", "le anh duong", 2000, "123");
		Scanner sc = new Scanner(System.in);
		int luaChon;
		do {
			System.out.println("1 . dang nhap");
			System.out.println("2. gui tien");
			System.out.println("3. rut tien");
			System.out.println("4. kiem tra so du tai khoan");
			System.out.println("5. thay doi mat khau");
			System.out.println("6. exit !");
			System.out.println("nhap lua chon: ");
			luaChon = sc.nextInt();
			switch (luaChon) {
			case 1:
				int count = 0;
				do {
					if (tk1.dangNhap() == true) {
						System.out.println("Dang nhap thanh cong !");
						break;
					} else {
						System.out.println("dang nhap that bai");
						count++;
					}
				} while (count < 3);
				if (count >= 3) {
					System.out.println("tai khoan cua ban da bi khoa");
					return;
				}
				break;
			case 2:
				tk1.guiTien();
				break;
			case 3:
				tk1.rutTien();
				break;
			case 4:
				System.out.println("so du tai khoan: " + tk1.getSoDu());
				break;
			case 5:
				tk1.doiMatKhau();
				break;
			case 6:
				System.out.println("exit !");
			}
		} while (luaChon != 6);
	}
}
