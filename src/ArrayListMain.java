import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		//ArrayList creation
		List<String> nameList = new ArrayList<String>();
		
		
		//adding names to the list
		nameList.add("Peter");
		nameList.add("Jerry");
		nameList.add("Landon");
		nameList.add("Mark");
		nameList.add("Roger");
		nameList.add("Gilford");
		nameList.add("Arnold");
		nameList.add("Edward");
		
		//enhanced for loop to display names
		for(String nameDisplay : nameList) {
			System.out.println(nameDisplay);
		}
		
		//use of collections class to sort names
		System.out.println("----Sorting Names for Display----");
		Collections.sort(nameList);
		
		//Display sorted name list
		for(String nameDisplay : nameList) {
			System.out.println(nameDisplay);
		}
		
		//use of collections class to shuffle the name 
		System.out.println("----Shuffling Names for Display----");
		Collections.shuffle(nameList);
		for(String nameDisplay : nameList) {
			System.out.println(nameDisplay);
		}
		//Number display of item in list
		System.out.println("--Accessing location of item in list---");
		System.out.println(nameList.indexOf("Gilford"));
		//Number display of item not in list. Negative one as it is not in the list
		//Pretty interesting as in Python you can use -1 for the last element in an array.
		System.out.println("--Accessing location of item not in list---");
		System.out.println(nameList.indexOf("Annabelle"));
		
		System.out.println("---Converting to Array---");
		String nameArray[] = new String[nameList.size()];
		nameArray = nameList.toArray(nameArray);
		
		for(int i =0; i < nameArray.length; i++) {
			System.out.println(i + " is the name " + nameArray[i] + " in the converted array." );
		}
		
		//using Arrays class to call on the Arrays asList function.
		System.out.println("---Converting from Array to ArrayList---");
		List<String> convertedFromArray = Arrays.asList(nameArray);
		//Created new List to display the ConvertedArray
		for(String names : convertedFromArray) {
			System.out.println(names);
		}
		
	}

}
