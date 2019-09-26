package demo;
import java.util.*;

class Student {
	String roll_no;
	String name;
	int phy,chem,math;

	Student(String roll_no, String name, int phy, int chem, int math){
		this.roll_no=roll_no;
		this.name=name;
		this.phy=phy;
		this.chem=chem;
		this.math=math;
	}
	public String toString(){
		return ("roll number is "+roll_no+", name is "+" ,physics marks are "+phy+" ,chem marks are "+ chem+" ,maths marks are "+math);
	}
}
public class Arraydemo {
  public static void main(String args[])  {

	  Student S1=new Student("ic2k1611","vnjkd",50,45,30);
	  Student S2=new Student("ic2k1648","ajnfjk",90,35,80);
	  Student S3=new Student("ic2k1626","tjkkd",20,100,60);
	  ArrayList ar=new ArrayList(10);
	  ar.add(S1);
	  ar.add(S2);
	  ar.add(S3);
	  
	  //System.out.println(ar);
	  Iterator I = ar.iterator();
	  while(I.hasNext()){
		  System.out.println(I.next());
	  }
  }
		
}
