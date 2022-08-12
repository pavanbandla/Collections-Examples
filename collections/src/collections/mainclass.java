package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class mainclass {

	public static void main(String[] args) {
		List<Integer> list  = new ArrayList<Integer>();
		list.add(534);
		list.add(437);
		list.add(333);
		list.add(948);
		list.add(195);
	
		Comparator<Integer> comp = new comparing();		
		Collections.sort(list, comp);

	System.out.println(list);
	}

}
