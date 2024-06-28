package application;
import java.util.*;

class Student
{
	int s[];
	int per;
	void setSubMarks(int s[])
	{
		this.s=s;
	}
	void calPer()
	{
		int agg=0;
		for(int i=0;i<s.length;i++)
		{
			agg=agg+s[i];
		}
		per=agg/6;
		System.out.println("Percentage is\t"+per);
	}
	void checkGrades()
	{
		if(per>75 && per<=100) {
		       System.out.println("Student is in Distinction");
		}
		else if(per>60 && per<=75) {
			System.out.println("Student is in First Division");
		}
		else if(per>=50 && per<=60) {
			System.out.println("Student is in Second division");
		}
		else if(per>40 && per<=50) {
			System.out.println("Student is in Third division");
		}
		else if(per<40) {
			System.out.println("Student is failed");
		}
	}
}
public class StudentApp {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		Student st = new Student();
		int m[]=new int[6];
		System.out.println("Enter the six subjects marks");
		for(int i=0;i<m.length;i++)
		{
			m[i]= xyz.nextInt();
		}
		st.setSubMarks(m);
		st.calPer();
		st.checkGrades();
	}

}
