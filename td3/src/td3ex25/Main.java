package td3ex25;
/*
 * Td3 Exercice 2 Part 5
 */
public class Main {
	public static <E,T> void main(String[] args) {
		MyList<E,T> ml = new MyList<E,T>();
		ml.addLast(2);
		ml.add(3);
		ml.add(4);
		ml.addLast(10);
		System.out.println(ml);
		System.out.println(ml.get(3));
		System.out.println(ml.sumLetter());
		System.out.println(ml.contains(3));
	}
}
