package com.nextech.institutemanager.pojo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Department {

	private String name;
	private int id;
	private String description;
	public Department()
	{
		System.out.println("its default constructor for department class");
	}
	public Department(String name,int id,String description)
	{

		this.name=name;
		this.id=id;
		this.description=description;
	}
	void display()
	{
		System.out.println("its paramaetrize constructor for Department class");
		System.out.println("department info");
		System.out.println("department name:-"+name);
		System.out.println("department id:-"+id);
		System.out.println("desciption:-"+description);
	}

	public void setData(String name,int id,String description)
	{
		this.name=name;
		this.id=id;
		this.description=description;
	}

	public void getData()
	{
		System.out.println("department info");
		System.out.println("department name:-"+name);
		System.out.println("department id:-"+id);
		System.out.println("desciption:-"+description);
	}
	public static void main(String[] args) {
		Department department =new Department();
		department.setData("IT", 123, "its info tech department");
		department.getData();
		Department department1=new Department();
		Department department2=new Department("comp",111,"its computer science department");

		department2.display();
		 try
	        {
	          // create a mysql database connection
	          String myDriver = "org.gjt.mm.mysql.Driver";
	          String myUrl = "jdbc:mysql://localhost/test";
	          Class.forName(myDriver);
	          Connection conn = DriverManager.getConnection(myUrl, "root", "system");

	          // create a sql date object so we can use it in our INSERT statement
	         // Calendar calendar = Calendar.getInstance();
	        //  java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

	          // the mysql insert statement
	          String query = " insert into department (idDepartment,nameDepartment,descriptionDepartment)"
	                      + " values (?, ?, ?)";

	          // create the mysql insert preparedstatement
	          PreparedStatement preparedStmt = conn.prepareStatement(query);
	          preparedStmt.setInt(1, 11);
	          preparedStmt.setString (2, "IT");
	          preparedStmt.setString(3,"its information tech department");
	          // execute the preparedstatement
	          preparedStmt.execute(query);

	          conn.close();
	        }
	        catch (Exception e)
	        {
	          System.err.println("Got an exception!");
	          System.err.println(e.getMessage());
	        }
	}




}
