package practice1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue<Integer> num=new PriorityQueue<>(Comparator.reverseOrder());
		
		num.offer(40);
		num.offer(22);
		num.offer(30);
		num.offer(36);
		
		
		System.out.println(num);
		
		System.out.println(num.poll());
		
		System.out.println(num);
		
		System.out.println(num.peek());
		
		
	}

}
