package com.codersbay;

public class Adress {

    public int postcode;
    public String city;
    public String streetname;
    public int streetnumber;

    public Adress(int postcode, String city, String streetname, int streetnumber) {
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
