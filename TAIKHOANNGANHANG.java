package TKNH;

import java.util.Scanner;

public class TAIKHOANNGANHANG {
	private String soTaiKhoan;
	private String chuTaiKhoan;
	private double soDu;
	private String matKhau;
	
	public String getSoTaiKhoan() {return soTaiKhoan;}
	public void setSoTaiKhoan(String soTaiKhoan) {this.soTaiKhoan = soTaiKhoan;}
	public String getChuTaiKhoan() {return chuTaiKhoan;}
	public void setChuTaiKhoan(String chuTaiKhoan) {this.chuTaiKhoan = chuTaiKhoan;}
	public double getSoDu() {return soDu;}
	public void setSoDu(double soDu) {this.soDu = soDu;}
	public String getMatKhau() {return matKhau;}
	public void setMatKhau(String matKhau) {this.matKhau = matKhau;}
	
	public TAIKHOANNGANHANG(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		this.soDu = soDu;
		this.matKhau = matKhau;
	}
	
	public TAIKHOANNGANHANG(String soTaiKhoan, String chuTaiKhoan, String matKhau) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		this.matKhau = matKhau;
	}
	
	public boolean DangNhap(String dangNhapCTK, String dangNhapMK) {
        if (this.chuTaiKhoan.equals(dangNhapCTK) && this.matKhau.equals(dangNhapMK))
        	return true;
        else
        	return false;
	}
	
	public void GuiTien() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Nhập số tiền gửi: ");
        double soTienGui = scanner.nextDouble();
        if (soTienGui > 0) {
            soDu += soTienGui;
            System.out.println("Đã gửi " + soTienGui + " vào tài khoản "+chuTaiKhoan+" ("+soTaiKhoan+")");
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }
	
    public void RutTien() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Nhập số tiền rút: ");
        double soTienRut = scanner.nextDouble();
        if (soTienRut > 0 && soTienRut <= soDu) {
            soDu -= soTienRut;
            System.out.println("Đã rút " + soTienRut + " từ tài khoản "+chuTaiKhoan+" ("+soTaiKhoan+")");
        } else if (soTienRut > soDu) {
            System.out.println("Không đủ số dư để rút.");
        } else {
            System.out.println("Số tiền rút phải lớn hơn 0.");
        }
    }
    
    public void KiemTraSoDu() {
        System.out.println("Số dư hiện tại của tài khoản "+chuTaiKhoan+" ("+soTaiKhoan+") là: "+soDu+" vnđ");
    }
	
    public void DoiMatKhau() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("Nhập mật khẩu cũ: ");
        String MKcu = scanner.nextLine();
        if (this.matKhau.equals(MKcu)) {
        	System.out.print("Nhập mật khẩu mới: ");
            String MKmoi = scanner.nextLine();
            matKhau=MKmoi;
            System.out.println("Đổi mật khẩu mới thành công!");
        }
        else 
        	System.out.println("Sai mật khẩu. Đổi mật khẩu thất bại!");
     }
}









