/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address_book_search_revise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String company;
    public Contact(String firstName, String lastName, String phone, String company) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.company = company;
    }
    
    
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getCompany() {
        return company;
    }
    
   
    public static Comparator<Contact> COMPARE_BY_PHONE = new Comparator<Contact>() {
        public int compare(Contact one, Contact other) {
            return one.phone.compareTo(other.phone);
        }
    };

    List<Contact> contacts1 = new ArrayList<Contact>();
// Fill it.
  // Collections.sort(contacts1, new companyComparator());
// Sort by address.
 
 // Collections.sort (contacts, );

// Sort later by phone.
   //Collections.sort(contacts, Contact.COMPARE_BY_PHONE);
   
    public int compareTo(Contact o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String toString(){
        return "[firstName:"+ firstName  +" ,LastName:" + lastName +",phone:"+ phone + ",company:" + company + "]";
    }
}
