/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinematickets.services;

/**
 *
 * @author udin
 */

public interface SecurityService {
    
    String findLoggedInUsername();
    
    void autoLogin(String username, String password);
    
}
