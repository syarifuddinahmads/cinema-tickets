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
public class TransactionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotBlank(message = "Id transaction is mandatory")
    private int Id_transaction;
    
    @NotBlank(message = "Tipe is mandatory")
    private char tipe;
    
    @NotBlank(message = "Qty is mandatory")
    private int Qty;
    
    public void setId_trans(int Id){
        this.Id_transaction=Id;
    }
    public int getId_trans(){
        return Id_transaction;
    }
    public void setTipe(char tipe){
        this.tipe=tipe;
    }
    public char getTipe(){
        return tipe;
    }
    public void setQty(int Qty){
        this.Qty=Qty;
    }
    public int getQty(){
        return Qty;
    }
}
