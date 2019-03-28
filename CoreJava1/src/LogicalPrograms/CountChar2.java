package LogicalPrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CountChar2 {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		
		/*String s="lokeshok";
		StringBuilder sb= new StringBuilder(s);
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s.length();j++)
			{
			System.out.println("i value"+s.charAt(i)+"j value"+s.charAt(j));	
				
				if(s.charAt(i)== s.charAt(j))
				{
					sb.deleteCharAt(i);
				}
			}
			System.out.println("sb in forloop"+sb);
		}
		System.out.println("sb value"+sb);
	}*/
		
		/*String s="kkkishorek";
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=new StringBuffer(s);
		char[] ch=s.toCharArray();*/
		
		/*Set st= new HashSet();
		
		for(char c:ch){
			st.add(c);
		}
		
		for(Object c1:st){
			sb.append(c1);
		}
		sb.toString();
			
		System.out.println(st);*/
	
		/*HashMap hm= new HashMap();
		
		for(int i=0;i<sb.length();i++){
			for(int j=sb.length();j<0;j--){
				if(sb.charAt(i)==sb.charAt(j))
					sb.deleteCharAt(i);
				sb.deleteCharAt(j);
			}
			
		}
		sb.toString();
		
		System.out.println(sb);*/
		
		
		//kkkishore
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any word : ");
         String s = br.readLine();
        int l = s.length();
        char ch;
        String ans="";
         
        for(int i=0; i<l; i++)
        {
            ch = s.charAt(i);
            if(ch!=' ')
                ans = ans + ch;
            s = s.replace(ch,' '); //Replacing all occurrence of the current character by a space
        }
 
       System.out.println("Word after removing duplicate characters : " + ans);
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
				

}

