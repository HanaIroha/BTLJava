package DAO.implement;

import DAO.IBacLuong;
import Mapper.BacLuongMapper;
import Model.BacLuongModel;
import java.util.List;

/**
 *
 * @author Iroha
 */
public class BacLuong extends DataSource<BacLuongModel> implements IBacLuong{

    @Override
    public List<BacLuongModel> getBacLuong() {
        String sql = "Select * from dbo.BacLuong";
        return excute(sql, new BacLuongMapper());
    }
    
}
