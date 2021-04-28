package DAO;

import Model.NhanSuModel;
import java.util.List;

/**
 *
 * @author Iroha
 */
public interface INhanSu {
    public List<NhanSuModel> getListNhanSu();
    public NhanSuModel getNhanSu(String MaNS);
    public boolean updateAVT(String MaNS, byte[] anh);
    public boolean deleteNS(String MaNS);
    public boolean updatePhongBan(String MaNS, String MaPB);
    public boolean updateChucVu(String MaNS, String MaCV);
    public boolean addNS(int BacLuong, String NgayThamGia, String maNS, String hoTen, String ngaySinh, String queQuan, String danToc, String soDienThoai, String trinhDoHocVan, String ChuyenNganh, String maPB, String maCV, String chinhTri, String doanThe, boolean gioiTinh, byte[] anh);
    public boolean updateNS(int BacLuong, String maNS, String hoTen, String ngaySinh, String queQuan, String danToc, String soDienThoai, String trinhDoHocVan, String ChuyenNganh, String maPB, String maCV, String chinhTri, String doanThe, boolean gioiTinh, byte[] anh);
}
