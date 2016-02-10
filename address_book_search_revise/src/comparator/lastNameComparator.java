/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparator;

import address_book_search_revise.Contact;
import java.util.Comparator;

/**
 *
 * @author Administrator
 */
public class lastNameComparator implements Comparator<Contact>{

    @Override
    public int compare(Contact o1, Contact o2) {
        return o1.getLastName().compareToIgnoreCase(o2.getLastName());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
