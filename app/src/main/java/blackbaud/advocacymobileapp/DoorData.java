package blackbaud.advocacymobileapp;

import java.util.ArrayList;

/**
 * Contains all of the data used for the app in a central location.
 *
 * Created by chris.brown on 07/21/2016.
 */
public class DoorData {
    private static DoorData data = null;
    private Address currentAddress = null;
    private ArrayList<Address> addressList;
    //private ArrayList<Constituent> constitList;

    private DoorData() {
        addressList = new ArrayList<Address>();
        test_addresses();
    }

    // Should dynamically get addresses if this wasn't a prototype
    private void test_addresses(){
        Address addr1 = new Address("713 A Smoke Rise Dr", "Central", "SC", "29630", "USA");
        Address addr2 = new Address("104 Evergreen Ave", "Springfield", "NJ", "07081", "USA");
        Address addr3 = new Address("1222 Moose Mountain Ct", "Quebec City", "Quebec", "G1A 1C5", "Canada");
        Address addr4 = new Address("666 Fallen Lane", "Columbia", "SC", "29201", "USA");
        Address addr5 = new Address("101 Vista Montana", "San Jose", "CA", "95134", "USA");
        Address addr6 = new Address("116 East Green St", "Pendleton", "SC", "29570", "USA");
        Address addr7 = new Address("42 Applegate Dr", "Orlando", "FL", "32801", "USA");
        Address addr8 = new Address("1776 Gettysburg Dr", "Philadelphia", "PA", "19019", "USA");
        Address addr9 = new Address("413 Sheltered Cove Ct", "Fort Mill", "SC", "29708", "USA");
        Address addr10 = new Address("1534 152 Ave", "Cameron", "IL", "61423", "USA");
        Address addr11 = new Address("6712 Unity Rd", "Tuscaloosa", "AL", "35401", "USA");
        Address addr12 = new Address("51 Scott Dr", "New City", "NY", "10956", "USA");
        Address addr13 = new Address("1129 Ambling Way", "Mt Pleasant", "SC", "29464", "USA");

        this.addressList.add(addr1);
        this.addressList.add(addr2);
        this.addressList.add(addr3);
        this.addressList.add(addr4);
        this.addressList.add(addr5);
        this.addressList.add(addr6);
        this.addressList.add(addr7);
        this.addressList.add(addr8);
        this.addressList.add(addr9);
        this.addressList.add(addr10);
        this.addressList.add(addr11);
        this.addressList.add(addr12);
        this.addressList.add(addr13);
    }

    public ArrayList<Address> getAddressList() {
        return this.addressList;
    }

    public String[] getAddressStrings() {
        String[] addressStrings = new String[addressList.size()];
        for(int i = 0; i < addressList.size(); i++) {
            addressStrings[i]= addressList.get(i).toString();
        }
        return addressStrings;
    }

    public void addAddress(Address addr) {
        this.addressList.add(addr);
    }

    public void removeAddress(Address addr) {
        int index = this.addressList.indexOf(addr);
        this.addressList.remove(index);
        getAddressStrings();
    }

    /*public ArrayList<Constituent> getConstituents() {
        return this.constitList;
    }

    public void addConstituient(Constituent con) {
        this.constitList.add(con);
    }

    public void removeConstituent(Constituent con) {
        int index = this.constitList.indexOf(con);
        this.constitList.remove(index);
    }*/

    public void setCurrentAddress(Address addr) {
        this.currentAddress = addr;
    }

    public Address getCurrentAddress() {
        return this.currentAddress;
    }

    public static DoorData getInstance() {
        if(data == null) {
            data = new DoorData();
        }
        return data;
    }
}
