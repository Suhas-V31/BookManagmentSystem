package com.bms.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.bms.db.BookDAO;
import com.bms.entity.Book;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String choice = "";
		BookDAO b1 = new BookDAO();
		
		do {
			System.out.println("select a choice");
			System.out.println("1.Issue book to a student ");
			System.out.println("2.exit");
			
			choice = sc.nextLine();
			
		
		switch(choice) {
		case "1":
			System.out.println("Enter the Student usn");
			String studentUsn = sc.nextLine();
			System.out.println("Enter the Student name");
			String studentName = sc.nextLine();
			
			System.out.println("Enter issue date(dd/MM/yyy)");
			String issueDate = sc.nextLine();
			 Date iDate = null;
			
			try {
				 iDate = new SimpleDateFormat("dd/MM/yyyy").parse(issueDate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			System.out.println(issueDate);
		
			
			System.out.println("Please enter the book ISBN to search");
			int searchISBN = sc.nextInt(); sc.nextLine();
			
		    Book result = b1.getBook(searchISBN);
		    {
		    	 if(result == null)
				    {
				    	System.out.println("Sorry book not found");
				    }
				    else
				    {
				    	System.out.println(result.getISBN() + "== " + " Book is available");
				    }
		    }
		    
		/*   Book available = b1.getBook(searchISBN);
		    if(available == null){
		    	System.out.println("Book unavailable ");
		    }
		    else
		    {
		    	System.out.println("Book available");
		    }
		    	
			b1.issueBook(new Student(studentUsn,studentName), iDate, searchISBN);
		    System.out.println("Book issued");*/
		    
			break;
			
		case "2":
			System.out.println("Exiting application");
			break;
		default:
			break;
		}
			
		} while (!choice.equals("2"));
		sc.close();
		
		}
		
	}
	
	
		/*Student s1 = new Student("18ME044","Subrahmanya");
		if(b1.create(s1))
		{
			System.out.println("Student created");
		}*/

	/*	Issue b1 = new Issue();
		List<Book> list = b1.getAll();
		
		for(Book b : list)
		{
		System.out.println(b.getAuthor() + "==" + b.getTitle() + "->" + b.getCategory()
						+ "->" + b.getISBN() + "->" + b.getNoofbooks());
		}
	}*/	
		
		/*Issue b1 = new Issue();
		
		Book b = b1.getBook(101);
		System.out.println(b);*/
	
		
	/*	Author a = new Author("rs@gmail.com", "Robin sharma");
		Book b = new Book("The monk who sold his ferrari", 101, "Adventure", 1, a);
		Issue b1 = new Issue();
		
		if(b1.create(b))
		{
			System.out.println("Book created");
		}*/
	






