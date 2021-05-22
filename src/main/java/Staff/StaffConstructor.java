/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

/**
 *
 * @author ricardorocha
 */
public class StaffConstructor {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final int staffID;
    private final int secretCode;

    public StaffConstructor(String firstName, String lastName, String email, int staffID, int secretCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.staffID = staffID;
        this.secretCode = secretCode;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public int getStaffID() {
        return staffID;
    }
    public int getSecretCode() {
        return secretCode;
    }

    @Override
    public String toString() {
        return this.firstName + " : " + this.lastName + " : " + this.email;
    }
    
}
