package blackbaud.advocacymobileapp;

import java.util.Collection;
import blackbaud.advocacymobileapp.InterestItem;

/**
 * Created by Melissa.Laskowski on 07/21/2016.
 *
 *
 *
 *
 */
public class Constituent {

    public String first_name;
    public String last_name;
    public String middle_name;
    public String preferred_pronoun;
    public String phone;
    public String secondary_phone;
    public String email;
    public String notes;
    public Address address;
    public String state;
    public String city;
    public String country;
    public String zipcode;
    public String county;
    public String street;
    public Collection<InterestItem> interest_items;
    public String date;

    public Constituent(){}

    public Constituent(String first_name, String last_name, String middle_name, String preferred_pronoun, String secondary_phone, String email,
                       String notes, String street_address, String city_address, String state_address, String zipcode_address, String country_address, String county_address
            , Collection<InterestItem> interest_items, String date)
    {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.preferred_pronoun = preferred_pronoun;
        this.secondary_phone = secondary_phone;
        this.email = email;
        this.notes = notes;
        this.address = new Address(street_address, city_address, state_address, zipcode_address, county_address, country_address);
        this.interest_items = interest_items;
        this.date = date;
    }

    public Constituent(String first_name, String last_name, String middle_name, String preferred_pronoun, String secondary_phone, String email,
                       String notes, Address address, Collection<InterestItem> interest_items, String date)
    {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.preferred_pronoun = preferred_pronoun;
        this.secondary_phone = secondary_phone;
        this.email = email;
        this.notes = notes;
        this.address = address;
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
