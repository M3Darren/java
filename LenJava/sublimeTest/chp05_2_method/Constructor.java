public class Constructor{
	/**
	 * ¹¹ÔìÆ÷
	 * @param args [description]
	 */
	public static void main(String[] args) {
		Cons c=new Cons("OG8",399);
		System.out.println(c.name);
		Cons c1=new Cons("Fl");
		System.out.println(c1.name);
	}
}
class Cons{
	String name;
	int price;
	//Constructor
	public Cons(String Cname ,int Cprice){
		System.out.println("Constructor is called");
		name=Cname;
		price=Cprice;
	}
	//Constructor overload
	public Cons(String Cname){
		System.out.println("Constructor overload");
		name=Cname;
	}
}