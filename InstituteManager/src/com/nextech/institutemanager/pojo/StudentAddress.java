package com.nextech.institutemanager.pojo;

public class StudentAddress {

	private String id;
	private int student_id;
	private String address1;
	private String address2;
	private int pincode;
	private String district;
	private String state;
	public void setData(String id,int student_id ,String address1,String address2,int pincode,String district,String state)
	{
		this.id=id;
		this.student_id=student_id;
		this.address1=address1;
		this.address2=address2;
		this.pincode=pincode;
		this.state=state;
		this.district=district;

	}
	public StudentAddress()
	{
		System.out.println("its default constructor for StudentAdress class");
	}
	StudentAddress(String id,int student_id ,String address1,String address2,int pincode,String district,String state)
	{
		this.id=id;
		this.student_id=student_id;
		this.address1=address1;
		this.address2=address2;
		this.pincode=pincode;
		this.state=state;
		this.district=district;

	}
	void display()
	{
		System.out.println("its parametrize constructor for studentAddress class");
		System.out.println("ID:-"+id);
		System.out.println("Student id:-"+student_id);
		System.out.println("Address1:-"+address1);
		System.out.println("Address2:-"+address2);
		System.out.println("Pincode:-"+pincode);
		System.out.println("District:-"+district);
		System.out.println("State:-"+state);
	}
	public void getData()
	{
		System.out.println("student address info");
		System.out.println("ID:-"+id);
		System.out.println("Student id:-"+student_id);
		System.out.println("Address1:-"+address1);
		System.out.println("Address2:-"+address2);
		System.out.println("Pincode:-"+pincode);
		System.out.println("District:-"+district);
		System.out.println("State:-"+state);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAddress studentAddress =new StudentAddress();
		studentAddress.setData("abc", 135, "baramati", "pune", 1234, "pune", "mharashtra");
		studentAddress.getData();
		StudentAddress studentAddress1=new StudentAddress();
		StudentAddress studentAddress2=new StudentAddress("pqr", 121, "Delhi", "mumbai", 123, "pune", "jammu");
		studentAddress2.display();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
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

}
