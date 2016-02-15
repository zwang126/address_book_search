/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address_book_search_revise;

import static address_book_search_revise.getString.getNumArray;

import static address_book_search_revise.search_revise.searchfirst_Company_revise;
import static address_book_search_revise.search_revise.searchfirst_FirstName_revise;
import static address_book_search_revise.search_revise.searchfirst_LastName_revise;
import static address_book_search_revise.search_revise.searchfirst_PhoneNumber_revise;
import static address_book_search_revise.search_revise.searchlast_Company_revise;
import static address_book_search_revise.search_revise.searchlast_FirstName_revise;
import static address_book_search_revise.search_revise.searchlast_LastName_revise;
import static address_book_search_revise.search_revise.searchlast_PhoneNumber_revise;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class actions_revise {
    public static void actions_revise(ArrayList<String> company_list, ArrayList<String> phone_list, ArrayList<String> firstname_list, ArrayList<String> lastname_list, ArrayList<Contact> contacts) {
        String choice = null;
        Instant start = null;
        Instant end = null;
        Duration timeElapsed = null;
        Scanner input1 = new Scanner(System.in);
        
        System.out.println("What would you like to search on?");

        System.out.println("F,L,P,C");
        Scanner input = new Scanner(System.in);
        choice = input.next().toString().toUpperCase();
        switch (choice) {
            case "F":
                //corner case need to be fixed here.if not exit if -1 throw exception
                //System.out.println("enter partial or full first name");
              //  Scanner input1 = new Scanner(System.in);
                //String prefix = input1.next().toString();
                String prefix = "Al";
                List<String> res = new ArrayList<String>();
                ArrayList<Contact> result = new ArrayList<Contact>();
                //need time stamp here....
                 start = Instant.now();
                for(int j = 0; j < 100000; j++){
                int first_firstname_position = searchfirst_FirstName_revise(firstname_list, prefix);
                int last_firstname_position = searchlast_FirstName_revise(firstname_list, prefix);
                
                //if(first_firstname_position == last_firstname_position)
                if (first_firstname_position == -1 && last_firstname_position == -1) {
                    System.out.println("cannot find that person");
                    end = Instant.now();
                    break;
                }
                
                
                res =  firstname_list.subList(first_firstname_position, last_firstname_position + 1);
                int[] numbers = getNumArray(res);
                for(int i = 0; i < numbers.length; i++){
                    result.add(contacts.get(numbers[i]));
                    if(result.size() > 20){
                        break;
                    }
                }
                }
                 end = Instant.now();
                 timeElapsed = Duration.between(start, end);
                System.out.println(timeElapsed.toMillis() + "ms");

               // System.out.println(result + "(total number)" + (last_firstname_position - first_firstname_position + 1));
                break;
            case "L":
                System.out.println("enter partial or full last name");
                input1 = new Scanner(System.in);
                prefix = input1.next().toString();
                List<String> res1 = new ArrayList<String>();
                ArrayList<Contact> result1 = new ArrayList<Contact>();
                 start = Instant.now();
                int first_lastname_position = searchfirst_LastName_revise(lastname_list, prefix);
                int last_lastname_position = searchlast_LastName_revise(lastname_list, prefix);
                
                
                if(first_lastname_position == -1 && last_lastname_position == -1){
                    System.out.println("cannot find that person");
                    break;
                }
             //   ArrayList<Contact> res1 = new ArrayList<Contact>();
                res1 = lastname_list.subList(first_lastname_position, last_lastname_position + 1);
                int[] numbers1 = getNumArray(res1);
                for(int i = 0; i < numbers1.length; i++){
                    result1.add(contacts.get(numbers1[i]));
                    if(result1.size() > 20){
                        end = Instant.now();
                        break;
                    }
                }
                
                  end = Instant.now();
                  timeElapsed = Duration.between(start, end);
                  System.out.println(timeElapsed.toNanos() + "ns");
                System.out.println(result1 + "(total number)" + (last_lastname_position - first_lastname_position + 1));
                break;
            case "P":
                System.out.println("enter partial or full phone number");
                input1 = new Scanner(System.in);
                prefix = input1.next().toString();
                ArrayList<Contact> result2 = new ArrayList<Contact>();
                List<String> res2 = new ArrayList<String>();
                start = Instant.now();
                int first_phone_position = searchfirst_PhoneNumber_revise(phone_list, prefix);
                int last_phone_position = searchlast_PhoneNumber_revise(phone_list, prefix);
                
                if(first_phone_position == -1 && last_phone_position == -1){
                    System.out.println("cannot find that person");
                    end = Instant.now();
                    break;
                }
                res2 =  phone_list.subList(first_phone_position, last_phone_position + 1);
                int[] numbers2 = getNumArray(res2);
                for(int i = 0; i < numbers2.length; i++){
                    result2.add(contacts.get(numbers2[i]));
                    if(result2.size() > 20){
                        break;
                    }
                }
                
                end = Instant.now();
                timeElapsed = Duration.between(start, end);
                System.out.println(timeElapsed.toNanos() + "ns");
                System.out.println(result2+"(total number)" + (last_phone_position - first_phone_position +1));
                break;
            case "C":
                System.out.println("enter partial or full company name");
                input1 = new Scanner(System.in);
                prefix = input1.next().toString();
                ArrayList<Contact> result3 = new ArrayList<Contact>();
                List<String> res3 = new ArrayList<String>();
                start = Instant.now();
                int first_company_position = searchfirst_Company_revise(company_list, prefix);
                int last_company_position = searchlast_Company_revise(company_list, prefix);
                if(first_company_position == -1 && last_company_position == -1){
                    System.out.println("cannot find that person");
                    end = Instant.now();
                    break;
                }
                res3 = company_list.subList(first_company_position, last_company_position + 1);
                int[] numbers3 = getNumArray(res3);
                for(int i = 0; i < numbers3.length; i++){
                    result3.add(contacts.get(numbers3[i]));
                    if(result3.size() > 20){
                        break;
                    }
                }
                
                end = Instant.now();
                timeElapsed = Duration.between(start, end);
                System.out.println(timeElapsed.toNanos() + "ns");
                System.out.println(result3 + ("(total number)")+ (last_company_position - first_company_position +1 ));
                break;
            default:
                System.out.println("please try again");
                break;
        }

    }

}
