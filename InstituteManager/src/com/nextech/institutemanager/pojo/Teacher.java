package com.nextech.institutemanager.pojo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date

public class Teacher {

	private String name;
	private String education;
	//3. Subject array
	private String id;
	private int employee_id;
	private String department;
	private int mobile_number;
	int date_of_joining;
	private Connection connect;
	private PreparedStatement preparedStatement;
	public Teacher()
	{
		System.out.println("its default constructor for teacher class");
	}
	public Teacher(String name, String education,String id,int employee_id,String department,int mobile_number)
	{
		this.name=name;
		this.education=education;
		this.id=id;
		this.employee_id=employee_id;
		this.department=department;
		this.mobile_number=mobile_number;
	}
	void diplay()
	{

	}
	public void setData(String name, String education,String id,int employee_id,String department,int mobile_number)
	{
		this.name=name;
		this.education=education;
		this.id=id;
		this.employee_id=employee_id;
		this.department=department;
		this.mobile_number=mobile_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	public int getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(int date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public void getData()
	{
		System.out.println("Teacher data");
		System.out.println("name:-"+name);
		System.out.println("education:-"+education);
		System.out.println("id:-"+id);
		System.out.println("employee id:-"+employee_id);
		System.out.println("Department:-"+department);
		System.out.println("Mobile_number:-"+mobile_number);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher teacher=new Teacher();
		teacher.setData("Amit", "engineering", "abc", 123, "mech", 78989080);
        teacher.getData();
        Teacher teacher1=new Teacher();
        Teacher teacher2=new Teacher("mr.joshi","engineering","abcd",121,"IT",78789890);
        teacher2.diplay();
       
	}


}
