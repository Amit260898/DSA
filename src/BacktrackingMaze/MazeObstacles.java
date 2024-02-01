package BacktrackingMaze;

import java.util.ArrayList;

public class MazeObstacles {
	
	public static void main(String[] args) {
		boolean[][] board= {
				{true,true,true},
				{true,false,true},
				{true,true,true},
		};
		System.out.println(mazeObstacle("",board,0,0));
	}

	public static ArrayList<String> mazeObstacle(String p,boolean[][] maze,int r, int c){
		
		if(r==maze.length-1 && c==maze[0].length-1) {
			ArrayList<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		if(!maze[r][c]) {
			ArrayList<String> list=new ArrayList<>();
			return list;
		}
		ArrayList<String> list=new ArrayList<>();
		
		if(r<maze.length-1 && c<maze[0].length-1) {
			list.addAll(mazeObstacle(p+'D',maze, r+1, c+1));
		}
		if(r<maze.length-1) {
			list.addAll(mazeObstacle(p+'V',maze, r+1, c));
		}
		if(c<maze[0].length-1) {
			list.addAll(mazeObstacle(p+'H',maze, r, c+1));
		}
		return list;
	}
}
