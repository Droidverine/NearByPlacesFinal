package com.droidverine.nearbyplaces.models;

/**
 * Created by DELL on 02-02-2018.
 */

public class contact {
    String contactnumber,contactname,contactrole,contactimg;

    public contact(String contactnumber, String contactname, String contactrole) {
        this.contactnumber = contactnumber;
        this.contactname = contactname;
        this.contactrole = contactrole;
    }

    public String getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(String contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContactrole() {
        return contactrole;
    }

    public void setContactrole(String contactrole) {
        this.contactrole = contactrole;
    }
}
