package Understanding_Ioc.Dao.Impl;

import Understanding_Ioc.Dao.AccountDao;

public class ImpAccountDao implements AccountDao {
    public void SaveAccount() {
        System.out.println("The Account has been saved.");
    }
}
