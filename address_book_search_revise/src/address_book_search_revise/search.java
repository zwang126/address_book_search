/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address_book_search_revise;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class search {
    public static int searchfirst_FirstName(ArrayList<Contact> contacts, String prefix){
            int len = prefix.length();
            ArrayList<Contact> res = new ArrayList<Contact>();
            int start  = 0;
            int end = contacts.size() - 1;
            while(start + 1 < end){
                int mid =  start + (end - start)/2;
                //Contact c =  contacts.get(mid);
                //String r = c.getFirstName().substring(0, len);
                //int j = r.compareToIgnoreCase(prefix);
                //int k = r.compareTo(prefix);
                if(contacts.get(mid).getFirstName().startsWith(prefix)){
                    end = mid;
                }else if(contacts.get(mid).getFirstName().substring(0, len).compareToIgnoreCase(prefix) < 0){
                    start  = mid;
                }else{
                    end = mid;
                }
            }
            if(contacts.get(start).getFirstName().startsWith(prefix)){
                return start;
            }else if(contacts.get(end).getFirstName().startsWith(prefix)){
                return end;
            }else{
                return -1;
            }
          
        }
    public static int searchlast_FirstName(ArrayList<Contact> contacts, String prefix){
        int len = prefix.length();
            ArrayList<Contact> res = new ArrayList<Contact>();
            int start  = 0;
            int end = contacts.size() - 1;
            while(start + 1 < end){
                int mid =  start + (end - start)/2;
                //Contact c =  contacts.get(mid);
                //String r = c.getFirstName().substring(0, len);
                //int j = r.compareToIgnoreCase(prefix);
                //int k = r.compareTo(prefix);
                if(contacts.get(mid).getFirstName().startsWith(prefix)){
                    start = mid;
                }else if(contacts.get(mid).getFirstName().substring(0, len).compareToIgnoreCase(prefix) < 0){
                    start  = mid;
                }else{
                    end = mid;
                }
            }
            if(contacts.get(start).getFirstName().startsWith(prefix)){
                return start;
            }else if(contacts.get(end).getFirstName().startsWith(prefix)){
                return end;
            }else{
                return -1;
            }
           
    }
    public static int searchfirst_LastName(ArrayList<Contact> contacts, String prefix){
        int len = prefix.length();
            ArrayList<Contact> res = new ArrayList<Contact>();
            int start  = 0;
            int end = contacts.size() - 1;
            while(start + 1 < end){
                int mid =  start + (end - start)/2;
                //Contact c =  contacts.get(mid);
                //String r = c.getFirstName().substring(0, len);
                //int j = r.compareToIgnoreCase(prefix);
                //int k = r.compareTo(prefix);
                if(contacts.get(mid).getLastName().startsWith(prefix)){
                    end = mid;
                }else if(contacts.get(mid).getLastName().substring(0, len).compareToIgnoreCase(prefix) < 0){
                    start  = mid;
                }else{
                    end = mid;
                }
            }
            if(contacts.get(start).getLastName().startsWith(prefix)){
                return start;
            }else if(contacts.get(end).getLastName().startsWith(prefix)){
                return end;
            }else{
                return -1;
            }
            
        }
    public static int searchlast_LastName(ArrayList<Contact> contacts, String prefix){
        int len = prefix.length();
            ArrayList<Contact> res = new ArrayList<Contact>();
            int start  = 0;
            int end = contacts.size() - 1;
            while(start + 1 < end){
                int mid =  start + (end - start)/2;
                //Contact c =  contacts.get(mid);
                //String r = c.getFirstName().substring(0, len);
                //int j = r.compareToIgnoreCase(prefix);
                //int k = r.compareTo(prefix);
                if(contacts.get(mid).getLastName().startsWith(prefix)){
                    start = mid;
                }else if(contacts.get(mid).getLastName().substring(0, len).compareToIgnoreCase(prefix) < 0){
                    start  = mid;
                }else{
                    end = mid;
                }
            }
            if(contacts.get(start).getLastName().startsWith(prefix)){
                return start;
            }else if(contacts.get(end).getLastName().startsWith(prefix)){
                return end;
            }else{
                return -1;
            }
            
        }
    
    public static int searchfirst_PhoneNumber(ArrayList<Contact> contacts, String prefix){
        int len = prefix.length();
            ArrayList<Contact> res = new ArrayList<Contact>();
            int start  = 0;
            int end = contacts.size() - 1;
            while(start + 1 < end){
                int mid =  start + (end - start)/2;
                //Contact c =  contacts.get(mid);
                //String r = c.getFirstName().substring(0, len);
                //int j = r.compareToIgnoreCase(prefix);
                //int k = r.compareTo(prefix);
                if(contacts.get(mid).getPhone().startsWith(prefix)){
                    end = mid;
                }else if(contacts.get(mid).getPhone().substring(0, len).compareToIgnoreCase(prefix) < 0){
                    start  = mid;
                }else{
                    end = mid;
                }
            }
            if(contacts.get(start).getPhone().startsWith(prefix)){
                return start;
            }else if(contacts.get(end).getPhone().startsWith(prefix)){
                return end;
            }else{
                return -1;
            }
           
    }
    
    public static int searchlast_PhoneNumber(ArrayList<Contact> contacts, String prefix){
        int len = prefix.length();
            ArrayList<Contact> res = new ArrayList<Contact>();
            int start  = 0;
            int end = contacts.size() - 1;
            while(start + 1 < end){
                int mid =  start + (end - start)/2;
                //Contact c =  contacts.get(mid);
                //String r = c.getFirstName().substring(0, len);
                //int j = r.compareToIgnoreCase(prefix);
                //int k = r.compareTo(prefix);
                if(contacts.get(mid).getPhone().startsWith(prefix)){
                    start = mid;
                }else if(contacts.get(mid).getPhone().substring(0, len).compareToIgnoreCase(prefix) < 0){
                    start  = mid;
                }else{
                    end = mid;
                }
            }
            if(contacts.get(start).getPhone().startsWith(prefix)){
                return start;
            }else if(contacts.get(end).getPhone().startsWith(prefix)){
                return end;
            }else{
                return -1;
            }
           
    }
    
    public static int searchfirst_Company(ArrayList<Contact> contacts, String prefix){
        int len = prefix.length();
            ArrayList<Contact> res = new ArrayList<Contact>();
            int start  = 0;
            int end = contacts.size() - 1;
            while(start + 1 < end){
                int mid =  start + (end - start)/2;
                //Contact c =  contacts.get(mid);
                //String r = c.getFirstName().substring(0, len);
                //int j = r.compareToIgnoreCase(prefix);
                //int k = r.compareTo(prefix);
                if(contacts.get(mid).getCompany().startsWith(prefix)){
                    end = mid;
                }else if(contacts.get(mid).getCompany().substring(0, len).compareToIgnoreCase(prefix) < 0){
                    start  = mid;
                }else{
                    end = mid;
                }
            }
            if(contacts.get(start).getCompany().startsWith(prefix)){
                return start;
            }else if(contacts.get(end).getCompany().startsWith(prefix)){
                return end;
            }else{
                return -1;
            }
       
    }
    public static int searchlast_Company(ArrayList<Contact> contacts, String prefix){
        int len = prefix.length();
            ArrayList<Contact> res = new ArrayList<Contact>();
            int start  = 0;
            int end = contacts.size() - 1;
            while(start + 1 < end){
                int mid =  start + (end - start)/2;
                //Contact c =  contacts.get(mid);
                //String r = c.getFirstName().substring(0, len);
                //int j = r.compareToIgnoreCase(prefix);
                //int k = r.compareTo(prefix);
                if(contacts.get(mid).getCompany().startsWith(prefix)){
                    start = mid;
                }else if(contacts.get(mid).getCompany().substring(0, len).compareToIgnoreCase(prefix) < 0){
                    start  = mid;
                }else{
                    end = mid;
                }
            }
            if(contacts.get(start).getCompany().startsWith(prefix)){
                return start;
            }else if(contacts.get(end).getCompany().startsWith(prefix)){
                return end;
            }else{
                return -1;
            }
       
    }
}
