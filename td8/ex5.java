package td8;


import java.util.*;

public class ex5 {
	public static <T> List melange(List<? extends T> l1, int a, int b) {
		List <T> temp = new ArrayList<T>();
		temp.addAll(l1);
		temp.set(b, (T) l1.get(a));
		temp.set(a, (T) l1.get(b));
		return temp;
	}
	public static void main(String[] args) {
		List l = (List) Arrays.asList("colonel", "marina","java","avance");
		System.out.println(melange(l, 2, 3));
		List l1 = (List) Arrays.asList(1,2,3,4);
		System.out.println(melange(l1, 2, 3));
		System.out.println(shuffle1(l1));
	}
	public static <T> List shuffle2(List l1) {
		Collections.shuffle(l1);
		return l1;
	}
	
	public static <T> List shuffle1(List<? extends T> l1)
    {
        Random random = new Random();
        Object[] arr = l1.toArray();
        for (int i = l1.size(); i > 1; i--)
        {
            int j = random.nextInt(i); 
            Object tmp = arr[i - 1];
            arr[i - 1] = arr[j];
            arr[j] = tmp;
        }
        List l2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            l2.add(arr[i]);
        }
        return l2;
    }
}
