package DAO.implement;

import DAO.IAccount;
import Mapper.AccountMapper;
import Model.AccountModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Iroha
 */
public class Account extends DataSource<AccountModel> implements IAccount{

    @Override
    public AccountModel loginAccount(String username, String password) {
        String sql = "Select * from dbo.TaiKhoan where TenTaiKhoan = ? AND MatKhau = ?";
        List<AccountModel> result = excute(sql, new AccountMapper(), username, password);
        return result.isEmpty() ? null : result.get(0);
    }

    @Override
    public boolean createAccount(String username, String password, String name, byte[] anh) {
        String sql = "insert into dbo.TaiKhoan values (?,?,?,?)";
        return insert(sql, username, password, name, anh);
    }

    @Override
    public boolean updateAvatar(String username, byte[] anh) {
        String sql = "Update dbo.TaiKhoan SET Anh = ? WHERE TenTaiKhoan = ?";
//        return update(sql, anh, username);
        
        Connection connection = null;
        PreparedStatement ps = null;
        try{
            connection = getConnection();
            connection.setAutoCommit(false);
            ps = connection.prepareStatement(sql);
            ps.setBytes(1, anh);
            ps.setString(2, username);
            ps.executeUpdate();
            connection.commit();
            return true;
        }catch (SQLException e){
            try{
                connection.rollback();
            }catch (SQLException ex){
                e.printStackTrace();
            }
            return false;
        }finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                return false;
            }
        }
    }
    
}
