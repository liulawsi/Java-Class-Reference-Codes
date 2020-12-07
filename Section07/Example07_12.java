package section07;
import java.util.Scanner;

public class Example07_12 {
	
	static char map[][] = new char[][]
		{{'■','■','■','■','■','■','■','■','■','■','■','■','■','■'},
		 {'■',' ',' ','■',' ',' ',' ',' ',' ',' ','■','■','■','■'},
		 {'■',' ','■','■','■','■',' ','■','■',' ',' ',' ','■','■'},
		 {'■',' ','■','■','■','■',' ',' ','■','■','■',' ',' ','■'},
		 {'■',' ','■','■','■','■',' ','■','■','■','■','■','■','■'},
		 {'■',' ',' ',' ',' ',' ',' ','■','■',' ',' ',' ','■','■'},
		 {'■','■','■','■',' ','■','■','■','■','■','■',' ','■','■'},
		 {'■','■','■','■',' ','■',' ','■','■','■','■',' ','■','■'},
		 {'■',' ',' ',' ',' ','■',' ','■',' ',' ',' ',' ',' ','■'},
		 {'■',' ','■',' ','■','■',' ','■',' ','■',' ','■',' ','■'},
		 {'■',' ','■',' ','■','■',' ','■',' ','■',' ','■',' ','■'},
		 {'■',' ','■',' ',' ',' ',' ',' ',' ','■',' ','■','■','■'},
		 {'■',' ','■','■','■',' ','■','■','■','■',' ','■','■','■'},
		 {'■',' ',' ','■','■',' ','■','■','■','■',' ',' ','E','■'},
		 {'■','■','■','■','■','■','■','■','■','■','■','■','■','■'}
		};
		
	public static boolean Go(int x, int y) {
		boolean found = false;
		if (map[x][y] == 'E') return true;
		else {
			map[x][y] = '.';
			if ((map[x+1][y] == ' ') || (map[x+1][y] == 'E'))
				if (Go(x+1, y)) found = true;
			if ((map[x][y+1] == ' ') || (map[x][y+1] == 'E'))
				if (Go(x, y+1)) found = true;
			if ((map[x-1][y] == ' ') || (map[x-1][y] == 'E'))
				if (Go(x-1, y)) found = true;
			if ((map[x][y-1] == ' ') || (map[x][y-1] == 'E'))
				if (Go(x, y-1)) found = true;
			if (found) map[x][y] = '+';
			return found;
		}
	}
	
	public static void showMap() {
		for(int m = 0; m < map.length; m++) {
			for(int n = 0; n < map[0].length; n++) {
				System.out.print(map[m][n]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMap();
		if (Go(1,1)) {
			System.out.println("找到了！");
			showMap();
			System.out.println();
		}else {
			System.out.println("沒有找到！");
		}
	}

}
