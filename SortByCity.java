package comparator;

import java.util.*;


public class SortByCity implements Comparator<person> 
{
	 
	    @Override
	    public int compare(person a, person b) 
	    { 
	    	return a.getCity().compareTo(b.getCity());
	    } 
	

}
