package BacktrackingMaze;

import java.util.ArrayList;

public class CountPaths {
	
	public static void main(String[] args) {
		//countPaths(3, 3);
//		System.out.println(countPaths(3, 3));
//		System.out.println(printPathsRet("", 3, 3));
		System.out.println(printPathsRetDia("", 3, 3));
	}
	
	static void printPaths(String p,int row, int col) {
		
		if(row==1 && col==1) {
			System.out.println(p);
			return;
		}
		if(row>1) {
			printPaths(p+'R', row-1, col);
		}
		if (col>1) {
			printPaths(p+'D', row, col-1);
		}
		
	}
	
static ArrayList<String> printPathsRet(String p,int row, int col) {
		
		if(row==1 && col==1) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		
		ArrayList<String> list=new ArrayList<>();
		if(row>1) {
			list.addAll(printPathsRet(p+'R', row-1, col));
		}
		if (col>1) {
			list.addAll(printPathsRet(p+'D', row, col-1));
		}
		return list;
	}

static ArrayList<String> printPathsRetDia(String p,int row, int col) {
	
	if(row==1 && col==1) {
		ArrayList<String> list=new ArrayList<>();
		list.add(p);
		return list;
	}
	
	ArrayList<String> list=new ArrayList<>();
	
	if(row>1 && col>1) {
		list.addAll(printPathsRetDia(p+'D', row-1, col-1));
	}
	if(row>1) {
		list.addAll(printPathsRetDia(p+'V', row-1, col));
	}
	
	if (col>1) {
		list.addAll(printPathsRetDia(p+'H', row, col-1));
	}
	
	
	return list;
}
	


static int countPaths(int row, int col) {
		
		if(row==1 || col==1) {
			return 1;
		}
		
		int left=countPaths(row-1, col);
		
		int right=countPaths(row, col-1);
		return left+right;
		
	}

}
