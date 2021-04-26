package DAO;

import Model.PhongBanModel;
import java.util.List;

/**
 *
 * @author Iroha
 */
public interface IPhongBan {
    public String TimTenPB(String maPB);
    public List<PhongBanModel> getPhongBan();
}
