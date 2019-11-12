package com.cinematickets.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author yogi-06926
 */
@Entity
public class showTimes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "id-film is mandatory")
    private long id_film;
    
    @NotBlank(message = "Date Time Show is mandatory")
    private DateTimeAtCompleted DateTimeShow;
    
    @NotBlank(message = "Session is mandatory")
    private int session;
    
    @NotBlank(message = "id_bioskop is mandatory")
    private long id_bioskop;
    
    @NotBlank(message = "Id User is mandatory")
    private long id_user;

    public long getId() {
        return id;
    }

    public DateTimeAtCompleted getDateTimeShow() {
        return DateTimeShow;
    }

    public long getId_bioskop() {
        return id_bioskop;
    }

    public long getId_film() {
        return id_film;
    }

    public long getId_user() {
        return id_user;
    }

    public int getSession() {
        return session;
    }

    public void setDateTimeShow(DateTimeAtCompleted DateTimeShow) {
        this.DateTimeShow = DateTimeShow;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId_bioskop(long id_bioskop) {
        this.id_bioskop = id_bioskop;
    }

    public void setId_film(long id_film) {
        this.id_film = id_film;
    }

    

    public void setId_user(long id_user) {
        this.id_user = id_user;
    }

    public void setSession(int session) {
        this.session = session;
    }
    
    
    
}
