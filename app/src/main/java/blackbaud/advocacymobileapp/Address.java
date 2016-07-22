package blackbaud.advocacymobileapp;

/**
 * Created by kayleigh.semeraro on 07/21/2016.
 */
public class Address {
    String city, state, zip, country, street;
    Address(String street, String city, String state, String zip, String country){
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }
    public String toString(){
        return street;
    }
    public String get_street(){return street;}
    public String get_city(){return city;}
    public String get_state() {return state;}
    public String get_country(){return country;}
    public String get_zip(){return zip;}
}
