
import java.util.Scanner;
public class MAIN {
	 
	    	   public static void main(String[] args) {
	    	        Scanner scanner = new Scanner(System.in);

	    	        // Tạo tài khoản với thông tin mẫu
	    	        TAIKHOAN taiKhoan = new TAIKHOAN("123456789", "Nguyen Van A", 5000.0, "1234");

	    	        System.out.println("Tài khoản đã được tạo thành công!");
	    	        taiKhoan.kiemTraSoDu();

	    	        // Gửi tiền
	    	        System.out.print("Nhập số tiền bạn muốn gửi: ");
	    	        double tienGui = scanner.nextDouble();
	    	        taiKhoan.guiTien(tienGui);
	    	        taiKhoan.kiemTraSoDu();

	    	        // Rút tiền
	    	        System.out.print("Nhập số tiền bạn muốn rút: ");
	    	        double tienRut = scanner.nextDouble();
	    	        taiKhoan.rutTien(tienRut);
	    	        taiKhoan.kiemTraSoDu();

	    	        // Đổi mật khẩu
	    	        System.out.print("Nhập mật khẩu cũ: ");
	    	        String matKhauCu = scanner.next();
	    	        System.out.print("Nhập mật khẩu mới: ");
	    	        String matKhauMoi = scanner.next();
	    	        boolean doiMatKhauThanhCong = taiKhoan.doiMatKhau(matKhauCu, matKhauMoi);

	    	        if (doiMatKhauThanhCong) {
	    	            System.out.println("Bạn đã đổi mật khẩu thành công!");
	    	        } else {
	    	            System.out.println("Đổi mật khẩu không thành công. Vui lòng thử lại.");
	    	        }

	    	        scanner.close();
	    	    }
	    	}