package practice1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class collection_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> studentsName=new ArrayList();
//			studentsName.add("Rakhesh");
//			studentsName.add("suresh");

			System.out.println(studentsName);
			
			
			List<Integer>list=new ArrayList();//LinkedList()
			
			list.add(1);
			list.add(2);
			list.add(3);
			list.add(4);
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(40);
			System.out.println(list);
			
		
			//traversing of element
			//method 1
			for (int i=0;i<list.size();i++) {
				System.out.println("The Element is "+list.get(i));
			}
			
			//method 2
			for(Integer element:list) {
				System.out.println("foreach element is "+element);
			}
			
			//method 3 
			Iterator<Integer> it=list.iterator();
			
			while(it.hasNext()) {
				System.out.println("Iterator "+it.next());
			}
			
//			list.add(5);
//			System.out.println(list);
//			
//			list.set(2,1000);
//			System.out.println(list);
//			
//		list.add(1,50);
//		System.out.println(list);
//		
//		List<Integer> newList=new ArrayList();
//		newList.add(150);
//		newList.add(160);
//		
//		list.addAll(newList);
//		System.out.println(list);
//		
//		System.out.println(list.get(1));
//		
//		list.remove(1);
//		System.out.println(list);
//		
//		list.remove(Integer.valueOf(3));
//		System.out.println(list);
//		
		
			
	}

}
