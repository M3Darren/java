public class Pay{
	public static void main(String[] args) {
		double cash=100000;
		int counts=0;
		boolean flg=true;
		while (flg) {
			if(cash>50000){
				cash*=0.95;
				counts++;
			}else if(cash>=1000){
				cash-=1000;
				counts++;
			}else{
				break;
			}
			
		}
		System.out.println();
		
	}
}