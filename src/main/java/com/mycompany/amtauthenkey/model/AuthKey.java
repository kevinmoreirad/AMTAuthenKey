/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.amtauthenkey.model;

import java.util.Date;

/**
 *
 * @author kevin moreira
 */
public class AuthKey {

    private String authKey;
    private Date startDate;
    private Date endDate;

    public AuthKey(String authKey, Date startDate, Date endDate) {
        this.authKey = authKey;
        this.startDate = startDate;
        this.endDate = endDate;
    }
   
    
    public String getAuthKey() {
        return authKey;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    
    
}
