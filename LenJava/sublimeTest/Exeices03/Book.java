public class Book{
	public static void main(String[] args) {
		Ub b=new Ub("javaºËÐÄ¾í",129);
		b.updateprice(); 
		b.info();
	}
}
class Ub{
	int price;
	String name;
	public Ub(String name,int price){
		this.name=name;
		this.price=price;
	}
	public void updateprice(){
		if(this.price>155){
			this.price=150;
		}else if(this.price>100){
			this.price=100;
		}
		
	}
	public void info(){
		System.out.println("bookName:"+this.name+"\t"+"bookPrice:"+this.price);
	}
}