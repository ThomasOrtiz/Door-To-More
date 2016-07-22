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
    private ArrayList<Constituent> constitList;
    private ArrayList<String> petitionList;

    private DoorData() {
        addressList = new ArrayList<Address>();
        constitList = new ArrayList<Constituent>();
        petitionList = new ArrayList<String>();
        test_data();
    }

    // Should dynamically get addresses if this wasn't a prototype
    private void test_data(){
        Address addr1 = new Address("713 A Smoke Rise Dr", "Central", "SC", "29630", "USA");
        Address addr2 = new Address("104 Evergreen Ave", "Springfield", "NJ", "07081", "USA");
        Address addr3 = new Address("1222 Moose Mountain Ct", "Denver", "Colorado", "27573", "USA");
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

        Constituent constit1 = new Constituent("Vere", "Brooks", null, null, null, null, null, null, null, null, null, null, null, "7/21/2016" );
        Constituent constit2 = new Constituent("Kegan", "Colton", null, null, null, null, null, null, null, null, null, null, null, "7/21/2016");
        Constituent constit3 = new Constituent("Grier", "May", null, null, null, null, null, null, null, null, null, null, null, "7/21/2016");
        Constituent constit4 = new Constituent("Thomas", "Thorburn", null, null, null, null, null, null, null, null, null, null, null, "7/19/2016");
        Constituent constit5 = new Constituent("Ricky", "Putnam", null, null, null, null, null, null, null, null, null, null, null, "7/19/2016");
        Constituent constit6 = new Constituent("Trace", "Stamp", null, null, null, null, null, null, null, null, null, null, null, "7/13/2016");
        Constituent constit7 = new Constituent("Gabe", "Bailey", null, null, null, null, null, null, null, null, null, null, null, "7/13/2016");
        Constituent constit8 = new Constituent("Elton", "Summers", null, null, null, null, null, null, null, null, null, null, null, "7/13/2016");
        Constituent constit9 = new Constituent("Darwin", "Bryson", null, null, null, null, null, null, null, null, null, null, null, "7/4/2016");
        Constituent constit10 = new Constituent("Stewart", "Aiken", null, null, null, null, null, null, null, null, null, null, null, "7/4/2016");
        Constituent constit11 = new Constituent("William", "Harlow", null, null, null, null, null, null, null, null, null, null, null, "7/4/2016");
        Constituent constit12 = new Constituent("Kegan", "Westbrook", null, null, null, null, null, null, null, null, null, null, null, "7/3/2016");
        Constituent constit13 = new Constituent("Weldon", "Bradley", null, null, null, null, null, null, null, null, null, null, null, "7/3/2016");

        this.constitList.add(constit1);
        this.constitList.add(constit2);
        this.constitList.add(constit3);
        this.constitList.add(constit4);
        this.constitList.add(constit5);
        this.constitList.add(constit6);
        this.constitList.add(constit7);
        this.constitList.add(constit8);
        this.constitList.add(constit9);
        this.constitList.add(constit10);
        this.constitList.add(constit11);
        this.constitList.add(constit12);
        this.constitList.add(constit13);
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

    public ArrayList<Constituent> getConstituents() {
        return this.constitList;
    }

    public String[] getConstituentStrings() {
        String[] conStrings = new String[constitList.size()];
        for(int i = 0; i < constitList.size(); i++) {
            conStrings[i]= constitList.get(i).toString();
        }
        return conStrings;
    }

    public void addConstituient(Constituent con) {
        this.constitList.add(con);
    }

    public void removeConstituent(Constituent con) {
        int index = this.constitList.indexOf(con);
        this.constitList.remove(index);
        getConstituentStrings();
    }

    public void setCurrentAddress(Address addr) {
        this.currentAddress = addr;
    }

    public Address getCurrentAddress() {
        return this.currentAddress;
    }

    public void addPetitionSign(String constit) {
        this.petitionList.add(constit);
    }

    public static DoorData getInstance() {
        if(data == null) {
            data = new DoorData();
        }
        return data;
    }
}
