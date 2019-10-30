package mypackage;

public class Car {
	String modelNo;
	String carname;
	String company;
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Car(String modelNo, String carname, String company) {
		super();
		this.modelNo = modelNo;
		this.carname = carname;
		this.company = company;
	}
	@Override
	public String toString() {
		return getModelNo()+" "+getCarname()+" "+getCompany();
	}
	
	

}
