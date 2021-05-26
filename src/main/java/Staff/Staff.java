/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Staff;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ricardorocha
 */
public class Staff {

    public List<StaffConstructor> staffList = new ArrayList<StaffConstructor>();

    public void populate() {
        staffList.add(new StaffConstructor("Ricardo", "Rocha", "me@rrocha.uk", "Receptionist", 123456, 1234));
        staffList.add(new StaffConstructor("John", "Doe", "jdoe@hrugby.com", "Receptionist", 147258, 1234));
        staffList.add(new StaffConstructor("Jane", "Jane", "janed@hrugby.com", "Receptionist", 748545, 1234));
    }
    
    /**
     * StaffConstructor Class
     */
    public class StaffConstructor {

        private final String firstName;
        private final String lastName;
        private final String email;
        private final String rank;
        private final int staffID;
        private final int secretCode;

        public StaffConstructor(String firstName, String lastName, String email, String rank, int staffID, int secretCode) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.rank = rank;
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
        public String getRank() {
            return rank;
        }
        public int getStaffID() {
            return staffID;
        }
        public int getSecretCode() {
            return secretCode;
        }

    }
    
}
