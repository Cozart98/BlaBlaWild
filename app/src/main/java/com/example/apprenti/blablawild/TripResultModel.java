package com.example.apprenti.blablawild;

import java.util.Date;

/**
 * Created by apprenti on 13/09/17.
 */

public class TripResultModel {
    Date depart;
    String prénom;
    int prix;

    public TripResultModel(String prénom, Date depart , int prix) {
        this.prénom = prénom;
        this.depart = depart;
        this.prix = prix;
    }



    public Date getDepart() {
        return depart;
    }

    public void setDepart(Date depart) {
        this.depart = depart;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
}
