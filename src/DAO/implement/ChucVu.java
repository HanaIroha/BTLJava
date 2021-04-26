package DAO.implement;

import DAO.IChucVu;
import Mapper.ChucVuMapper;
import Model.ChucVuModel;
import java.util.List;

/**
 *
 * @author Iroha
 */
public class ChucVu extends DataSource<ChucVuModel> implements IChucVu{

    @Override
    public String TimTenChucVu(String MaCV) {
        String sql = "Select * from dbo.ChucVu WHERE MaCV = ?";
        List<ChucVuModel> result = excute(sql, new ChucVuMapper(), MaCV);
        return result.isEmpty() ? null : result.get(0).getTenCV();
    }

    @Override
    public List<ChucVuModel> getChucVu() {
        String sql = "Select * from dbo.ChucVu";
        return excute(sql, new ChucVuMapper());
    }
    
}
