package sorting;

import java.util.Arrays;
import java.util.Comparator;


	
	class point1{
		int x,y;

		public point1(int i, int j) {
			x = i;
			y = j;
		}
		
		
	}
	class Mysort1 implements Comparator<point1>{

		@Override
		public int compare(point1 o1, point1 o2) {
			
			return o2.y-o1.y;
		}
		
		
	}
	

	class collectionObjectSorting{
		public static void main(String[] args) {
			point1 [] arr = {new point1(10,20),
					new point1(3,12),
					new point1(5,7)};
			
			Arrays.sort(arr,new Mysort1());
			for(int i = 0 ; i < arr.length;i++)
				System.out.println(arr[i].x + " "+ arr[i].y);
			
			
		}
	}

	
	



