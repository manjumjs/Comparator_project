package comparator;

import java.util.*;


public class SortByLname implements Comparator<person> 
{
	 
	    @Override
	    public int compare(person a, person b) 
	    { 
	        return a.getLname().compareTo(b.getLname());
	    } 
	

}
