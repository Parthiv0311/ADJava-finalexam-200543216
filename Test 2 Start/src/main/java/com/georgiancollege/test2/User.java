
package com.georgiancollege.test2;

import java.util.Date;
import com.google.gson.annotations.SerializedName;

public class User {

    // Instance variables as per the JSON structure
    private int id;
    @SerializedName("FirstName") private String firstName;
    @SerializedName("LastName") private String lastName;
    private int age;
    private String email;
    private String phone;
    @SerializedName("birthDate") private Date birthDate; // Assuming date format is compatible
    @SerializedName("uNiVersity") private String university;
    private String image;
    private Address address; // Using Address class for the address field

    // Getter methods
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getUniversity() {
        return university;
    }

    public String getImage() {
        return image;
    }

    public Address getAddress() {
        return address;
    }
}
