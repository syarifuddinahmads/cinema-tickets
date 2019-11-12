/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cinematickets.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank(message = "Title is mandatory")
    private String title;
    
    @NotBlank(message = "description is mandatory")
    private String descrip;
    
    @NotBlank(message = "image is mandatory")
    private String image;
    
    @NotBlank(message = "status_film is mandatory")
    private int status_film;
    
    @NotBlank(message = "id_user is mandatory")
    private int id_user;
    
    public Long getId(){
        return id;
    }
    
    public void setTilte(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setDesc(String Desc){
        this.descrip = Desc;
    }
    public String getDesc(){
        return descrip;
    }
    public void setImage(String image){
        this.image=image;
    }
    public String getImage(){
        return image;
    }
    public void setStatus(int status){
        this.status_film = status;
    }
    public int getStatus(){
        return status_film;
    }
    public void setId_User(int Id_user){
        this.id_user = Id_user;
    }
    public int getId_User(){
        return id_user;
    }
}