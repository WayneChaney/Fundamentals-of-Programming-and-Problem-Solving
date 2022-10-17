import java.util.ArrayList;
import java.util.Scanner;
/* 
 * PhoneBook class
 * CSE 174 fall 2019
 * Wayne Chaney
 * Miami University programing class
 * chaneyv@miamioh.edu
 * 
 * The PhoneBook class simulates a simple phone book application.
 * Copyright(C) Nov 2019
 */

public class PhoneBook {//what program is called.
   static  ArrayList<ContactInfo> list = new ArrayList<ContactInfo>();//arraylist made as global
   static Scanner keyboard = new Scanner(System.in);//the keyboard.
   
   
   
   
   
  public static void add(ArrayList<ContactInfo> list, String name,  String label, String pNum) { //add a phone number and name to the list.

    for(int i =0;i < list.size();i++){ // Adds a ContactInfo object to the list 
      if(list.get(i).getName().equals(name)){//checking if name is the same
        System.out.println("The name already exists!");//already the same sorry.
        return;
      } 
    }
    ContactInfo c = new ContactInfo(name,new ArrayList<Phone>());
    c.addPhone(new Phone(label,pNum));
    list.add(c);//adds the phone in
    System.out.println("*The contact has been added successfully*"); // If the contact is added successfully, the method should print this
    
  } 
  
  
  
  
  
  
  public static void append(ArrayList<ContactInfo> list, String name,     
                            String label, String pNum) { // Adds a new Phone object to a specific ContactInfo  
    
    // If this person does not exist the method should print: 
    //   "Couldn't find the name!" 
    // If a similar label or phone number already exists for  
    // that person, the result should be: 
    //     "The label/number already exists for this person!" 
   
    for(int i =0; i < list.size();i++){//forloop
      ContactInfo c = list.get(i);
      if(c.getName().equals(name)){//check if names ==
        ArrayList<Phone> pList = c.getPhones();//making variables smaller
        for(int j = 0; j <c.getPhones().size(); j++){//forloop
          if(pList.get(j).getLabel().equals(label) || pList.get(j).getPhonNum().equals(pNum)){ // check If a similar label or phone number already exists   
            System.out.println("The label/number already exists for this person!");//must be same
            return;
          }
        }
        c.addPhone(new Phone(label,pNum));//new phone
        System.out.println("*The number has been added successfully*"); // If the number is added, the method should print 
        return;
      }
    }
    System.out.println("Couldn't find the name!"); //if every thing fail then this
  } 
  
  public static void display(ArrayList<ContactInfo> list, 
                             String name) { 
    //Displays all the phone numbers that belongs to the given   
    // name. 
   
    for(ContactInfo c:list){
      if(c.getName().equals(name)){//check if name ==
       
        for(Phone p:c.getPhones()){//for each
          System.out.println(p.getLabel()+ ": " + p.getPhonNum());//print statement
          
          
        }
        return;
      }
    }
    System.out.println("Couldn't find the name");//if everything fail
  }
  
  
  
  
  public static void displayAll(ArrayList<ContactInfo> list){ 
    // Displays all the names and the phone numbers. 
    // If the list is empty, the method should print
    //"The list is Empty!"
    if(list.isEmpty())//check if it emppty
      System.out.println("The list is Empty!");//print sstatment
    else{
      for(ContactInfo c: list){//for each
        System.out.println(c.getName());//print each phone
        for(Phone p : c.getPhones()){
          System.out.println("\t" + p.getLabel()+ ": " + p.getPhonNum());//print statment
        }
      }
    }
    
    
  } 
  
  
  public static void remove(ArrayList<ContactInfo> list,  
                            String name) { 
    // Remove all data related to the given name from the  
    // list. 
    // If the list is empty, the method should print
    // "The list is Empty!",
    // If the name does not exist the method should print 
    // �"Couldn't find the name!"
    // If the contat is removed the method should print
    // *Contact is removed successfully*
    if(list.isEmpty()){//check if empty
      System.out.println("The list is Empty!");
      return;
    }
    for(int i = 0; i < list.size();i++){
      if(list.get(i).getName().equals(name)){//check if name equal
        list.remove(i);//remove it
        System.out.println("*Contact is removed successfully*");//printstatement
        
      }
      else {System.out.println("Couldn't find the name!"); //name couldnt be found
        return;}
    }
    
    
  }
  public static boolean checkName(String name){
     for(int i =0; i < list.size();i++){//forloop
      ContactInfo c = list.get(i);
      if(!c.getName().equals(name)){
        break;}
      return false;}
     return true;
      
  }
  
  public static void first(){//if user imput 1
    System.out.println("---Add a contact");
        System.out.print("Name:");//getting info for add method
        String firstName= keyboard.next();//getting info for add method
        String lastName = keyboard.next();//getting info for add method
        String name = firstName + " " + lastName;//getting info for add method
        System.out.print("Label:");
        String label= keyboard.next();//getting info for add method
        System.out.println("  ");
        System.out.print("Phone number (i.e. (513)111-1111):");
        String pNum= keyboard.next();//getting info for add method
        add(list,name,label,pNum);//callin add method
        System.out.println("");
    
  }
  public static void second(){//user inpt 2
       System.out.printf("---Add a contact\nName:");
        String firstName= keyboard.next();//getting name for append method
        String lastName = keyboard.next();//getting name for append method
        String name = firstName + " " + lastName;
        if(checkName(name)==true){System.out.printf("Couldn't find the name\n\n");return;}//check and see if name is equal to another name
        System.out.print("Label:");
        String label= keyboard.next();//getting info for append method
        System.out.print("Phone number (i.e. (513)111-1111):");
        String pNum= keyboard.next();//getting info for pend method
        append(list,name,label,pNum);//call append
        System.out.println("");
    
  }
  public static void third(){//display 1 contatct
     System.out.println("---Display a contact");
        System.out.print("Name:");
       String firstName= keyboard.next();//getting info for display method
        String lastName = keyboard.next();//getting info for display method
        String name = firstName + " " + lastName;
        display(list,name);//calling display
        System.out.println("");
    
  }
  public static void forth(){//display everything
     System.out.println("---Display all");
        displayAll(list);//display called
        System.out.println("");
  }
  public static void fifth(){//removing  name
     System.out.println("---Remove a contact");
        System.out.print("Name:"); 
        String firstName= keyboard.next();//getting name for remove
        String lastName = keyboard.next();//getting info for remove method
        String name = firstName + " " + lastName;
        remove(list,name);//calling remove method
        System.out.println("");
  }
  public static void menu(){// menu prompting user on what is what
     System.out.println("1. Add a contact");
      System.out.println("2. Add a new number to an old contact ");
      System.out.println("3. Display a contact");
      System.out.println("4. Display All ");
      System.out.println("5. Remove a contact ");
      System.out.println("6. Exit");
      System.out.print("Enter your choice: ");
  }
  // main method
  public static void main(String[] args) {// calling methods for user
    
    while(true){//while loop
     menu();//getting menu
      int games= keyboard.nextInt();//user input
      if(games > 6 || games <1){
        System.out.printf("Invalid Input!!\n\n");}// user input wrong not valid
      if(games==6){break;}//calling each method
      if(games == 1){first();}//calling first method
      if(games == 2){second();}//calling second method
      if(games == 3){third();}//calling third method
      if(games == 4){forth();}//calling forth method
      if(games == 5){fifth();}//calling fifth method
    }
    
  }//Work with Mesiam, TA.
}

