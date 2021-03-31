
package CapgeminiAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class movies_detail{
	private String movieName;
    private String actor;
    private String actress;
    private String genre;
    
    
    public movies_detail( String movieName, String actor, String actress, String genre)
    {
    	this.movieName = movieName;
    	this.actor = actor;
    	this.actress = actress;
    	this.genre = genre;
    }
  
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getActress() {
		return actress;
	}
	public void setActress(String actress) {
		this.actress = actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	}

class Assignment3Q10{
	public static void main(String[] args) {
		LinkedList<movies_detail> a = new LinkedList<>();
		movies_detail m1=new movies_detail("Yeh jawani hai deewani","Ranbir Kapoor", "Deepika padukone", "Romance, comedy");  
		movies_detail m2=new movies_detail("Veer Zaara", "Shahrukh Khan","Rani mukherji","Romance");  
		movies_detail m3=new movies_detail("Lage raho munna bhai", "Sanjay dutt", "Vidhya balan","Comedy");  
		movies_detail m4=new movies_detail("Bhaag Milkha bhaag", "Farhan Akhtar", "Sonam Kapoor","Biopic");
		movies_detail m5=new movies_detail("Dabang","Salman Khan", "Sonakshi Sinha","Action and drama");
	    
	    a.add(m1);  
	    a.add(m2);  
	    a.add(m3); 
	    a.add(m4); 
	    a.add(m5); 
	    a.remove(m4);
	    
	    Iterator<movies_detail> itr=a.iterator();  
	    //traversing elements of ArrayList object  
	    while(itr.hasNext()){  
	      movies_detail st=(movies_detail)itr.next();  
	      System.out.println(" Movie Name : "+st.getMovieName()+"\n"+" Actor name : "+st.getActor()+" Actress Name : "+st.getActress()+" Genre Type : "+st.getGenre());  
	    }  
	}
}
