import java.util.Scanner;
public class Main{
public static void main(String[]args){
  String fname,mname,lname,fllname;
  int age,SE,ENTRE,AH,NET,SIA,IPTP;
  float ave;
  Scanner nm = new Scanner(System.in);
  System.out.print("Name: ");
  fname = nm.nextLine();
  System.out.print("Middle Name: ");
  mname = nm.nextLine();
  System.out.print("Surname: ");
  lname = nm.nextLine();
  System.out.print("How old are you: ");
  age = nm.nextInt();
  fllname = lname + " " + fname + " " + mname;
  System.out.print("My name is " + fllname);
  System.out.print("\nIam "+age+"years.old");
  System.out.print("\nGrades in Subjects\n");
  System.out.print("Software Engineering: ");
  SE = nm.nextInt();
  System.out.print("Entrepreneurship: ");
  ENTRE = nm.nextInt();
  System.out.print("Arts and Humanities: ");
  AH = nm.nextInt();
  System.out.print("Networking-2: ");
  NET = nm.nextInt();
  System.out.print("System Integration and Architecture: ");
  SIA = nm.nextInt();
  System.out.print("Integrative Programming and Technology-2: ");
  IPTP = nm.nextInt();
  ave = ((SE + ENTRE + AH + NET + SIA + IPTP)/6);
  System.out.print("Average: " + ave);
  if(ave > 75){
    System.out.print("\nRemarks: Passed");
  } else{
    System.out.print("\nRemarks: Retained");
  }
 }
}
