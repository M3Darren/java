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
		System.out.println("=======·��========");
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
			 * 0��ʾû���߹���1Ϊ�ϰ���2Ϊ���ߣ�3Ϊ�߹���ͨ
			 */
			if(map[x][y]==0){
				map[x][y]=2;
				//����Ϊ���Һ��£��������
				if(findway(map,x,y+1))return true;
				if(findway(map,x+1,y))return true;
				if(findway(map,x,y-1))return true;
				if(findway(map,x-1,y))return true;
				map[x][y]=3;
				return false;
			}else{
				/**
				 * �����ʾ1,2,3�������ߣ�
				 * 2ʱ��ʾ��·���߻�ͷ·��·������false���¹滮·��
				 */
				return false;
			}
		}
	}
}
