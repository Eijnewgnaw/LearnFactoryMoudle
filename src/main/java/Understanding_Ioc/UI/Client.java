package Understanding_Ioc.UI;

import Understanding_Ioc.Factory.BeanFactory;
import Understanding_Ioc.Service.AccountService;
import Understanding_Ioc.Service.Impl.ImpAccountService;

public class Client {
    public static void main(String[] args) {
//        AccountService as = new ImpAccountService();
        AccountService as =(ImpAccountService) BeanFactory.getBean("AccountService");
        as.SaveAccount();
    }
}
