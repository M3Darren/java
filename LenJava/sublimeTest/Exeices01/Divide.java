public class Divide{
	public static void main(String[] args) {
		int counts=0;
		for(int i=1;i<100;i++){
			if(i%5!=0){
				System.out.print(i+"\t");
				counts++;
			}
			if(counts%5==0){
				System.out.println();
			}
		}
	}
}