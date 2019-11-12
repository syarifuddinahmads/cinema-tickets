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
/**
 *
 * @author Yosua
 */
public class Bioskop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank(message = "id_user is mandatory")
    private int id_user;
    
    @NotBlank(message = "room Name is mandatory")
    private String room_Name;
    
    @NotBlank(message = "room Number is mandatory")
    private int room_Number;
    
    @NotBlank(message = "status Bioskop is mandatory")
    private int status_Bioskop;
    
    public int getId(){
        return id_user;
    }
    public void id_user(int id_user){
        this.id_user=id_user;
    }
    public int getId_user(){
        return id_user;
    }
    public void setRoom_name(String room_name){
        this.room_Name=room_name;
    }
    public String getRoom_name(){
        return room_Name;
    }
    public void setRoom_number(int room_number){
        this.room_Number=room_number;
    }
    public int getRoom_number(){
        return room_Number;
    }
    public void setStatus(int status){
        this.status_Bioskop=status;
    }
    public int getStatus(){
        return status_Bioskop;
    }
}
