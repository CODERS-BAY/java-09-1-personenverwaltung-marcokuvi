package com.codersbay;

public class Adress {

    public String postcode;
    public String city;
    public String streetname;
    public String streetnumber;

    public Adress(String postcode, String city, String streetname, String streetnumber) {
        this.postcode = postcode;
        this.city = city;
        this.streetname = streetname;
        this.streetnumber = streetnumber;
    }

    public Adress() {
    }

    @Override
    public String toString() {
        return "Adress(" +
                "postcode='" + postcode + '\'' +
                ", city='" + city + '\'' +
                ", streetname='" + streetname + '\'' +
                ", streetnumber='" + streetnumber + '\'' +
                ')';
    }
}
