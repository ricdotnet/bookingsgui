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
        staffList.add(new StaffConstructor("Ricardo", "Rocha", "me@rrocha.uk", 123456, 1234));
        staffList.add(new StaffConstructor("John", "Doe", "jdoe@hrugby.com", 147258, 1234));
        staffList.add(new StaffConstructor("Jane", "Jane", "janed@hrugby.com", 748545, 1234));
    }
    
}
