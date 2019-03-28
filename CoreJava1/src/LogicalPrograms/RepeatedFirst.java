package LogicalPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class RepeatedFirst {

	
		
	 public static Character RepeatedFirst(String str)
	 {
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		Character c;
		int length=str.length();
		for(int i=0;i<length;i++)
		{
		c=str.charAt(i);
		if(hmap.containsKey(c))
		{
			hmap.put(c,hmap.get(c)+1);
			
		}
		else
		{
			hmap.put(c,1);
		}
	}

		Set map=hmap.entrySet();
		Iterator itr=map.iterator();
				
				while(itr.hasNext())
				{
					Map.Entry key=(Entry) itr.next();
					System.out.println(key.getKey()+""+key.getValue());
					
					
					
				}
		
	/*Set	set= hmap.keySet();
	Iterator itr= set.iterator();
	while(itr.hasNext())
	{
		Object key=itr.next();
		
	}
	*/
	
	for(int i=0;i<length;i++)
	{
		c=str.charAt(i);
		if(hmap.get(c)== 1)
		{
		return c;
		}
	}
return null;
		 
	 }
	 
	 public static void main(String[] args) {
			System.out.println("User please enter a string:::::::;");
			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			Character ch=RepeatedFirst(str);
			System.out.println("The first non repeated character in the string is::::::"+ch);
		}
	
}
