/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.c_076;

/**
 *
 * @author Murilo
 */
public class C_076 {

    public static void main(String[] args) {
        
        IDandPasswords idandPasswords = new IDandPasswords();
        
        LoginPage lp = new LoginPage(idandPasswords.getLoginInfo());
        
    }
}
