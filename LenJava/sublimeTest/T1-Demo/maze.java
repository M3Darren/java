public class maze{
	public static void main(String[] args) {
		int[][] map=new int[8][8];
		for (int i=0;i<map.length ;i++ ) {
			map[0][i]=1;
			map[i][0]=1;
			map[7][i]=1;
			map[i][7]=1;
		}
		Mig m=new Mig();
		m.prints(map);
		m.findway(map,1,1);
		System.out.println("=======路径========");
		m.prints(map);
	}
}
class Mig{
	public void prints(int[][] map){
		for (int i=0;i<map.length ;i++ ) {
			for (int j=0;j<map.length ;j++ ) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	public boolean findway(int[][] map,int x,int y){
		if(map[6][6]==2){
			return true;
		}else{
			/**
			 * 0表示没有走过，1为障碍，2为可走，3为走过不通
			 */
			if(map[x][y]==0){
				map[x][y]=2;
				//策略为先右后下，先左后上
				if(findway(map,x,y+1))return true;
				if(findway(map,x+1,y))return true;
				if(findway(map,x,y-1))return true;
				if(findway(map,x-1,y))return true;
				map[x][y]=3;
				return false;
			}else{
				/**
				 * 这里表示1,2,3都不可走，
				 * 2时表示死路在走回头路，路径返回false重新规划路径
				 */
				return false;
			}
		}
	}
}
