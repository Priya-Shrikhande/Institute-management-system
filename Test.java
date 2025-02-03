package com.cjc.ims.app.client;
import com.cjc.ims.app.serviceimpl.*;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Karvenagar karve=new Karvenagar();
		Scanner sc=new Scanner(System.in);
		int ch;
		do{
		System.out.println("--------------Institute Management System----------------");
		System.out.println("Enter choice :\n"+"1.add course \n"+"2.view course\n"+"3.add Faculty\n"+"4.View Faculty\n"+
					"5.add Batch\n"+"6.view batch\n"+"7.add Student \n"+"8.view Student \n" +"9.Exit");
		ch=sc.nextInt();
		System.out.println("----------------------------------");

		if(ch==1)
		{
			karve.addCourse();
			System.out.println("----------------------------------");
		}
		else if(ch==2)
		{
			karve.viewCourse();
			System.out.println("----------------------------------");
		}
		else if(ch==3)
		{
			karve.addFaculty();
			System.out.println("----------------------------------");
		}
		else if(ch==4)
		{
			karve.viewFaculty();
			System.out.println("----------------------------------");
		}
		else if(ch==5)
		{
			karve.addBatch();
			System.out.println("----------------------------------");
		}
		else if(ch==6)
		{
			karve.viewBatch();
			System.out.println("----------------------------------");
		}
		else if(ch==7)
		{
			karve.addStudent();
			System.out.println("----------------------------------");
		}
		else if(ch==8)
		{
			karve.viewStudent();
			System.out.println("----------------------------------");
		}

		else if(ch==9)
		{
			System.exit(0);
			System.out.println("----------------------------------");
		}
		else
		{
			System.out.println("Enter correct choice....");
			System.out.println("----------------------------------");
		}
		}while(ch!=9);
		
	}
}
