package CapgeminiAssignment;
public class Emp {
	 int id;
	 String name;
	 
	 Emp(int id, String name){
		 this.id=id;
		 this.name=name;
	 }
	 
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	 public boolean equals(Object o){
		 
		 Emp emp=(Emp) o;
		 return emp.getId()!=this.getId();
		 
	 }
	 
	public int hashcode(){
		 return id;
	 }
	}

	public class Assignment3Q5{

	public static void main(String[] args) {
		Hashtable<Emp, String> ht=new Hashtable<Emp, String>();
		Emp emp=new Emp(101, "Nayana");
		Emp emp1=new Emp(104, "rani");
		Emp emp2=new Emp(110, "Suda");
	
		
		System.out.println(emp.hashcode());
		System.out.println(emp.equals(emp1));
		
	}}