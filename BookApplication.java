/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;


import java.util.Scanner;
import java.util.LinkedList;


/**
 * Description : 
 * Implementation ArrayList class to create A collection of elements of the same type.
 * 
 * 
 * Prepared for PROFESOR MADYA DR NURAZZAH BINTI ABD RAHMAN
 * 
 * LAB 2 (Topic : ArrayList and LinkedList)
* 
 * Submission date : 2 April 2023
 * Course : CSC508 (Data Structures)
 * 
 * @author NUR HIDAYAH BINTI ISHAK | ID: 2020496204 | Group: CS2304A
 * @version 1.0
 * 
 */

//the Book application
public class BookApplication
{
        // Main driver method
        public static void main(String[] args) {
            
            //MyArrayList<Book> Blist = new MyArrayList<Book>();
           
            LinkedList <Book> Blinked = new LinkedList <>();
            Scanner s = new Scanner (System.in);// Create a Scanner object as input
            
            //initial attributes
            String title, author;
            int year,i=0;
            double price;
            
             
            
           
           String choice;
            do{
                
                             
                System.out.println("\nBook No." + (i + 1));
                
                System.out.print("Title: "); //Prompt title from the user
                title = s.nextLine();
                
                

                System.out.print("Publication Year: "); // Prompt year from the user
                year = Integer.parseInt(s.nextLine());
                

                System.out.print("Price: RM"); // Prompt price from the user
                price = Double.parseDouble(s.nextLine());
                

                System.out.print("Author's name: "); // Prompt author's name from the user
                author = s.nextLine();
               
                //Book book = new Book(title, year, price, author);
                
               
               
                System.out.println("\nWant to add another book? (y/n)");
                System.out.print("Input: ");
                choice = s.nextLine();
              
               
               
                
                ++i; // To collect the number of book
                

                 Book book = new Book(title, year, price, author);
                
                Blinked.add(book);
                
               if (("n").equals(choice) || ("N").equals(choice)) // If user wish not to continue, then break the do while loop
            {
                System.out.println("");
                break;
            }

                            
               
             
        }while (i != 0);
            
            
        
           
                    
           // Print the objects using toString() method
           System.out.println("----------------------------");
           System.out.println("Information books:"+"\n");
            for (int j=0; j<Blinked.size(); j++) {
                     System.out.println(Blinked.get(j)); //return item at position index
            }
            System.out.println("----------------------------");
            System.out.println("The number of LinkedList size is = " + Blinked.size()); // Display the number of LinkedList size
         
   
             Blinked.removeFirst();
             
             System.out.println("----------------------------");
           System.out.println("LinkedList after deletion of first element:"+"\n");
            for (int j=0; j<Blinked.size(); j++) {
                     System.out.println(Blinked.get(j)); //return item at position index
            }
            
            Scanner inputnew = new Scanner (System.in);// Create a Scanner object as input
            System.out.println(" Please enter a number of book(s) to add: ");
            int number =Integer.parseInt (inputnew.nextLine());
            
            for (i=0; i<number; i++){
                
                             
                System.out.print("\nTitle: "); //Prompt title from the user
                title = inputnew.nextLine();
                
                

                System.out.print("Publication Year: "); // Prompt year from the user
                year = Integer.parseInt(inputnew.nextLine());
                

                System.out.print("Price: RM"); // Prompt price from the user
                price = Double.parseDouble(inputnew .nextLine());
                

                System.out.print("Author's name: "); // Prompt author's name from the user
                author = inputnew.nextLine();
               
          
                
                      

                 Book book = new Book(title, year, price, author);
                
                
                
                Blinked.add(book);
            }
            
            System.out.println("----------------------------");
           System.out.println("LinkedList after add new data element:"+"\n");
            for (int j=0; j<Blinked.size(); j++) {
                     System.out.println(Blinked.get(j)); //return item at position index
            }
             
            
            System.out.println("----------------------------");
            System.out.println("The number of new LinkedList size is = " + Blinked.size()); // Display the number of LinkedList size
      /*    Scanner sfirst = new Scanner (System.in);// Create a Scanner object as input
            System.out.println(" Please enter a number");
        int number = sfirst.nextInt();
        
         System.out.print("Title: "); //Prompt title from the user
                title = sfirst.nextLine();
                
                

                System.out.print("Publication Year: "); // Prompt year from the user
                year = Integer.parseInt(sfirst.nextLine());
                

                System.out.print("Price: RM"); // Prompt price from the user
                price = Double.parseDouble(sfirst.nextLine());
                

                System.out.print("Author's name: "); // Prompt author's name from the user
                author = sfirst.nextLine();
                
        Blinked.addFirst(book); //insert object at the front of the list
            */
            
            
        }
            
            
              
    }
        
            
   