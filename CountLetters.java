//import java.util.ArrayList;
import java.util.*;

public class Main
{
    public static void main(String[] args) {
    ArrayList<String> letters = new ArrayList<String>();// новый массив с буквами
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("a");
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("b");
          
        System.out.println(letters.get(0));// получаю 1й элемент из списка - вспоминаю, что можно ещё слелать со списком
        System.out.println("---*---");
        
        for(String letter : letters){
          
            System.out.println(letter);// весь спиок как список
        }
        
         for ( String l: letters)
            System.out.print(l +", ");// весь список строкой
            
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Integer item;

        for (String ltr : letters) {
 
            
            item = hm.get(ltr);
            if (item == null) hm.put(ltr, 1);
            else hm.put(ltr, item + 1);
        }
        
        System.out.println(); 
        
        System.out.println("Количество каждой буквы");
        System.out.println(hm);
         
         
    }
}