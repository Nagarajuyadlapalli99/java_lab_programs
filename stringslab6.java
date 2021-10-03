import java.util.Scanner;
 class lab6 
{ 
int sno1;
 String sname1;
 Student()
{
 sno=1; sname="rama";
 }
 Student(int sno1,String sname1);
 { 
this.sno=sno1;
 this.sname=sname1; 
} 
void display()
 {
 System.out.println(sno + sname);
 } 
public static void main(String args[])
 { 
Student s=new Student();
 s.display(); 
Student s1=new Student(3,"sita"); 
s1.display();
 Scanner ob=new Scanner(System.in); 
int sno2=ob.nextInt(); 
String sname2=ob.next(); 
Student s3=new Student(sno2,sname2); 
s3.display(); 
}
 }
