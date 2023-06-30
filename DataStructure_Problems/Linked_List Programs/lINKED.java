package lINKED;

public class lINKED {

	
	Node head;
	lINKED()
	{
		head =null;
	}
	
	void Insertion(int a)
	{
        Node nn = new Node(a);
		if(head==null)
		{
			head=nn;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null) {
			    temp=temp.next;
			}
			temp.next=nn;
		}
	}
	void Partion()
	{
		int x=5;
		 Node temp1=head;
		 Node ptr1=head;
		 while(temp1!=null)
			{
			 if(temp1.data > x)
			 {
				 Node ptr2=head;
				  
				 while(ptr2.next!=null)
				 {
					ptr2=ptr2.next;
					
				 }
				 
				 ptr1.next=temp1.next;
				 ptr2.next=temp1;
				 
			 }
			   ptr1=temp1;
				temp1=temp1.next;
			}
		 
	}
	void Display()
	{
		Node temp=head;
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		lINKED l=new lINKED();
		l.Insertion(1);
		l.Insertion(2);
		l.Insertion(6);
		l.Insertion(5);
		l.Insertion(2);
		
		l.Insertion(7);
		l.Insertion(7);
		l.Partion();
		l.Display();
		

	}

}
