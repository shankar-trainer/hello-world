package org.com;

import org.com.dao.WalletUserDao;
import org.com.model.WalletAccount;
import org.com.model.WalletUser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WalletCreationApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(WalletCreationApplication.class, args);

        WalletUserDao dao = ctx.getBean(WalletUserDao.class);

        //WalletUser user=new WalletUser();
        WalletUser user;

        String name[] = {"ram kumar", "suman kumar", "aman kumar", "suresh kumar", "umesh kumar"};

        for (int x = 0; x < name.length; x++) {
            user = null;
            user = new WalletUser();
            user.setLoginName("ram kumar");
            user.setPassword("abcdefg");
            user.setPhoneNumber(677676767);
            user.setUserName("user1");

            WalletAccount account = new WalletAccount();
            account.setStatus("credited");
            account.setAccountBalance(400000);
            user.setWalletAccount(account);
            dao.save(user);
        }
    }
}
