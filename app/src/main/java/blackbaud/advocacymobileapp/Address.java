package blackbaud.advocacymobileapp;

/**
 * Created by kayleigh.semeraro on 07/21/2016.
 */
public class Address {
<<<<<<< HEAD
    String city, state, zip, county, street;
    Address(String street, String city, String state, String zip, String county){
        this.street = street;
        this.city = city;
        this.state = state;
=======
    String city, state, zip, country, street, county;
    Address(String street, String city, String state, String zip, String country, String county){
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
>>>>>>> origin/master
        this.county = county;
        this.zip = zip;
    }
    public String toString(){
        return street;
    }
    public String get_street(){return street;}
    public String get_city(){return city;}
    public String get_state() {return state;}
<<<<<<< HEAD
=======
    public String get_country(){return country;}
>>>>>>> origin/master
    public String get_county(){return county;}
    public String get_zip(){return zip;}
}
