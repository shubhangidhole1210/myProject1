package com.nextech.institutemanager.pojo;

public class Student {
	private String name;
	private String clas;
	private int id;
	private int role_number;
	private int mobile_number;
	private int home_phone_number;
	private int year_of_joining;

	public Student() {
		System.out.println("its default constructor for student class");
	}

	public Student(String name, String clas, int id, int role_number,
			int mobile_number, int home_phone_number, int year_of_joining) {
		this.name = name;
		this.clas = clas;
		this.id = id;
		this.role_number = role_number;
		this.mobile_number = mobile_number;
		this.home_phone_number = home_phone_number;
		this.year_of_joining = year_of_joining;
	}

	void display() {
		System.out.println("..its parametrize constructor..");
		System.out.println("name of student:-" + name);
		System.out.println("student class:-" + clas);
		System.out.println("student id:-" + id);
		System.out.println("student role number:-" + role_number);
		System.out.println("student mobile number:-" + mobile_number);
		System.out.println("home phone number:-" + home_phone_number);
		System.out.println("year of joining:-" + year_of_joining);
	}

	void setData(String name, String clas, int id, int role_number,
			int mobile_number, int home_phone_number, int year_of_joining)

	{
		this.name = name;
		this.clas = clas;
		this.id = id;
		this.role_number = role_number;
		this.mobile_number = mobile_number;
		this.home_phone_number = home_phone_number;
		this.year_of_joining = year_of_joining;
	}

	void getData() {
		System.out.println("student field");
		System.out.println("name:-" + name);
		System.out.println("class:-" + clas);
		System.out.println("id:-" + id);
		System.out.println("Role_number:-" + role_number);
		System.out.println("mobile no:-" + mobile_number);
		System.out.println("Home_phone_number:-" + home_phone_number);
		System.out.println("Year_of_joining:-" + year_of_joining);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setData("shubh", "BE", 123, 1, 7777777, 27962, 2015);
		student.getData();
		Student student1 = new Student();
		Student student2 = new Student("sakshi", "IT", 222, 2, 8888888, 2045,
				2015);
		student2.display();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRole_number() {
		return role_number;
	}

	public void setRole_number(int role_number) {
		this.role_number = role_number;
	}

	public int getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}

	public int getHome_phone_number() {
		return home_phone_number;
	}

	public void setHome_phone_number(int home_phone_number) {
		this.home_phone_number = home_phone_number;
	}

	public int getYear_of_joining() {
		return year_of_joining;
	}

	public void setYear_of_joining(int year_of_joining) {
		this.year_of_joining = year_of_joining;
	}

}
