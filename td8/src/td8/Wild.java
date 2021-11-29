package td8;

import java.util.Arrays;
import java.util.List;

public class Wild{
	private static void print(List<Object> list) {
		for (Object o : list)
			System.out.println(o);
	}

	public static void main(String[] args) {
		List<Object> list = Arrays.asList("foo", "toto");
		print(list);
	}
	public static List<? extends CharSequence> sizeChar(List<Object> list) {
		return null;
		
	}
}
