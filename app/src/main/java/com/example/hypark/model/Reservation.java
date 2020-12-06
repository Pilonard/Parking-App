package com.example.hypark.model;

import java.util.Date;

public class Reservation {
    private Integer idReservation;
    private Integer idClient;
    private Integer Prix;
    private Date date;
    private Date heureEntrer;
    private Date heureSortie;

    public Reservation(Integer idReservation, Integer idClient, Integer prix, Date date, Date heureEntrer, Date heureSortie) {
        this.idReservation = idReservation;
        this.idClient = idClient;
        Prix = prix;
        this.date = date;
        this.heureEntrer = heureEntrer;
        this.heureSortie = heureSortie;
    }


    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public Integer getPrix() {
        return Prix;
    }

    public void setPrix(Integer prix) {
        Prix = prix;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getHeureEntrée() {
        return heureEntrer;
    }

    public void setHeureEntrer(Date heureEntrer) {
        this.heureEntrer = heureEntrer;
    }

    public Date getHeureSortie() {
        return heureSortie;
    }

    public void setHeureSortie(Date heureSortie) {
        this.heureSortie = heureSortie;
    }
}
