package com.example.apprenti.blablawild;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

import javax.crypto.spec.DESedeKeySpec;

/**
 * Created by apprenti on 21/09/17.
 */

public class SearchRequestModel implements Parcelable {
    private String depart;
    private String destination;
    private Date date;

    public SearchRequestModel(String depart, String destination, Date date) {
        this.depart = depart;
        this.destination = destination;
        this.date = date;
    }

    public String getDepart() {
        return depart;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDate() {
        return date;
    }
    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(depart);
        dest.writeString(destination);
        dest.writeLong(date.getTime());

    }
    public static final Parcelable.Creator<SearchRequestModel> CREATOR = new Parcelable.Creator<SearchRequestModel>(){

        @Override
        public SearchRequestModel createFromParcel(Parcel source)
        {
            return new SearchRequestModel(source);
        }

        @Override
        public SearchRequestModel[] newArray(int size)
        {
            return new SearchRequestModel[size];
        }
    };

    public SearchRequestModel(Parcel in) {
        this.depart = in.readString();
        this.destination = in.readString();
        this.date = new Date(in.readLong());


    }
}


