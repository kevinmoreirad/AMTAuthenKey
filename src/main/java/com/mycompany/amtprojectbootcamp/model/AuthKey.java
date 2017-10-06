/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.amtprojectbootcamp.model;

/**
 *
 * @author kevin moreira
 */
public class AuthKey {

    private char[] authKey;
    private Date startDate;
    private Date endDate;

    public AuthKey(char[] authKey, Date startDate, Date endDate) {
        this.authKey = authKey;
        this.startDate = startDate;
        this.endDate = endDate;
    }
   
    
    public char[] getAuthKey() {
        return authKey;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    
    
}
