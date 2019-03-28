package LogicalPrograms;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;


public class FirstNonRepeated {
    
    public static void main(String[] args)
    {
        
        System.out.println(" Please enter the input string :" );
        Scanner in = new Scanner (System.in);
        String s=in.nextLine();
        char c=firstNonRepeatedCharacter(s);
        System.out.println("The first non repeated character is :  " + c);
    }
    
    public static Character firstNonRepeatedCharacter(String str)
    {
        HashMap<Character,Integer>  characterhashtable= 
                     new HashMap<Character ,Integer>();
        int i,length ;
        Character c ;
        length= str.length();  
        TreeSet a=new TreeSet();
        for (i=0;i < length;i++)
        {
            c=str.charAt(i);
       
            if(characterhashtable.containsKey(c))
            {
               a.add(c);
               System.out.println("Duplicate s "+a);
                characterhashtable.put(  c ,  characterhashtable.get(c) +1 );
            }
            else
            {
                characterhashtable.put( c , 1 ) ;
            }
        }
        
        
        for (i =0 ; i < length ; i++ )
        {
            c= str.charAt(i);
            if( characterhashtable.get(c)  == 1 )
            return c;
        }
        
        
        return null ;
    }
} 