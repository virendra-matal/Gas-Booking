
package com.spring.Dao;

import com.spring.model.Customer;

public interface LoginDao {
    
    public Customer CkeckLogin(String Username , String Password);
    
}
