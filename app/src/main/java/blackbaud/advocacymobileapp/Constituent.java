package blackbaud.advocacymobileapp;

import java.util.Collection;
import blackbaud.advocacymobileapp.InterestItem;

/**
 * Created by Melissa.Laskowski on 07/21/2016.
 */
public class Constituent {

    public String first_name;
    public String last_name;
    public String phone;
    public String email;
    public String notes;
    public String state;
    public String city;
    public String zipcode;
    public String county;
    public String street;
    public Collection<InterestItem> interest_items;
    public String date;
    public Address address;

    public Constituent(){}

    public Constituent(String first_name, String last_name, String email, String notes, String street,
                       String city, String state, String zipcode, String county,
                       Collection<InterestItem> interest_items, String date)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.notes = notes;
        this.address = new Address(street, city, state, zipcode, county);
        this.interest_items = interest_items;
        this.date = date;
    }


    public String toString() {
        if(date.length() == 8) {
            return date + "    " + first_name + " " + last_name;
        }
        if(date.length() == 9) {
            return date + "  " + first_name + " " + last_name;
        }
        return date + " " + first_name + " " + last_name;
    }

}