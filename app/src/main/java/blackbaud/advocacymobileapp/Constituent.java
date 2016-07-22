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
    public Collection<InterestItem> interest_items;
    public String street_address;
    public String city_address;
    public String state_address;
    public String zipcode_address;
    public String county_address;

    public void Constituent(String street_address, String city_address, String state_address, String zipcode_address, String county_address)
    {
        this.state_address = street_address;
        this.city_address = city_address;
        this.state_address = state_address;
        this.zipcode_address = zipcode_address;
        this.county_address = county_address;

    }

}
