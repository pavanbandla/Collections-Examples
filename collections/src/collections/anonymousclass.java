package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class anonymousclass {

	public static void main(String[] args) {
		

				List<Integer> list  = new ArrayList<Integer>();
				list.add(534);
				list.add(437);
				list.add(333);
				list.add(948);
				list.add(195);
			
				Comparator<Integer> comp = new Comparator<Integer>() {
			
					@Override
				public int compare(Integer o1, Integer o2) {
						if(o1%100>o2%100)
							return 1;
						return -1;
					}
				};	
				
				Collections.sort(list, comp);
			System.out.println(list);
			
	}

}
