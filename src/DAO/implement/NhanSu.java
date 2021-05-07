package DAO.implement;

import DAO.INhanSu;
import Mapper.NhanSuMapper;
import Model.NhanSuModel;
import java.util.List;

/**
 *
 * @author Iroha
 */
public class NhanSu extends DataSource<NhanSuModel> implements INhanSu{

    @Override
    public List<NhanSuModel> getListNhanSu() {
        String sql = "Select * from dbo.NhanSu";
        return excute(sql, new NhanSuMapper());
    }

    @Override
    public boolean updateNS(int BacLuong, String maNS, String hoTen, String ngaySinh, String queQuan, String danToc, String soDienThoai, String trinhDoHocVan, String ChuyenNganh, String maPB, String maCV, String chinhTri, String doanThe, boolean gioiTinh, byte[] anh, String thayDoiCuoi) {
        String sql = "UPDATE dbo.NhanSu SET HoTen=?, NgaySinh=?, QueQuan=?, GioiTinh=?, DanToc=?, SoDienThoai=?, TrinhDoHocVan=?, ChuyenNganh=?, MaPB=?, MaCV = ?, ChinhTri=?, DoanThe=?, BacLuong=?, Anh=?, SuaCuoi=? WHERE MaNS=?";
        return update(sql, hoTen, ngaySinh, queQuan, gioiTinh, danToc, soDienThoai, trinhDoHocVan, ChuyenNganh, maPB, maCV, chinhTri, doanThe, BacLuong, anh, thayDoiCuoi, maNS);
    }

    @Override
    public NhanSuModel getNhanSu(String MaNS) {
        String sql = "Select * from dbo.NhanSu WHERE MaNS=?";
        List<NhanSuModel> result = excute(sql, new NhanSuMapper(), MaNS);
        return result.isEmpty() ? null : result.get(0);
    }

    @Override
    public boolean updateAVT(String MaNS, byte[] anh) {
        String sql = "Update dbo.NhanSu SET Anh=? WHERE MaNS=?";
        return update(sql, anh, MaNS);
    }

    @Override
    public boolean addNS(int BacLuong, String NgayThamGia, String maNS, String hoTen, String ngaySinh, String queQuan, String danToc, String soDienThoai, String trinhDoHocVan, String ChuyenNganh, String maPB, String maCV, String chinhTri, String doanThe, boolean gioiTinh, byte[] anh, String thayDoiCuoi) {
        String sql = "INSERT INTO dbo.NhanSu VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        return insert(sql, maNS, hoTen, ngaySinh, queQuan, gioiTinh, danToc, soDienThoai, trinhDoHocVan, ChuyenNganh, maPB, maCV, chinhTri, doanThe, BacLuong, anh, NgayThamGia, thayDoiCuoi);
    }

    @Override
    public boolean deleteNS(String MaNS) {
        String sql = "Delete from dbo.NhanSu Where MaNS=?";
        return update(sql, MaNS);
    }

    @Override
    public boolean updatePhongBan(String MaNS, String MaPB, String ThayDoiCuoi) {
        String sql = "UPDATE dbo.NhanSu SET MaPB=?, SuaCuoi=? WHERE MaNS=?";
        return update(sql, MaPB, ThayDoiCuoi, MaNS);
    }

    @Override
    public boolean updateChucVu(String MaNS, String MaCV, String ThayDoiCuoi) {
        String sql = "UPDATE dbo.NhanSu SET MaCV=?, SuaCuoi=? WHERE MaNS=?";
        return update(sql, MaCV, ThayDoiCuoi, MaNS);
    }
    
}
