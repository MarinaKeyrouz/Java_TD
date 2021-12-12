package td8;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;

public class ex3 {
	//on extends charsequence parcequ'on utilise charsequence et on le cast donc on doi extend charsequence dans la methode
	//et on doi extend char sequence pour qu'on ai un type safe
	
	//TYPE PARAMETRE
	public static <T extends CharSequence> List <Integer >listLength (List<T> list) {
		ArrayList <Integer> length = new ArrayList<Integer>();
		for (int i = 0; i < ( list).size(); i++) {
			T seq = list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	//si on utilise type parametrer ou wild cards, pour que sa soi type safe 
	//on doi avoir une borne superieur

	public static void main(String[] args) {
		List l = (List) Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
	}
	
	//WILD CARDS
//	public static List <Integer >listLength (List<? extends CharSequence> list) {
//		ArrayList <Integer> length = new ArrayList<Integer>();
//		for (int i = 0; i < ( list).size(); i++) {
//			CharSequence seq = list.get(i);
//			length.add(seq.length());
//		}
//		return length;
//	}
}
