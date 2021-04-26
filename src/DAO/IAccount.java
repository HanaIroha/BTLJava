package DAO;

import Model.AccountModel;

/**
 *
 * @author Iroha
 */
public interface IAccount {
    public AccountModel loginAccount(String username, String password);
    public boolean createAccount(String username, String password, String name, byte[] anh);
    public boolean updateAvatar(String username, byte[] anh);
}
