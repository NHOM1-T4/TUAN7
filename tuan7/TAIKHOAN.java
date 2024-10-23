import java.util.Scanner;

public class TAIKHOAN {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    private String password;
    Scanner sc;
    
    //hàm khởi tạo TAIKHOAN() và khởi tạo Scanner để sử dụng trong các phương thức nhập dữ liệu
    //Constructor
    public TAIKHOAN(String soTaiKhoan, String chuTaiKhoan, double soDu, String password) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDu;
        this.password=password;
        this.sc = new Scanner(System.in);
    }
    
    public TAIKHOAN() {
        this.sc=new Scanner(System.in);
    }
    
    public void nhapTK(){
        System.out.println("Nhap so tai khoan: ");
        soTaiKhoan=sc.nextLine();
        System.out.println("Nhap ten tai khoan: ");
        chuTaiKhoan=sc.nextLine();
        soDu=0;
        System.out.println("Nhap mat khau: ");
        password=sc.nextLine();
    }
    public void inTK(){
        System.out.println(
                "TAI KHOAN\n"+
                "So tai khoan: "+this.soTaiKhoan+"\n"+
                "Chu tai khoan: "+this.chuTaiKhoan+"\n"+
                "So du: "+this.soDu+"\n"+
                "========================"
        );
    }
    //Xuất ra giá trị hiện tại của thuộc tính SoTaiKhoan 
    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }
    //Gán giá trị mới cho thuộc tính SoTaiKhoan
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //kiểm tra mật khẩu nhập vào có khớp với mkhau đã lưu hay k?
    public boolean kiemTraMatKhau()
    {
        boolean kiemTraPass = false;//dùng để kiểm soát quá trình lặp và dừng lại khi nhập mk đúng
        while(!kiemTraPass)
        {
            System.out.println("Nhap mat khau: ");
            String matkhau=sc.nextLine();
            if(matkhau.equals(password))//equals dùng để so sánh gia stri của 2 chuỗi và trả về true nếu 2 chuỗi bằng nhau
            {
                kiemTraPass=true;
                return true;
            }
            else
                System.out.println("Nhap sai mat khau. Hay nhap lai mat khau.");
        }
        return false;
    }
    
    public void doiMatKhau() 
    {
    boolean kiemTraMKC = false;
    while (!kiemTraMKC) 
    {
        System.out.println("Nhap mat khau cu: ");
        String nhapMK = sc.nextLine();
        boolean kiemTraMKM = false;
        if (nhapMK.equals(password)) //so sánh mk cũ nhập vào với mk đã lưu có khớp hay k
        { 
            while (!kiemTraMKM) 
            {
                System.out.println("Nhap mat khau moi: ");
                String newPassword = sc.nextLine(); 
                
                System.out.println("Xac nhan lai mat khau: ");
                String renewPassword = sc.nextLine(); 
                
                if (newPassword.equals(renewPassword)) 
                {
                    System.out.println("Doi mat khau thanh cong!");
                    password = newPassword; 
                    kiemTraMKM = true; 
                    kiemTraMKC = true;
                } 
                else 
                {
                    System.out.println("Mat khau khong trung khop! Hay nhap lai mat khau moi.");
                }
            }
        } 
        else 
        {
            System.out.println("Mat khau cu khong dung. Xin moi nhap lai mat khau cu!");
        }
    }
}

    //Phương thức gửi tiền
    public void guiTien(){
            if(kiemTraMatKhau())
            {
                double soTien;
                soTien= -1;
                while(soTien<=0)
                {
                    System.out.println("Nhap so tien can gui: ");
                    soTien=sc.nextDouble();
                    sc.nextLine();//xóa dòng mới khi nhập vào 1 số thực để tránh lỗi khi nhập giữa số và chuỗi
                    if(soTien<=0)
                        System.out.println("So tien phai lon hon 0. Xin moi nhap lai!");
                }
                soDu+=soTien;
                System.out.println("""
                                   Gui tien thanh cong!.
                                   So tien hien tai cua ban la:  """+soDu);
            }
    }       
    //Phương thức rút tiền
    public void rutTien(){
        if(kiemTraMatKhau())
        {
            double soTien;
            soTien = -1;
            while(soTien<=0 || soTien > soDu)
            {
                System.out.println("Nhap so tien can rut: ");
                soTien=sc.nextDouble();
                sc.nextLine();
                if(soTien<=0)
                    System.out.println("So tien phai lon hon 0");
                else if(soTien>soDu)
                    System.out.println("So tien vuot qua so du");
            }
            soDu-=soTien;
            System.out.println("""
                               Rut tien thanh cong!
                               So du hien tai cua ban la: """+soDu);
        }
    }
   
    //Phương thức kiểm tra số dư
    public void kiemTra(){
        System.out.println("So du hien tai cua ban la: "+this.soDu);
    }
}
