public class reusableConstructor{
	public static void main(String[] args) {
		Mess m=new Mess("dp",21,12000,"java","no");
		System.out.println(m.sale);
	}
}
class Mess{
	String name,job,merry;
	int age;
	int sale;
	public Mess(String job,String merry){
		this.job=job;
		this.merry=merry;
	}
	public Mess(String name,int age,int sale){
		this.name=name;
		this.age=age;
		this.sale=sale;
	}
	public Mess(String name,int age,int sale,String job,String merry){
		this(name,age,sale);
		this.job=job;
		this.merry=merry;
	}
}