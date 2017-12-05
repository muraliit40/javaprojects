package co.edureka;

public class Employee {
	//Attributes
    int eid;
	String ename;
	String eaddress;
//Methods
	public Employee()
	{
		System.out.println("--Employee Object constructed:");
	}
public Employee(int eid, String ename, String eaddress) {
	
	this.eid = eid;
	this.ename = ename;
	this.eaddress = eaddress;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEaddress() {
	return eaddress;
}
public void setEaddress(String eaddress) {
	this.eaddress = eaddress;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + "]";
}
	public void myInit() {
		System.out.println("---object Initialized--");
		
	}
	public void myDestroy() {
		System.out.println("---object Initialized--");
		
	}
}
