package code;
class Node
{
	int data;
	Node link;
}

class Test
{
	private Node head;
	private Node tmp=null;
	public Test()
	{
		head=null;
	}

	public void insert(int n)
	{
		Node nn=new Node();
		if(head==null)
		{

			nn.data=n;
			nn.link=null;
			head=nn;
			tmp=head;
		}
		else
		{
			nn.data=n;
			nn.link=null;
			tmp.link=nn;
			tmp=nn;

		}
	}

	public void disp()
	{
		print(head);
	}
	public void print(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.link;
		}
	}

	public void reverse(int k)
	{
		Node temp=reverseK(head,k);
		head=temp;
	}

	private Node reverseK(Node head,int k)
	{
		Node prev=null;
		Node current=head;
		Node next=null;
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
}

public class LinkList1
{
	public static void main(String[] args)
	{
		Test t=new Test();
		t.insert(1);
		t.insert(2);
		t.insert(3);
		t.insert(4);
		t.insert(5);
		t.insert(6);
		t.insert(7);
		t.insert(8);

		t.reverse(4);
		t.disp();
	}
}
