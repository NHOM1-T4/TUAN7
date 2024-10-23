import java.util.ArrayList;
import java.util.List;

public class DANHSACHTAIKHOAN {
    //danh sách chứa các đối tượng thuộc kiểu TAIKHOAN
    private List<TAIKHOAN> danhsachTK;
     
    //Constructor

    public DANHSACHTAIKHOAN() {
        this.danhsachTK = new ArrayList<>();
    }
    
    public void themTK(TAIKHOAN tk){
        danhsachTK.add(tk);// Phương thức add của danh sách danhsachTK được gọi để thêm đối tượng tài khoản tk vào cuối danh sách.
    }
    
    public void inDanhSach(){
        if(danhsachTK.isEmpty())//kiểm tra xem danh sách tài khoản (danhsachTK) có trống hay không
            System.out.println("Danh sach tài khoan trong!");
        else
        {
            System.out.println("Danh sach tai khoan: ");
            for(TAIKHOAN tk : danhsachTK)//duyệt từng đối tượng trong tài khoản
                tk.inTK();
        }  
    }
    
     public TAIKHOAN timTaiKhoan(String soTaiKhoan) {
        for (TAIKHOAN tk : danhsachTK) {
            if (tk.getSoTaiKhoan().equals(soTaiKhoan)) {
                return tk; // Trả về tài khoản nếu tìm thấy
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }
}
