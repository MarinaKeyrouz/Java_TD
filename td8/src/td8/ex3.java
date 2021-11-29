package td8;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public class ex3 {
	public static <T> List listLength (T list) {
		List length = new ArrayList();
		for (int i = 0; i < ((List) list).size(); i++) {
			CharSequence seq = (CharSequence) ((List) list).get(i);
			length.add(seq.length());
		}
		return length;
	}

	public static void main(String[] args) {
		List l = (List) Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
	}
	
	public static Collection<?> listLength (Collection<?> list) {
		List length = new ArrayList();
		for (int i = 0; i < ((List) list).size(); i++) {
			CharSequence seq = (CharSequence) ((List) list).get(i);
			length.add(seq.length());
		}
		return length;
	}
}
