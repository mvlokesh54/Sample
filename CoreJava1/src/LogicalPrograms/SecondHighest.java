package LogicalPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondHighest {

	/**
	 * @param args
	 * This logic program for first highest, second highest and lowest number in array.
	 */
	public static void main(String[] args) {

		/*int array[]={5,69,8,32,6,4,1,7};
	int	highest_num=0;
	int second_highest=0;
	int last_num=0;
	
	for(int e:array)
	{
		
		if(highest_num<e)
		{
			second_highest=highest_num;
			last_num=second_highest;
			highest_num=e;
		}
		else if(second_highest<e)
		{
			
			second_highest=e;
		}
		else if(last_num>e)
		{
			last_num=e;
		}
	}
		
	System.out.println("highest"+highest_num+"second_highest"+second_highest+" lowest_num--"+last_num);
		
	*/
		
		/*int array[]={1,2,3,4,5};
		System.out.println("array original String:"+Arrays.toString(array));
		int length= array.length;
		 
		int b[] = null;
		for(int i=length-1;i>0;i--)
		{
			//System.out.println(array[i]);
			array[i]=array[i-1];
			
		}
		System.out.println(" array revers"+Arrays.toString(array) );*/
		
		
		/*int array[]={1,2,3,4,5};
		System.out.println("array original String:"+Arrays.toString(array));
		
		  List<Integer> listarray= Arrays.asList(array);
		Collections.reverse(listarray);
		
		Integer[] reverse = listarray.toArray(array);
		
		System.out.println(reverse);
		*/
		
		/*int[] array={1,2,3,4,5};
		System.out.println("array original String:"+Arrays.toString(array));
		System.out.println("Original Array"+array);
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}

		System.out.println("array Reverse String:"+Arrays.toString(array));*/
		
	}
}
