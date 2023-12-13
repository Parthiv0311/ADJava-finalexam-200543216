
package com.georgiancollege.test2;

public class Address {

    // Instance variables as per the JSON structure
    private String address;
    private String city;
    @SerializedName("postalCode") private String postalCode;
    private String state;

    // Getter methods
    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getState() {
        return state;
    }
}
