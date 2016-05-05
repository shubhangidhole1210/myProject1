package com.nextech.institutemanager.pojo;

public class Subject {

	private String subject;
	private int id;
	private String description;
	public Subject()
	{
		System.out.println("defalt constructor for subject clss");
	}
	public Subject(String subject,int id,String description)
	{
		this.subject=subject;
		this.id=id;
		this.description=description;
	}
	void display()
	{
		System.out.println("parameterized constructor for subject class");
		System.out.println("subject name:-"+subject);
		System.out.println("subject id:-"+id);
		System.out.println("description:-"+description);
	}
	public void setData(String subject,int id,String description)
	{
		this.subject=subject;
		this.id=id;
		this.description=description;
	}
	public void getData()
	{
		System.out.println("subject info");
		System.out.println("subject name:-"+subject);
		System.out.println("subject id:-"+id);
		System.out.println("description:-"+description);
	}
	public static void main(String[] args) {
		Subject subject=new Subject();
		subject.setData("c++", 123, "its ojrct oreined language");
		subject.getData();
		Subject subject1=new Subject();
		Subject subject2=new Subject("java",121,"its platform independent language");
		subject2.display();

	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
