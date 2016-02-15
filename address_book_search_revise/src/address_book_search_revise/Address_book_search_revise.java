/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address_book_search_revise;

import static address_book_search_revise.actions.actions;
import static address_book_search_revise.actions_revise.actions_revise;
import static address_book_search_revise.importCsv.importCsv;
import comparator.companyComparator;
import comparator.firstNameComparator;
import comparator.lastNameComparator;
import comparator.phoneComparator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

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
        ArrayList<Contact> contacts = new ArrayList<Contact>();
        try{
        String filename = "F:\\address_book\\P1\\HugeAddressBook.csv";
        
        contacts = importCsv(filename);
        contacts.remove(0);
        }catch(IOException e){
            System.out.println(e.toString());
        }
        /*
        HashMap<String, String> company_map = new HashMap<String, String>();
        HashMap<String, String> phone_map = new HashMap<String, String>();
        HashMap<String, String> firstname_map = new HashMap<String, String>();
        HashMap<String, String> lastname_map = new HashMap<String, String>();
        
        ArrayList<Contact> company_list = new ArrayList<Contact>(contacts);
        ArrayList<Contact> firstname_list = new ArrayList<Contact>(contacts);
        ArrayList<Contact> lastname_list = new ArrayList<Contact>(contacts);
        ArrayList<Contact> phone_list = new ArrayList<Contact>(contacts);
        */
        ArrayList<String> only_company_list = new ArrayList<String>();
        ArrayList<String> only_phone_list = new ArrayList<String>();
        ArrayList<String> only_lastname_list = new ArrayList<String>();
        ArrayList<String> only_firstname_list = new ArrayList<String>();
        int i = 0;
        for(Contact c : contacts){
            only_company_list.add(c.getCompany() + ":" + i);
            only_phone_list.add(c.getPhone() + ":" + i);
            only_lastname_list.add(c.getLastName() + ":" + i);
            only_firstname_list.add(c.getFirstName() + ":" + i);
            //String res = c.toString();
            //map.put(c.getCompany(), res);
            i++;
        }
        
        //add tag index
        /*
        Collections.sort(company_list, new companyComparator());
        Collections.sort(phone_list, new phoneComparator());
        Collections.sort(lastname_list, new lastNameComparator());
        Collections.sort(firstname_list, new firstNameComparator());
        */
        Collections.sort(only_company_list);
        
        Collections.sort(only_phone_list);
        Collections.sort(only_lastname_list);
        Collections.sort(only_firstname_list);
        
             
        //actions(company_list, phone_list, firstname_list, lastname_list);
        System.out.println("Welcome to address book");
        actions_revise(only_company_list, only_phone_list, only_firstname_list, only_lastname_list, contacts);
        //choice(company_list, phone_list, firstname_list, lastname_list);
        choice_revise(only_company_list, only_phone_list, only_firstname_list, only_lastname_list, contacts);
        
    }
    private static void choice (ArrayList<Contact> company_list, ArrayList<Contact> phone_list, ArrayList<Contact> firstname_list, ArrayList<Contact> lastname_list){
        System.out.println("would like another search? (Y/N)");
        
        Scanner input = new Scanner(System.in);
        String choice = input.next().toString().toUpperCase();
        if(choice.equals("Y")){
            actions(company_list, phone_list, firstname_list, lastname_list);
            choice(company_list, phone_list, firstname_list, lastname_list);
        }else if(choice.equals("N")){
            System.exit(0);
        }else{
            System.out.println("input invalid please try again");
            choice(company_list, phone_list, firstname_list, lastname_list);
        }
    }
    private static void choice_revise (ArrayList<String> company_list, ArrayList<String> phone_list, ArrayList<String> firstname_list, ArrayList<String> lastname_list,ArrayList<Contact> contacts){
        System.out.println("would like another search? (Y/N)");
        
        Scanner input = new Scanner(System.in);
        String choice = input.next().toString().toUpperCase();
        if(choice.equals("Y")){
            actions_revise(company_list, phone_list, firstname_list, lastname_list, contacts);
            choice_revise(company_list, phone_list, firstname_list, lastname_list, contacts);
        }else if(choice.equals("N")){
            System.exit(0);
        }else{
            System.out.println("input invalid please try again");
            choice_revise(company_list, phone_list, firstname_list, lastname_list,contacts);
        }
    }
}
