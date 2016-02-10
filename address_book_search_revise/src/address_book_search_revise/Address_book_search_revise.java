/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address_book_search_revise;

import static address_book_search_revise.actions.actions;
import static address_book_search_revise.importCsv.importCsv;
import comparator.companyComparator;
import comparator.firstNameComparator;
import comparator.lastNameComparator;
import comparator.phoneComparator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */
public class Address_book_search_revise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String filename = "F:\\address_book\\P1\\SmallAddressBook.csv";
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        contacts = importCsv(filename);
        contacts.remove(0);
        
        
        ArrayList<Contact> company_list = new ArrayList<Contact>(contacts);
        ArrayList<Contact> firstname_list = new ArrayList<Contact>(contacts);
        ArrayList<Contact> lastname_list = new ArrayList<Contact>(contacts);
        ArrayList<Contact> phone_list = new ArrayList<Contact>(contacts);
        
        
        Collections.sort(company_list, new companyComparator());
        Collections.sort(phone_list, new phoneComparator());
        Collections.sort(lastname_list, new lastNameComparator());
        Collections.sort(firstname_list, new firstNameComparator());
        
        actions(company_list, phone_list, firstname_list, lastname_list);
        
        
        String a = phone_list.toString();
    }
    
}
