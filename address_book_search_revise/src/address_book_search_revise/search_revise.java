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
public class search_revise {
     public static int searchfirst_FirstName_revise(ArrayList<String> firstname_list, String prefix) {
        int len = prefix.length();
        ArrayList<Contact> res = new ArrayList<Contact>();
        int start = 0;
        int end = firstname_list.size() - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //Contact c =  contacts.get(mid);
            //String r = c.getFirstName().substring(0, len);
            //int j = r.compareToIgnoreCase(prefix);
            //int k = r.compareTo(prefix);
           // Contact c = contacts.get(mid);
            if (firstname_list.get(mid).startsWith(prefix)) {
                end = mid;
            } else if (firstname_list.get(mid).substring(0, Math.min(len, firstname_list.get(mid).length())).compareToIgnoreCase(prefix) < 0) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (firstname_list.get(start).startsWith(prefix)) {
            return start;
        } else if (firstname_list.get(end).startsWith(prefix)) {
            return end;
        } else {
            return -1;
        }

    }

    public static int searchlast_FirstName_revise(ArrayList<String> firstname_list, String prefix) {
        int len = prefix.length();

        int start = 0;
        int end = firstname_list.size() - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //Contact c =  contacts.get(mid);
            //String r = c.getFirstName().substring(0, len);
            //int j = r.compareToIgnoreCase(prefix);
            //int k = r.compareTo(prefix);
            String c = firstname_list.get(mid);
            if (c.startsWith(prefix)) {
                start = mid;
            } else if (c.substring(0, Math.min(len, c.length())).compareToIgnoreCase(prefix) < 0) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (firstname_list.get(start).startsWith(prefix)) {
            return start;
        } else if (firstname_list.get(end).startsWith(prefix)) {
            return end;
        } else {
            return -1;
        }

    }

    public static int searchfirst_LastName_revise(ArrayList<String> lastname_list, String prefix) {
        int len = prefix.length();
        ArrayList<Contact> res = new ArrayList<Contact>();
        int start = 0;
        int end = lastname_list.size() - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //Contact c =  contacts.get(mid);
            //String r = c.getFirstName().substring(0, len);
            //int j = r.compareToIgnoreCase(prefix);
            //int k = r.compareTo(prefix);
            String c = lastname_list.get(mid);
            if (c.startsWith(prefix)) {
                end = mid;
            } else if (c.substring(0, Math.min(c.length(), len)).compareToIgnoreCase(prefix) < 0) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (lastname_list.get(start).startsWith(prefix)) {
            return start;
        } else if (lastname_list.get(end).startsWith(prefix)) {
            return end;
        } else {
            return -1;
        }

    }

    public static int searchlast_LastName_revise(ArrayList<String> lastname_list, String prefix) {
        int len = prefix.length();
        ArrayList<Contact> res = new ArrayList<Contact>();
        int start = 0;
        int end = lastname_list.size() - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //Contact c =  contacts.get(mid);
            //String r = c.getFirstName().substring(0, len);
            //int j = r.compareToIgnoreCase(prefix);
            //int k = r.compareTo(prefix);
            String c = lastname_list.get(mid);
            if (c.startsWith(prefix)) {
                start = mid;
            } else if (c.substring(0, Math.min(c.length(), len)).compareToIgnoreCase(prefix) < 0) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (lastname_list.get(start).startsWith(prefix)) {
            return start;
        } else if (lastname_list.get(end).startsWith(prefix)) {
            return end;
        } else {
            return -1;
        }

    }

    public static int searchfirst_PhoneNumber_revise(ArrayList<String> phone_list, String prefix) {
        int len = prefix.length();
        ArrayList<Contact> res = new ArrayList<Contact>();
        int start = 0;
        int end = phone_list.size() - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //Contact c =  contacts.get(mid);
            //String r = c.getFirstName().substring(0, len);
            //int j = r.compareToIgnoreCase(prefix);
            //int k = r.compareTo(prefix);
            String c = phone_list.get(mid);
            if (c.startsWith(prefix)) {
                end = mid;
            } else if (c.substring(0, Math.min(c.length(), len)).compareToIgnoreCase(prefix) < 0) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (phone_list.get(start).startsWith(prefix)) {
            return start;
        } else if (phone_list.get(end).startsWith(prefix)) {
            return end;
        } else {
            return -1;
        }

    }

    public static int searchlast_PhoneNumber_revise(ArrayList<String> phone_list, String prefix) {
        int len = prefix.length();
        ArrayList<Contact> res = new ArrayList<Contact>();
        int start = 0;
        int end = phone_list.size() - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //Contact c =  contacts.get(mid);
            //String r = c.getFirstName().substring(0, len);
            //int j = r.compareToIgnoreCase(prefix);
            //int k = r.compareTo(prefix);
            String c = phone_list.get(mid);
            if (c.startsWith(prefix)) {
                start = mid;
            } else if (c.substring(0, Math.min(c.length(), len)).compareToIgnoreCase(prefix) < 0) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (phone_list.get(start).startsWith(prefix)) {
            return start;
        } else if (phone_list.get(end).startsWith(prefix)) {
            return end;
        } else {
            return -1;
        }

    }

    public static int searchfirst_Company_revise(ArrayList<String> company_list, String prefix) {
        int len = prefix.length();
        ArrayList<Contact> res = new ArrayList<Contact>();
        int start = 0;
        int end = company_list.size() - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //Contact c =  contacts.get(mid);
            //String r = c.getFirstName().substring(0, len);
            //int j = r.compareToIgnoreCase(prefix);
            //int k = r.compareTo(prefix);
            String c = company_list.get(mid);
            if (c.startsWith(prefix)) {
                end = mid;
            } else if (c.substring(0, Math.min(c.length(), len)).compareToIgnoreCase(prefix) < 0) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (company_list.get(start).startsWith(prefix)) {
            return start;
        } else if (company_list.get(end).startsWith(prefix)) {
            return end;
        } else {
            return -1;
        }

    }

    public static int searchlast_Company_revise(ArrayList<String> company_list, String prefix) {
        int len = prefix.length();
        ArrayList<Contact> res = new ArrayList<Contact>();
        int start = 0;
        int end = company_list.size() - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            //Contact c =  contacts.get(mid);
            //String r = c.getFirstName().substring(0, len);
            //int j = r.compareToIgnoreCase(prefix);
            //int k = r.compareTo(prefix);
            String c = company_list.get(mid);
            if (c.startsWith(prefix)) {
                start = mid;
            } else if (c.substring(0, Math.min(c.length(), len)).compareToIgnoreCase(prefix) < 0) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if (company_list.get(start).startsWith(prefix)) {
            return start;
        } else if (company_list.get(end).startsWith(prefix)) {
            return end;
        } else {
            return -1;
        }

    }
}
