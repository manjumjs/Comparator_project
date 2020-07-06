package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PersonMain {
	
	    public static void main (String[] args) 
	    { 
	        ArrayList<person> list = new ArrayList<person>(); 
	        Scanner scan = new Scanner(System.in);
	        Scanner scan1 = new Scanner(System.in);
	       
	        while(true)
	        {
	        	System.out.println("Enter the name :");
	            String name=scan1.nextLine();
	            
	            String[] str = name.split(" ");
	        	
	            
	            System.out.println("Enter the Age :");
	            int age=scan.nextInt();
	            
	        	System.out.println("Enter the City");
	        	String city=scan.next();
	        	
	        	if(str.length==2)
	        		list.add(new person(str[0],str[1],age,city));
	        	else
	        		list.add(new person(str[0],"123",age,city));
	        	 
	        	System.out.println("Do u want add more ? (y/n) :");
	        	char c= scan.next().charAt(0);
	        	
	        	if(c=='n')
	        		break;
	        	
	        }
	        
	        System.out.println("after sorting");
	        
	       // Collections.sort(list, new SortByFirstname());
	      Collections.sort(list, new SortByLname());
		 // Collections.sort(list, new SortByAge());
		 // Collections.sort(list, new SortByCity());
	        
	        for (person person : list) {
	        	person.printmethod();
			}
	       
	         
	    } 
	

}
