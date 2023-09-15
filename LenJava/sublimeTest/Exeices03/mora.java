import java.util.Scanner;
public class mora{
	public static void main(String[] args) {
		
		Fight f=new Fight();
		f.institution();
	}
}
class Fight{
	int Section=0;
	public void start(Tom t,Com c){
		int tomp=t.Pun();
		int comp=c.Pun();
		if((tomp==0 && comp==1) || (tomp==1 && comp==2) || (tomp==2 && comp==0)){
			System.out.println("you win!!!");
			t.wincon++;
			this.Section++;
		}else if(tomp==comp){
			System.out.println("Tie>>>");
		}else{
			System.out.println("computer win!!!");
			c.wincon++;
			this.Section++;
		}
		
	}
	//三局两胜制
	public void institution(){
		Tom t=new Tom();
		Com c=new Com();
		do{
			start(t,c);
			if(t.wincon==2 || c.wincon==2)break;
		}while(true);
		System.out.println("Totalcount:\ttom win count:\tcomputer win count:\n"+this.Section+"\t\t"+t.wincon+"\t\t"+c.wincon);
		if(t.wincon>c.wincon){
			System.out.println("Ultimate winner:\ttom");
		}else{
			System.out.println("Ultimate winner:\t computer");
		}
	}
}
class Tom{
	int Punch;
	int wincon=0;
	Scanner scan=new Scanner(System.in);
	public int Pun(){
		System.out.println("please enter(0~2):");
		this.Punch=scan.nextInt();
		return this.Punch;
	}
}
class Com{
	int[] Punch={0,1,2};//0是石头，1是剪刀，2是布
	int wincon=0;
	public int Pun(){
		return this.Punch[(int)(Math.random()*3)];
	}
}