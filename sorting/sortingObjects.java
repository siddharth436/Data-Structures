package sorting;

import java.util.Arrays;
import java.util.Comparator;


	
	class point{
		int x,y;

		public point(int i, int j) {
			x = i;
			y = j;
		}
		
		
	}
	
	class Mysort implements Comparator<point>{

		@Override
		public int compare(point o1, point o2) {
			
			return o1.x-o2.y;
		}
		
		
	}
	
	class sortingObjects{
		public static void main(String[] args) {
			point [] arr = {new point(10,20),
					new point(3,12),
					new point(5,7)};
			
			Arrays.sort(arr,new Mysort());
			for(int i = 0 ; i < arr.length;i++)
				System.out.println(arr[i].x + " "+ arr[i].y);
			
			
		}
	}


