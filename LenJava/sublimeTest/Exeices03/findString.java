import java.util.Scanner;
public class findString{
	public static void main(String[] args) {
		String[] arr={"php","java","python","c#"};
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the search string:");
		String lang=scan.next();
		Fstr f=new Fstr();
		int index=f.find(lang,arr);
		if (index==-1) {
			System.out.println("Not found:  "+lang);
		}else{
			System.out.println("find ->index:"+index);
		}
	}
}
class Fstr{
	public int find(String lange,String[] arr){
		int index=-1;
		for (int i=0; i<arr.length; i++) {
			if(arr[i].equals(lange))index=i;
		}
		return index;
	}

}