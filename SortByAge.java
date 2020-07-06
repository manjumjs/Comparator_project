package comparator;

import java.util.*;


public class SortByAge implements Comparator<person> 
{
	 
	    @Override
	    public int compare(person a, person b) 
	    { 
	        return a.getAge() - b.getAge();
	    } 
	

}
