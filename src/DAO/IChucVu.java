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
}
