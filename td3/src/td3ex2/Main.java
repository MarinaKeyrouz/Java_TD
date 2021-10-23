package td3ex2;
/*
 * Td3 Exercice 2 Part 1 a 4
 */
public class Main {
	public static void main(String[] args) {
		MyList ml = new MyList();
		ml.addLast(2);
		ml.add(3);
		ml.add(4);
		ml.addLast(10);
		System.out.println(ml);
		System.out.println(ml.get(3));
		System.out.println(ml.sumLetter());
		System.out.println(ml.contains(3));
		//Que faut-il changer pour la m´ethode sumLetters() ?
	}
}
