package td8;

import java.util.Arrays;
import java.util.List;

public class Wild{
//	private static void print(List<Object> list) {
//		for (Object o : list)
//			System.out.println(o);
//	}
//
//	public static void main(String[] args) {
//		List<Object> list = Arrays.asList("foo", "toto");
//		print(list);
//	}
//	public static List<? extends CharSequence> sizeChar(List<Object> list) {
//		return null;
//		
//	}
	//probleme c'est que string est pas un sous type d'object mais list<String> n'est pas un sous type de list<object>
	//object c'est pas type safe donc preferable d'utiliser <? >
	
	//pourquoi ne pas utiliser type parametrer a la place de ? --> 
	//les 2 marche mais dans <T> on doi cast la liste en <T>
	private static void print(List<?> list) {
		for(Object o:list)
		System.out.println(o);
		}
		public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		print(list);
	}
		public static void printLength (List<? extends CharSequence> list) {
			for (CharSequence o: list) {
				System.out.println(o.length());
			}
		}
}
