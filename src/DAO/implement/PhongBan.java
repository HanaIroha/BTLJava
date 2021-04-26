package DAO.implement;

import DAO.IPhongBan;
import Mapper.PhongBanMapper;
import Model.PhongBanModel;
import java.util.List;

/**
 *
 * @author Iroha
 */
public class PhongBan extends DataSource<PhongBanModel> implements IPhongBan{

    @Override
    public String TimTenPB(String maPB) {
        String sql = "Select * from dbo.PhongBan WHERE MaPB = ?";
        List<PhongBanModel> result = excute(sql, new PhongBanMapper(), maPB);
        return result.isEmpty() ? null : result.get(0).getTenPB();
    }

    @Override
    public List<PhongBanModel> getPhongBan() {
        String sql = "Select * from dbo.PhongBan";
        return excute(sql, new PhongBanMapper());
    }
    
}
