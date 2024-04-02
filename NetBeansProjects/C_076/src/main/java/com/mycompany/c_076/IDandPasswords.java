/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.c_076;

import java.util.*;

/**
 *
 * @author Murilo
 */
public class IDandPasswords {
    
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    
    IDandPasswords(){
        
        loginInfo.put("Murilo", "123");
        loginInfo.put("Hammer", "456");
        loginInfo.put("Mirtilo", "789");
    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(HashMap<String, String> loginInfo) {
        this.loginInfo = loginInfo;
    }
    
    
}
