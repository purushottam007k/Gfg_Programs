package Merge_Linked_List_At_spefic_Position;

import java.util.Scanner;

public class Merge {
	
	Node head;
	 Merge()
	{
		head =null;
	}
	void Insertion()
	{
		//int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		
		Node nn = new Node(sc.nextInt());
	if(head==null)
	{
		//count+=1;
		head=nn;
	}
	else
	{
		//count+=1;
		nn.next=head;
		head =nn;
	}
	}
	void merge(Merge t)
	{
//		Scanner sc = new Scanner(System.in);
//		int pos = sc.nextInt();
		Node p_curr = head, q_curr = t.head;
        Node p_next, q_next;
        while (p_curr != null && q_curr != null) {
        	  
            // Save next pointers
            p_next = p_curr.next;
            q_next = q_curr.next;
  
            // make q_curr as next of p_curr
            q_curr.next = p_next; // change next pointer of q_curr
            p_curr.next = q_curr; // change next pointer of p_curr
  
            // update current pointers for next iteration
            p_curr = p_next;
            q_curr = q_next;
        }
        t.head = q_curr;
		
	}
	void Display()
	{
		
				Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ") ;
			temp=temp.next;
		}
		System.out.print("************************************** ") ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0;
		Merge l = new Merge();
		Merge t = new Merge();
		do {
			System.out.println("\n1.insertion of first linked_list\n2.insertion of Second linked_list\n3.Merg\n4.Display");
			switch(sc.nextInt()) {
			case 1:
				l.Insertion();
				break;
			case 2:
				t.Insertion();
				break;
			case 3:
				l.merge(t);
				
				break;
			case 4:
				l.Display();
				t.Display();
				break;
}
		
		}while(a!=3);


	}

}
