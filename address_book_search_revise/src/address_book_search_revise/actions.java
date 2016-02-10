/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address_book_search_revise;

import static address_book_search_revise.search.searchCompany;
import static address_book_search_revise.search.searchLastName;
import static address_book_search_revise.search.searchPhoneNumber;
import static address_book_search_revise.search.searchfirst_FirstName;
import static address_book_search_revise.search.searchlast_FirstName;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class actions {
     public static void actions(ArrayList<Contact> company_list, ArrayList<Contact> phone_list, ArrayList<Contact> firstname_list, ArrayList<Contact> lastname_list) { 
        String choice = null;

        System.out.println("Welcome to address book");
        System.out.println("What would you like to search on?");

        System.out.println("F,L,P,C");
        Scanner input = new Scanner(System.in);
        choice = input.next().toString().toUpperCase();
        switch (choice) {
            case "F":
                //corner case need to be fixed here.if not exit if -1 throw exception
                System.out.println("enter partial or full first name");
                Scanner input1 = new Scanner(System.in);
                String prefix = input1.next().toString();
                //need time stamp here....
                int first_position = searchfirst_FirstName(firstname_list, prefix);
                int last_position = searchlast_FirstName(firstname_list, prefix);
                
                ArrayList<Contact> res = new ArrayList<Contact>();
                int dummy = first_position;
                while(dummy <= last_position){
                    res.add(firstname_list.get(dummy));
                    dummy++;
                }
                System.out.println(res);
                break;
            case "L":
                System.out.println("enter partial or full last name");
                input1 = new Scanner(System.in);
                prefix = input1.next().toString();
                ArrayList<Contact> res1 = searchLastName(lastname_list, prefix);
                System.out.println(res1);
                break;
            case "P":
                System.out.println("enter partial or full phone number");
                input1 = new Scanner(System.in);
                prefix = input1.next().toString();
                ArrayList<Contact> res2 = searchPhoneNumber(phone_list, prefix);
                System.out.println(res2);
                break;
            case "C":
                System.out.println("enter partial or full company name");
                input1 = new Scanner(System.in);
                prefix = input1.next().toString();
                ArrayList<Contact> res3 = searchCompany(company_list, prefix);
                System.out.println(res3);
            default:
                System.out.println("please try again");
                break;
        }

    }

}
