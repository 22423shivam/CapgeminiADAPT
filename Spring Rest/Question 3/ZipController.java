package com.capgemini.springrest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZipController {
	
	// getting the details
	@RequestMapping(value="c{zip}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public String zipD(@PathVariable ("zip") int zip) {
		
		// creating the data
		// this can be got from already configured DB,
		// here is just for example
		Zipcode z1 = new Zipcode(99501,new ZipDetails("AK", "ANCHORAGE", "US"));
		Zipcode z2 = new Zipcode(99502,new ZipDetails("DH", "DELHI", "INDIA"));
		//Zipcode z3 = new Zipcode(4,new ZipDetails("KL", "WEST", "INDIA"));
		
		// creating a list of zipcodes to search for later
		List<Zipcode> ziplist = new ArrayList<>();
		ziplist.add(z1);
		ziplist.add(z2);
		//ziplist.add(z3);
		
		// iterating through the list of zipcodes
		// to get the zipcode present or not and then
		// return the details if there
		for(Zipcode i : ziplist) {
			if(i.getZipCode()==zip) {
				
				// directly printing the details
				i.getZipdetails().toString();
				
			}else { return i.getZipdetails().toString();
					//return "Invalid zip";
					}
		}
		return null;
	}
}
