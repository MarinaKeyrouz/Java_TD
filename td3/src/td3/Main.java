package td3;

import static org.junit.Assert.assertEquals;

/*
 * Td3 Exercice 1
 */
public class Main {
	public static void main(String[] args) {
//		MyList l = new MyList();
//		l.add("M");
//		l.add("K");
//		l.add("f");
//		l.addLast("MK");
//		l.add("jh", 2);
//		System.out.println(l.toString());
//		System.out.println(l.size());
//		System.out.println(l.last);
		
		MyList ml = new MyList();
		ml.addLast("tatu");
		ml.add("toto");
		ml.add("titi");
		ml.addLast("tutu");
		System.out.println(ml);
		System.out.println(ml.get(3));
		System.out.println(ml.sumLetter());
			
	}
}
