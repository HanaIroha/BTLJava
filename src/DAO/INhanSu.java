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
    public boolean upadteAVT(String MaNS, byte[] anh);
    public boolean updateNS(int BacLuong, double PhuCap, String maNS, String hoTen, String ngaySinh, String queQuan, String danToc, String soDienThoai, String trinhDoHocVan, String ChuyenNganh, String maPB, String maCV, String chinhTri, String doanThe, boolean gioiTinh, byte[] anh);
}
