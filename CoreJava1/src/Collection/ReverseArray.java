package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	
	
	public void Reverse(int[] a)
	{
		
		
		int i=0,j=a.length-1,temp=0;
		System.out.println(a.length/2);
		
		for(;i<a.length/2;i++,j--)
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int[] a={1,2,3,4,5};
		System.out.println("before array=="+Arrays.toString(a));
		ReverseArray RA= new ReverseArray();
		RA.Reverse(a);
		System.out.println(Arrays.toString(a));
		
		/*String[] array= {"lokesh","vital","raj","deva"};
		
		
		System.out.println(Arrays.toString(array));
		
		 List<String> ListArray= Arrays.asList(array);
		 
		 Collections.reverse(ListArray);
		 
		 System.out.println("Reverse String Array"+Arrays.toString(ListArray.toArray(array)));
		*/
		
		/*int[] array={1,2,3,4,5};
		System.out.println(Arrays.toString((array)));
		Object StringArray = Arrays.toString(array);
		List listA =Arrays.asList(array);
		System.out.println("listA before=="+listA);
		Collections.reverse(listA);
		System.out.println("listA=="+listA);
		//System.out.println(""+Collections.reverse(listA));
		System.out.println("Reverse s"+Arrays.toString(listA.toArray((Object[]) StringArray)));
		*/
		
		/*int array revers without using another array
		 * */
		
		

		
		
	}

}
