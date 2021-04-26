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
    
}
