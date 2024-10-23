

public class TAIKHOAN {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String matKhau;

    // Constructor đầy đủ thông tin
    public TAIKHOAN(String soTaiKhoan, String chuTaiKhoan, double soDu, String matKhau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu > 0 ? soDu : 0; // Đảm bảo số dư không âm
        this.matKhau = matKhau;
    }

    // Constructor với số dư mặc định là 0
    public TAIKHOAN(String soTaiKhoan, String chuTaiKhoan, String matKhau) {
        this(soTaiKhoan, chuTaiKhoan, 0, matKhau);
    }

    // Getter và Setter
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
        if (soDu >= 0) {
            this.soDu = soDu;
        } else {
            System.out.println("Số dư không thể là số âm.");
        }
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    // Phương thức gửi tiền
    public void guiTien(double tienGui) {
        if (tienGui > 0) {
            soDu += tienGui;
            System.out.println("Gửi thành công " + tienGui + " vào tài khoản của " + chuTaiKhoan + ".");
        } else {
            System.out.println("Số tiền gửi phải lớn hơn 0.");
        }
    }

    // Phương thức rút tiền
    public void rutTien(double tienRut) {
        if (tienRut > 0) {
            if (tienRut <= soDu) {
                soDu -= tienRut;
                System.out.println("Rút thành công " + tienRut + " từ tài khoản " + chuTaiKhoan + ".");
            } else {
                System.out.println("Số tiền rút vượt quá số dư hiện tại.");
            }
        } else {
            System.out.println("Số tiền rút phải lớn hơn 0.");
        }
    }

    // Phương thức kiểm tra số dư
    public void kiemTraSoDu() {
        System.out.println("Số dư hiện tại của " + chuTaiKhoan + ": " + soDu);
    }

    // Phương thức đổi mật khẩu
    public boolean doiMatKhau(String matKhauCu, String matKhauMoi) {
        if (this.matKhau.equals(matKhauCu)) {
            this.matKhau = matKhauMoi;
            System.out.println("Đổi mật khẩu thành công!");
            return true;
        } else {
            System.out.println("Mật khẩu cũ không đúng. Đổi mật khẩu thất bại.");
            return false;
        }
    }
}