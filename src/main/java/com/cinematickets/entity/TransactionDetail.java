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
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author Yosua
 */
@Entity
@Table(name = "transaction_detail")
public class TransactionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Id transaction is mandatory")
    private int IdTransaction;

    @NotBlank(message = "Tipe is mandatory")
    private char tipe;

    @NotBlank(message = "Qty is mandatory")
    private int Qty;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIdTransaction() {
        return IdTransaction;
    }

    public void setIdTransaction(int IdTransaction) {
        this.IdTransaction = IdTransaction;
    }

    public void setTipe(char tipe) {
        this.tipe = tipe;
    }

    public char getTipe() {
        return tipe;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public int getQty() {
        return Qty;
    }
}
