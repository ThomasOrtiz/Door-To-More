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
    public String street_address;
    public String city;
    public String state;
    public String zipcode;
    public String county;
    public Collection<InterestItem> interest_items;

    public void Constituent(String first_name, String last_name, String middle_name, String preferred_pronoun, String secondary_phone, String email,
                            String notes, String street_address, String city_address, String state_address, String zipcode_address, String county_address
                            , Collection<InterestItem> interest_items)
    {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.preferred_pronoun = preferred_pronoun;
        this.secondary_phone = secondary_phone;
        this.email = email;
        this.notes = notes;
        this.state = street_address;
        this.city= city_address;
        this.state = state_address;
        this.zipcode = zipcode_address;
        this.county = county_address;
        this.interest_items = interest_items;
    }

}
