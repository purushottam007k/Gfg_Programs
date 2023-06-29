import java.util.*;
public class Detect_loop {
	
	Node head;
	void insertion() {
		
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
	void createloop()
	{
		head.next.next.next.next.next = head.next.next;
		System.out.println(head.next.next.next.next.data);
	}
	void Loop()
	{
		Node slow=head;
		Node fast =head;
		while(slow!=null && fast!=null)
		{
			slow=slow.next;
			fast =fast.next.next;
			if(slow==fast)
			{
				System.out.println("loop is found");
				slow =head;
				while(slow!=null)
				{
					if(slow==fast)
					{
						System.out.println(slow.data);
						break;
					}
					slow=slow.next;
					fast=fast.next;
				}	
				break;
			}
			
		}
		if(slow==null && fast==null) {
		System.out.println("loop is not found");
		}
	}
	void Display()
	{
		
				Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ") ;
			temp=temp.next;
		}
		//System.out.print("************************************** ") ;
	}
	

	public static void main(String[] args) {
		Detect_loop l = new Detect_loop();
		Scanner sc = new Scanner(System.in);
		int a =0;
		do {
			System.out.println("\n1.insertion of first linked_list\n2.Display\n3.createloop\n4.exit");
			switch(sc.nextInt()) {
			case 1:
				l.insertion();
				break;
			case 2:
				l.Display();
				break;
			case 3:
				l.createloop();
				break;
			case 4:
				l.Loop();
			case 5:
				a=3;
				
			
			}
		}while(a!=3);

		
		
	}

}
