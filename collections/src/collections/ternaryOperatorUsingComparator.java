package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ternaryOperatorUsingComparator {
	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		list.add(534);
		list.add(437);
		list.add(333);
		list.add(948);
		list.add(195);
		Comparator<Integer> obj = (o1,o2)-> {
			return o1%100>o2%100?1:-1;
		}; 
		Collections.sort(list,obj);
		System.out.println(list);
	} 
}
