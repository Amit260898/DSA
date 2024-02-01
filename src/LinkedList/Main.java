package LinkedList;


public class Main {
	
	public static void main(String[] args) {
		
		LL list=new LL();
		list.insertFirst(25);
		list.insertFirst(12);
		list.insertFirst(4);
		list.insertLast(99);
//		list.insertLast1(2);
//		list.insertLast1(7);
		list.insert(100,3);
	//	list.display();
		System.out.println(list.deleteFirst());
		list.display();
		//System.out.println(list.deleteLast());
		list.display();
		System.out.println(list.delete(1));
		list.display();
		list.insertRec(88, 2);
		list.display();
		
//		DLL list=new DLL();
//		list.insertFirst(25);
//		list.insertFirst(12);
//		list.insertFirst(4);
//		list.display();
//		list.insertLast(5);
//		list.display();
//		list.insert(5, 19);
//		list.display();
		
//		CLL list=new CLL();
//		list.insert(23);
//		list.insert(3);
//		list.insert(32);
//		list.insert(9);
//		list.display();
//		list.delete(32);
//		list.display();
		
	}

}
