/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinematickets.repository;

import com.cinematickets.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author udin
 */
public interface UserRepository extends JpaRepository<User, Long>{
    User findByUsername(String username);
}
