/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author virendra
 */

@Entity
@Table(name = "customer")
public class Customer implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CutsomerId", length = 10, nullable = false, unique = true)
    private int CutsomerId;
    @Column(name = "Username", length = 200, nullable = false, unique = true)
    private String Username;
    @Column(name = "Password", length = 45, nullable = false, unique = true)
    private  String Password;

    public Customer() {
    }

    public Customer(int CutsomerId, String Username, String Password) {
        this.CutsomerId = CutsomerId;
        this.Username = Username;
        this.Password = Password;
    }

    public int getCutsomerId() {
        return CutsomerId;
    }

    public void setCutsomerId(int CutsomerId) {
        this.CutsomerId = CutsomerId;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Customer{" + "CutsomerId=" + CutsomerId + ", Username=" + Username + ", Password=" + Password + '}';
    }
    
    
    
    
}
