package practice1;

import java.util.ArrayDeque;

public class LearArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		
		ad.offer(33);
		ad.offerFirst(25);
		ad.offerLast(12);
		ad.offer(2);
		
		System.out.println("Peek First "+ad);
		System.out.println("Peek First "+ad.peekFirst());
		System.out.println("Peek Last "+ad.peekLast());
		
		System.out.println("Poll "+ad.poll());
		System.out.println(ad);

		
		System.out.println("Poll First "+ad.pollFirst());
		System.out.println(ad);

		System.out.println("Poll Last "+ad.pollLast());
		System.out.println(ad);
		
		
		
	}

}
