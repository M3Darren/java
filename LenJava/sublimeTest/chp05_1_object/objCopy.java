public class objCopy{
	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="audi";
		c1.price="40w";
		System.out.println("c1:价格\t品牌"+"   "+c1.price+"\t"+c1.name);
		System.out.println();
		Car c2=c1.copys(c1);
		System.out.println("c2:价格\t品牌"+"   "+c2.price+"\t"+c2.name);
		c2.name="BMW";		//此时name重新开辟内存
		System.out.println();
		System.out.println("c2修改后:价格\t品牌"+"   "+c2.price+"\t"+c2.name);
	
	}
}
class Car{
	String price;
	String name;
	public Car copys(Car audi){
		Car cp=new Car();
		cp.name=audi.name;
		cp.price=audi.price;
		return cp;
	}
}