package DAO;

import Model.ChucVuModel;
import java.util.List;

/**
 *
 * @author Iroha
 */
public interface IChucVu {
    public String TimTenChucVu(String MaCV);
    public List<ChucVuModel> getChucVu();
    public boolean xoaCV(String MaCV);
    public boolean suaCV(String maCV, String tenCV, double phuCap);
    public boolean themCV(String maCV, String tenCV, double phuCap);
}
