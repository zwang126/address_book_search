/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address_book_search_revise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class importCsv {
     public static ArrayList<Contact> importCsv(String filename) throws FileNotFoundException, IOException{
        ArrayList<Contact> contacts_list = new ArrayList<>();
        Path pathToFile = Paths.get(filename);
        try (BufferedReader br = Files.newBufferedReader(pathToFile)){
            String line = br.readLine();
            while(line != null){
                 String[] attributes = line.split(",");
                 Contact contact = createContact(attributes);
                 contacts_list.add(contact);
                 line = br.readLine();
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        return contacts_list;
    }
    
    private static Contact createContact (String[] metadata){
        String firstName = metadata[0];
        String lastName = metadata[1];
        String phone = metadata[2];
        String company = metadata[3];
        return new Contact(firstName, lastName, phone, company);
    }
}
