
package com.spring.Service;

import com.spring.Dao.LoginDao;
import com.spring.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginService {
    
    @Autowired
    private LoginDao loginDao;
    
    @Override
    public Customer CkeckLogin(String Username, String Password) {
        System.out.println("Check for login in service Impl_class...");
        
        return this.loginDao.CkeckLogin(Username, Password);
    }

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
    
       
}
