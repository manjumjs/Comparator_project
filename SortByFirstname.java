package comparator;

import java.util.*;


public class SortByFirstname implements Comparator<person> 
{
	 
	    @Override
	    public int compare(person a, person b) 
	    { 
	        return a.getFname().compareTo(b.getFname());
	    } 
	

}
