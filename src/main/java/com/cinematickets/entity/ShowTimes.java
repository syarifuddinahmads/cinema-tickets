package com.cinematickets.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.validation.constraints.NotBlank;

/**
 *
 * @author yogi-06926
 */
@Entity
@Table(name = "show_time")
public class ShowTimes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @NotBlank(message = "id-film is mandatory")
    private long idFilm;
    
    @NotBlank(message = "Date Time Show is mandatory")
    private DateTimeAtCompleted DateTimeShow;
    
    @NotBlank(message = "Session is mandatory")
    private int session;
    
    @NotBlank(message = "id_bioskop is mandatory")
    private long idBioskop;
    
    @NotBlank(message = "Id User is mandatory")
    private long idUser;

    public long getId() {
        return id;
    }

    public long getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(long idFilm) {
        this.idFilm = idFilm;
    }

    public DateTimeAtCompleted getDateTimeShow() {
        return DateTimeShow;
    }

    public void setDateTimeShow(DateTimeAtCompleted DateTimeShow) {
        this.DateTimeShow = DateTimeShow;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public long getIdBioskop() {
        return idBioskop;
    }

    public void setIdBioskop(long idBioskop) {
        this.idBioskop = idBioskop;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    
    
    
    
}
