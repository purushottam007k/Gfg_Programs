package Package_1;

import java.util.Scanner;

public class Length_Linkedlist {
	Node head;
	Length_Linkedlist()
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
	int Recursive(Node temp)
	{
		if(temp==null)
		{
			return 0;
		}
		
		return 1+Recursive( temp.next);
		
	}
	void remove()
	{
		Node temp=head;
		Node temp1=head;
		Node ptr1=null,ptr2=null;
		
		while(temp!=null)
		{
			ptr1=temp.next;
			ptr2 =temp;
			while(ptr1!=null)
			{
				
				if(temp.data==ptr1.data)
				{
					ptr2.next=ptr1.next;
					ptr1=ptr1.next;
//					ptr2=ptr2.next;
				}
				else
				{
					ptr2=ptr2.next;
					ptr1=ptr1.next;
				}
			}
			
			temp=temp.next;
			
		}
	}
	void middle_Element()
	{
		int count =0;
		Node temp =head;
		while(temp!=null)
		{
			count++;
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	void Display()
	{
		int count =0;
		Node temp =head;
		while(temp!=null)
		{
			count++;
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
//		System.out.println("Length of Linkedlist :- "+count);
//		System.out.println("****************************************");
//		System.out.println(Recursive(head));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =0;
		Length_Linkedlist l = new Length_Linkedlist();
		do {
			System.out.println("\n1.for insertion\n2.for display\n3.remove\n4.for exit\n5.");
			switch(sc.nextInt()) {
			case 1:
				l.Insertion();
				break;
			case 2:
				l.Display();
				break;
			case 3:
				l.remove();
				break;
			case 4:
				a=3;
				break;
}
		
		}while(a!=3);

	}

}
