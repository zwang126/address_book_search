/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address_book_search_revise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class getString {
    public static int[] getNumArray(List<String> list){
        int size = list.size();
        int[] res = new int[size];
        int i = 0;
        for(String s : list){
            int k = s.lastIndexOf(":");
            String j = s.substring(k + 1);
            int num2 = Integer.parseInt(j);
            res[i] = num2;
            i++;
        }
        return res;
    }
}
