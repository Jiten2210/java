package code.array;
class Link1
{
	int data;
	Link1 link;
}

class Test1
{
	Link1 head;
	Link1 temp=null;

	public Test1()
	{
		head=null;
	}

	public void insert(int data1)
	{
		Link1 nn=new Link1();

		if(head==null)
		{
			nn.data=data1;
			nn.link=null;
			temp=nn;
			head=nn;
		}
		else
		{
			nn.data=data1;
			nn.link=null;
			temp.link=nn;
			temp=nn;
		}
	}

	public void reverse(int k)
	{
		Link1 temp=reverseK(head,k);
		head=temp;
	}
	private	Link1 reverseK(Link1 head,int k)
	{
		Link1 prev=null;
		Link1 next=null;
		Link1 current=head;

		int count=0;
		while(current!=null && count<k)
		{
			next=current.link;
			current.link=prev;
			prev=current;
			current=next;
			count++;
		}
		if(next!=null)
		{
			head.link=reverseK(next,k);
		}
		return prev;
	}


	public void print()
	{
		printList(head);
	}
	public void printList(Link1 head)
	{
		Link1 temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.link;
		}
	}
}

public class LinkedListt
{
	public static void main(String[] args)
	{
		Test1 t=new Test1();
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(4);
		t.insert(5);
		t.insert(6);
		t.insert(7);
		t.insert(8);
		t.insert(9);
		t.reverse(4);
		t.print();
	}
}