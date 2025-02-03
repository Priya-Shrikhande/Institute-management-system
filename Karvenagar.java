package com.cjc.ims.app.serviceimpl;

import com.cjc.ims.app.servicei.Cjc;
import java.util.*;
import com.cjc.ims.app.model.*;

public class Karvenagar implements Cjc{

	List<Course> clist=new ArrayList<>();
	List<Faculty> flist=new ArrayList<>();
	List<Batch> blist=new ArrayList<>();
	List<Student> slist=new ArrayList<>();

	Scanner sc=new Scanner(System.in);


	@Override
	public void addCourse() {
		Course c=new Course();
		System.out.println("Enter course id : ");
		c.setCid(sc.nextInt());
		System.out.println("Enter course name : ");
		c.setCname(sc.next());
		clist.add(c);
	}

	@Override
	public void viewCourse() {
		System.out.println("Course details....");
		Iterator<Course> itr=clist.iterator();
		while(itr.hasNext())
		{
			Course cs=itr.next();
			System.out.println("Course name :" +cs.getCname());
			System.out.println("Course id : "+cs.getCid());
		}
		
	}

	@Override
	public void addFaculty() {
		Faculty f=new Faculty();
		System.out.println("Enter Faculty id :");
		f.setFid(sc.nextInt());
		System.out.println("Enter Faculty name :");
		f.setFname(sc.next());
		loop:
		while(true)
		{
		System.out.println("Enter course id :");
		int i=sc.nextInt();
		for(Course c:clist)
		{
			if(c.getCid()==i)
			{
				f.setCourse(c);
				break loop;
			}
			else
			{
				System.out.println("Course does not exixt...");
			}
		}
		
		}
		flist.add(f);				
	}

	@Override
	public void viewFaculty() {
		System.out.println("Faculty details....");

		Iterator<Faculty> itr=flist.iterator();
		while(itr.hasNext())
		{
			//System.out.println("");
			Faculty fs=itr.next();
			System.out.println("Faculty name :" +fs.getFname());
			System.out.println("Faculty id : "+fs.getFid());
			System.out.println("Course name :" +fs.getCourse().getCname());
			System.out.println("Course id : "+fs.getCourse().getCid());
		}		
	}

	@Override
	public void addBatch() {
		Batch b=new Batch();
		System.out.println("Enter Batch id :");
		b.setBid(sc.nextInt());
		System.out.println("Enter Batch name :");
		b.setBname(sc.next());
		loop:
		while(true)
		{
		System.out.println("Enter Faculty id :");
		int i=sc.nextInt();
		for(Faculty f:flist)
		{
			if(f.getFid()==i)
			{
				b.setFaculty(f);
				break loop;
			}
			else
			{
				System.out.println("Faculty does not exixt...");
			}
		}
		
		}
		blist.add(b);	
	}

	@Override
	public void viewBatch() {
		System.out.println("Batch details....");

		Iterator<Batch> itr=blist.iterator();
		while(itr.hasNext())
		{
			Batch bs=itr.next();
			System.out.println("Batch name :" +bs.getBname());
			System.out.println("Batch id :" +bs.getBid());
			System.out.println("Faculty name :" +bs.getFaculty().getFname());
			System.out.println("Faculty id : "+bs.getFaculty().getFid());
			System.out.println("Course name :" +bs.getFaculty().getCourse().getCname());
			System.out.println("Course id : "+bs.getFaculty().getCourse().getCid());

		}
		
	}

	@Override
	public void addStudent() {
		Student s=new Student();
		System.out.println("Enter student id");
		s.setSid(sc.nextInt());
		System.out.println("Enter student name");
		s.setSname(sc.next());
		loop:
		while(true)
		{
		System.out.println("Enter Batch id :");
		int i=sc.nextInt();
		for(Batch b:blist)
		{
			if(b.getBid()==i)
			{
				s.setBatch(b);
				break loop;
			}
			else
			{
				System.out.println("batch does not exixt...");
			}
		}
		
		}
		slist.add(s);	

	}

	@Override
	public void viewStudent() {
		System.out.println("Student details....");

		Iterator<Student> itr=slist.iterator();
		while(itr.hasNext())
		{
			Student ss=itr.next();
			System.out.println("Student name : "+ss.getSname());
			System.out.println("Student id : "+ss.getSid());
			System.out.println("Batch name :" +ss.getBatch().getBname());
			System.out.println("Batch id :" +ss.getBatch().getBid());
			System.out.println("Faculty name :" +ss.getBatch().getFaculty().getFname());
			System.out.println("Faculty id : "+ss.getBatch().getFaculty().getFid());
			System.out.println("Course name :" +ss.getBatch().getFaculty().getCourse().getCname());
			System.out.println("Course id : "+ss.getBatch().getFaculty().getCourse().getCid());

		}

	}

}
