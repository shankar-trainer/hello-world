package org.com.controller;

import org.com.dao.WalletAccountDao;
import org.com.dao.WalletUserDao;
import org.com.model.WalletUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/prd")
@CrossOrigin("http://localhost:4200")
public class WalletCreationController {

    @Autowired
    WalletUserDao userDao;

    @Autowired
    WalletAccountDao accountDao;

    @PostMapping("/addUser")
    public String addUser(@RequestBody WalletUser walletUser) {

        Optional<WalletUser> findById = userDao.findById(walletUser.getUserId());
        if (!findById.isPresent()) {
            userDao.save(walletUser);
            return "user added";
        }
        return "user already present";
    }

    @DeleteMapping("/deleteUser/{id}")
    public String removeUser(@PathVariable("id") int uid) {

        Optional<WalletUser> findById = userDao.findById(uid);
        if (!findById.isPresent()) {
            userDao.deleteById(uid);
            return "user removed";
        }
        return "user not present";
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody WalletUser walletUser) {

        Optional<WalletUser> findById = userDao.findById(walletUser.getUserId());
        if (findById.isPresent()) {
            userDao.save(walletUser);
            return "user updated";
        }
        return "user not present";
    }

    @RequestMapping("/getAll")
    public List<WalletUser> getAllUser() {
       return  userDao.findAll();
    }

        @RequestMapping("/showUser/{id}")
    public WalletUser showUser(@PathVariable("id") int uid) {

        Optional<WalletUser> findById = userDao.findById(uid);
        if (findById.isPresent()) {
            WalletUser walletUser = findById.get();
            return walletUser;
        }
        return null;
    }
}
