package tuan7;

import java.util.Scanner;

public class TaiKhoan {
	private String soTaiKhoan;
	private String chuTaiKhoan;
	private double soDu;
	private String matKhau;

	public TaiKhoan(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.chuTaiKhoan = chuTaiKhoan;
		this.soDu = soDu;
		this.matKhau = matKhau;
	}

	public String getSoTaiKhoan() {
		return soTaiKhoan;
	}

	public void setSoTaiKhoan(String soTaiKhoan) {
		this.soTaiKhoan = soTaiKhoan;
	}

	public String getChuTaiKhoan() {
		return chuTaiKhoan;
	}

	public void setChuTaiKhoan(String chuTaiKhoan) {
		this.chuTaiKhoan = chuTaiKhoan;
	}

	public double getSoDu() {
		return soDu;
	}

	public void setSoDu(double soDu) {
		this.soDu = soDu;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public void guiTien() {
		Scanner sc = new Scanner(System.in);
		float soTienCanGui;
		System.out.println("nhap so tien can gui: ");
		soTienCanGui = sc.nextFloat();
		if (soTienCanGui > 0) {
			System.out.println("gui tien thanh cong !");
			this.soDu = soDu + soTienCanGui;
		} else
			System.out.println("so tien phai lon hon 0 !");
	}

	public void rutTien() {
		float soTienRut;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so tien can rut: ");
		soTienRut = sc.nextFloat();
		if (this.soDu >= soTienRut && soTienRut > 0) {
			System.out.println("rut tien thanh cong !");
			this.soDu = soDu - soTienRut;
		} else
			System.out.println("so tien trong tai khoan khong du de rut");
	}

	public boolean dangNhap() {
		Scanner sc = new Scanner(System.in);
		String DnhapTk;
		String DnhapMk;
		System.out.println("nhap so tai khoan: ");
		DnhapTk = sc.nextLine();
		System.out.println("nhap mat khau: ");
		DnhapMk = sc.nextLine();
		return (this.soTaiKhoan.equals(DnhapTk) && this.matKhau.equals(DnhapMk));
	}

	public void doiMatKhau() {
		Scanner sc = new Scanner(System.in);
		String matKhauCu;
		int dem = 0;
		do {
			System.out.println("nhap mat khau cu: ");
			matKhauCu = sc.nextLine();
			if (this.matKhau.equals(matKhauCu)) {
				String matKhaumoi;
				System.out.println("nhap mat khau moi: ");
				matKhaumoi = sc.nextLine();
				setMatKhau(matKhaumoi);
				System.out.println("thay doi mat khau thanh cong !");
				return;
			} else {
				System.out.println("mat khau khong hop le");
				dem++;
			}
		} while (!this.matKhau.equals(matKhauCu) && dem <= 2);
		if (dem > 2)
			System.out.println("tai khai cua ban da bi khoa");
	}
}
