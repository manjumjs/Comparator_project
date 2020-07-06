package comparator;

public class person {

	
	private String fname;
	private String lname=null;
	private int age;
	private String city;
	
	
	
	public person(String fname, String lname, int age, String city) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.city = city;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	
	public void printmethod() {
		if(lname!=null&&lname!="123")
			 System.out.println("person ["+fname +" "+lname  + " "+age +" "+ city + "]");
		else if(lname.equals("123")||lname==null)
			System.out.println("person ["+fname + " "+age +" "+ city + "]");
			
		
	}
	
}


