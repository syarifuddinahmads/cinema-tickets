package com.cinematickets.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author yogi-06926
 */
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank(message = "Name is mandatory")        
    private int idUser;

    @NotBlank(message = "Name is mandatory")
    private String fullname;
    
    @NotBlank(message = "No Telepon is mandatory")
    private int noTelp;
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNoTelp(int noTelp) {
        this.noTelp = noTelp;
    }

    public int getNoTelp() {
        return noTelp;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }    
    
}
