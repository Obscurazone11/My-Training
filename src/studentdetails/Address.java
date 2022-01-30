package studentdetails;
public class Address {
	private String houseName;
	private String place;
	private String district;
	private String state;
	private int pincode;
	private Student student;
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void display()
	{
		System.out.println("......STUDENT DETAILS......");
		System.out.println("NAME : "+getStudent().getName());
		System.out.println("ROLL NUMBER : "+getStudent().getRollnumber());
		System.out.println("ADDRESS : ");
		System.out.println("HOUSE NAME : "+getHouseName());
		System.out.println("PLACE : "+getPlace());
		System.out.println("DISTRICT : "+getDistrict());
		System.out.println("STATE : "+getState());
		System.out.println("PIN CODE : "+pincode);

	}
}
