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

@Entity
@Table(name = "film")
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
    private int statusFilm;

    @NotBlank(message = "id_user is mandatory")
    private int idUser;

    public Long getId() {
        return id;
    }

    public void setTilte(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDesc(String Desc) {
        this.descrip = Desc;
    }

    public String getDesc() {
        return descrip;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getStatusFilm() {
        return statusFilm;
    }

    public void setStatusFilm(int statusFilm) {
        this.statusFilm = statusFilm;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

}
