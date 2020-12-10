package Understanding_Ioc.Service.Impl;

import Understanding_Ioc.Dao.AccountDao;
import Understanding_Ioc.Dao.Impl.ImpAccountDao;
import Understanding_Ioc.Factory.BeanFactory;
import Understanding_Ioc.Service.AccountService;

public class ImpAccountService implements AccountService {
//    private AccountDao accountDao = new ImpAccountDao();
    private AccountDao accountDao =(ImpAccountDao) BeanFactory.getBean("AccountDao");
    public void SaveAccount() {
        accountDao.SaveAccount();
    }
}
