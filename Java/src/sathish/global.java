package sathish;
class manager{
	public String name="sathish";    //global variable
	private int age=25;
	private double salary=700;
	double salary(int a) {
		double s;
		s=a*this.salary;
		System.out.println(this.name+" salary is "+s);
		return s;
	}
	double pf(double s) {
		double pf;
		pf=s*0.12;
		System.out.println(this.name+" pf is "+pf);
		return pf;
	}
	void takehome(double pf,double s) {
		double c;
		c=pf-s;
		System.out.println(this.name+" take home is "+c);
	}
}
class employee extends manager{
	double salary(int a) {
		double s;
		s=a*700;
		System.out.println(name+" salary is "+s);
		return s;
	}
	double pf(double s) {
		double pf;
		pf=s*0.12;
		System.out.println(" pf is "+pf);
		return pf;
	}
	void takehome(double pf,double s) {
		double c;
		c=pf-s;
		System.out.println(" take home is "+c);
	}
}
public class global {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
		String name="sathish";
		int age=25;
		double salary=800;
		employee m=new employee();
		a=m.salary(30);
		b=m.pf(a);
		m.takehome(b, a);
		
	}
}
