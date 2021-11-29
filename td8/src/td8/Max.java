package td8;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;


public class Max {
	public static void main(String[] args) {
		System.out.println(myMax(42, 1664)); // 1664
		System.out.println(myMax(2014, 86, 13)); // 2014

		System.out.println(myMax(8.6, 16.64)); // 16.64
		System.out.println(myMax("Denis", "Cornaz")); // Denis
		System.out.println(myMax(8.6, "Denis")); // ne doit pas compiler !
		System.out.println(myMax());
	}

	public static Object myMax(Object... a) {
		if (a.length == 0) {
			throw new IllegalArgumentException();
		} else {
			ArrayList<Object> t = new ArrayList<>();
			int i = 0;
			double max = 0;
			String s = "";
			ArrayList<Object> o = new ArrayList<Object>();
			for (Object j : a) {
				t.add(j);
				o.add(t.get(i).getClass());
				i++;
			}

			if (o.stream().distinct().count() <= 1) {
				for (int k = 0; k < t.size() ; k++) {
					String variable = o.get(k).toString();
					if (variable.equals("class java.lang.Integer")) {
						if ((int)t.get(k) > max) {
							max = (int) t.get(k);
						}
					} else if(variable.equals("class java.lang.Double")) {
						if ((double)t.get(k) > max) {
							max = (double) t.get(k);
						}
						
				}else if (t.get(k).getClass() == String.class) {
					if(k!=t.size()-1) {
						int compare = ((String) t.get(k)).compareTo((String) t.get(k+1));
						if (compare >= 0) {
							s = (String) t.get(k);
						}
					}
						
					}
				}
			}
			if (max == 0) {
				return s;
			} else {
				return max;
			}
		}
	}
}
