/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address_book_search_revise;


import static address_book_search_revise.search.searchfirst_Company;
import static address_book_search_revise.search.searchfirst_FirstName;
import static address_book_search_revise.search.searchfirst_LastName;
import static address_book_search_revise.search.searchfirst_PhoneNumber;
import static address_book_search_revise.search.searchlast_Company;
import static address_book_search_revise.search.searchlast_FirstName;
import static address_book_search_revise.search.searchlast_LastName;
import static address_book_search_revise.search.searchlast_PhoneNumber;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
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
                Instant start = Instant.now();
                int first_firstname_position = searchfirst_FirstName(firstname_list, prefix);
                int last_firstname_position = searchlast_FirstName(firstname_list, prefix);
                //if(first_firstname_position == last_firstname_position)
                if(first_firstname_position == -1 && last_firstname_position == -1){
                    System.out.println("cannot find that person");
                    break;
                }
                ArrayList<Contact> res = new ArrayList<Contact>();
                int dummy_firstname = first_firstname_position;
                while(dummy_firstname <= last_firstname_position){
                    res.add(firstname_list.get(dummy_firstname));
                    dummy_firstname++;
                    if(res.size() > 20){
                        break;
                    }
                }
                Instant end = Instant.now();
                Duration timeElapsed = Duration.between(start, end);
                System.out.println(timeElapsed.toNanos() + "ns");
                
                System.out.println(res + "(total number)" + (last_firstname_position - first_firstname_position + 1) );
                break;
            case "L":
                System.out.println("enter partial or full last name");
                input1 = new Scanner(System.in);
                prefix = input1.next().toString();
                int first_lastname_position = searchfirst_LastName(lastname_list, prefix);
                int last_lastname_position = searchlast_LastName(lastname_list, prefix);
                ArrayList<Contact> res1 = new ArrayList<Contact>();
                int dummy_lastname = first_lastname_position;
                while(dummy_lastname <= last_lastname_position){
                    res1.add(lastname_list.get(dummy_lastname));
                    dummy_lastname++;
                }
                System.out.println(res1);
                break;
            case "P":
                System.out.println("enter partial or full phone number");
                input1 = new Scanner(System.in);
                prefix = input1.next().toString();
                int first_phone_position = searchfirst_PhoneNumber(phone_list, prefix);
                int last_phone_position = searchlast_PhoneNumber(phone_list, prefix);
                
                ArrayList<Contact> res2 = new ArrayList<Contact>();
                int dummy_phone = first_phone_position;
                while(dummy_phone <= last_phone_position){
                    res2.add(phone_list.get(dummy_phone));
                    dummy_phone++;
                }
                System.out.println(res2);
                break;
            case "C":
                System.out.println("enter partial or full company name");
                input1 = new Scanner(System.in);
                prefix = input1.next().toString();
                int first_company_position = searchfirst_Company(company_list, prefix);
                int last_company_position = searchlast_Company(company_list, prefix);
                
                ArrayList<Contact> res3 = new ArrayList<Contact>();
                int dummy_company = first_company_position;
                while(dummy_company <= last_company_position){
                    res3.add(company_list.get(dummy_company));
                    dummy_company++;
                }
                System.out.println(res3);
                break;
            default:
                System.out.println("please try again");
                break;
        }

    }

}
