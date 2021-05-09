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

    @Override
    public boolean CheckBacLuong(int bacLuong) {
        String sql = "Select * from dbo.BacLuong WHERE BacLuong=?";
        List<BacLuongModel> ls = excute(sql, new BacLuongMapper(), bacLuong);
        return ls.isEmpty()?false:true;
    }

    @Override
    public boolean ThemBacLuong(int bacLuong, double heSoLuong) {
        String sql = "Insert into dbo.BacLuong values (?,?)";
        return insert(sql, bacLuong, heSoLuong);
    }

    @Override
    public boolean XoaBacLuong(int bacLuong) {
        String sql = "Delete from dbo.BacLuong where BacLuong=?";
        return update(sql, bacLuong);
    }

    @Override
    public boolean SuaBacLuong(int bacLuong, double heSoLuong) {
        String sql = "UPDATE dbo.BacLuong SET HeSoLuong=? WHERE BacLuong=?";
        return update(sql, heSoLuong, bacLuong);
    }

    @Override
    public double getHeSoLuong(int bacLuong) {
        String sql = "Select * from dbo.BacLuong WHERE BacLuong = ?";
        List<BacLuongModel> result = excute(sql, new BacLuongMapper(), bacLuong);
        return result.isEmpty() ? null : result.get(0).getHeSoLuong();
    }
    
}
