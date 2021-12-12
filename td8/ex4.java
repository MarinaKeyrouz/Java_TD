package td8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

public class ex4 {
	public static void main(String[] args) {
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
//		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
	}

	//for each ya3ne for int i=0 est optimal avec arraylist mais pas avec linkedlist
	//iterator pour linkedlist
	
	//l1 et l2 doivent etre la meme chose donc quand on utilise <?> 
	//on di que l1 et l2 peuvent etre de deux type different 
	//1. ArrayList
	
//	private static <T> List<T> fusion(List<? extends T> l1, List<? extends T> l2) {
//		//quand on utilise collection (ya3ne list,...) a la place de return null, on return Collection.emptyList()
////		if(l1.size() != l2.size() || l1.isEmpty() || l2.isEmpty()) return null;
//		if(l1.size() != l2.size() || l1.isEmpty() || l2.isEmpty()) return Collections.emptyList();
//		List<T> fusion = new ArrayList<>();
//		for(int i=0;i<l1.size();i++) {
//			fusion.add(i,l1.get(i));
//			fusion.add(i,l2.get(i));
//		}
//		return null;
//	}
	//Complexite n car on a directement get(i), avec index 
	
	//2.LinkedList
	private static <T> List<T> fusion(List<? extends T> l1, List<? extends T> l2) {
		if(l1.size() != l2.size() ) throw new IllegalArgumentException("");
		if(l1.isEmpty() || l2.isEmpty()) return Collections.emptyList();
		List<T> fusion = new ArrayList<>(l1.size());
		Iterator <? extends T> it1 =l1.iterator();
		Iterator <? extends T> it2 =l2.iterator();
		while(it1.hasNext()) {
			fusion.add(it1.next());
			fusion.add(it2.next());
		}
		return fusion;
	}
	
	//complexite O(n au carre ) dans linkedList
	//car dans la for loop,  il cherche chaque element dans la liste ya3ne n et la loop c'est n 
	//daqns la boucle il y a un m,ecanisme interieur
}
