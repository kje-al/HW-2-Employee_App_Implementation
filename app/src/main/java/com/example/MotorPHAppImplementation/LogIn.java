/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.MotorPHAppImplementation;

/**
 *
 * @author admin
 */
public class LogIn {
    private String userLogin;
    private String userPassword;
    
    public LogIn (String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
    }
    
    //getters
    public String getUserLogin () {
        return userLogin;
    }
    
    public String getUserPassword() {
        return userPassword;
    }
    
    //setters
    public void setUserLogin() {
        this.userLogin = userLogin;
    }
    
    public void setUserPassword() {
        this.userPassword = userPassword;
    }
}
