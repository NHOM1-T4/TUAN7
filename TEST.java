package TKNH;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        TAIKHOANNGANHANG tk = new TAIKHOANNGANHANG("0987654321", "Nguyễn Bửu", 3000000, "nbkvipro");
        
        int tieptuc=1;
        while (tieptuc==1) {
	        System.out.println("Mời quý khách đăng nhập: ");
	        Scanner scanner= new Scanner(System.in);
	    	System.out.print("Nhập chủ tài khoản: ");
	        String dangNhapCTK = scanner.nextLine();
	    	System.out.print("Nhập mật khẩu: ");
	        String dangNhapMK = scanner.nextLine();
	        boolean dangNhapThanhCong = tk.DangNhap(dangNhapCTK, dangNhapMK);
	        if(dangNhapThanhCong){
	        	System.out.println("\nĐăng nhập thành công!");
	        	System.out.println("Thông tin tài khoản quý khách:");
	        	System.out.println("Chủ tài khoản: "+tk.getChuTaiKhoan()+" -- Số tài khoản: "+tk.getSoTaiKhoan()+" -- Số dư: "+tk.getSoDu()+" vnđ");
	        	int thoat=0;
	        	while (thoat==0) {
	                System.out.println("\nChọn thao tác:");
	                System.out.println("1. Gửi tiền");
	                System.out.println("2. Rút tiền");
	                System.out.println("3. Kiểm tra số dư");
	                System.out.println("4. Đổi mật khẩu");
	                System.out.println("5. Đăng xuất");
	                System.out.print("Lựa chọn của bạn: ");
	                int LuaChon = scanner.nextInt();
	                switch (LuaChon) {
	                    case 1:
	                        tk.GuiTien();
	                        break;
	                    case 2:
	                    	tk.RutTien();
	                        break;
	                    case 3:
	                    	tk.KiemTraSoDu();
	                        break;
	                    case 4:
	                        tk.DoiMatKhau();
	                        break;
	                    case 5:
	                    	thoat=1;
	        	        	System.out.println("Đăng xuất thành công!");
	                        break;
	                    default:
	                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
	                }
	            }
	        }
	        else {
	        	System.out.println("\nMật khẩu hoặc tên chủ tài khoản sai!");
	        }
	        System.out.print("\nNhập phím (1) nếu quý khách muốn đăng nhập lại, phím (0) để thoát: ");
	        tieptuc=scanner.nextInt();
			System.out.println("\n-----------------------------\n");
        }
    }
}
