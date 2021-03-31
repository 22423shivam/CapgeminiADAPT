package io.org.annote;

// importing javax annotation
import javax.annotation.*;

public class Employee {

	private int empId;
	private String empName;
	
	// using Resource to directly search for 'votercard' bean and inject the dependency
	//
	// COULD HAVE ALSO USED [ @INJECT ] by importing [ javax.inject.* ]
	@Resource
	private VCard votercard;

	public int getEmpId() {return empId;}
	public void setEmpId(int empId) {
		this.empId = empId;}

	public String getEmpName() {
		return empName;}
	public void setEmpName(String empName) {
		this.empName = empName;}

	public VCard getVotercard() {
		return votercard;}
	public void setVotercard(VCard votercard) {
		this.votercard = votercard;}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", votercard=" + votercard + "]";
	}
	
	
}
