import java.util.*;
class node
{
    int data;
    node prev;
    node next;
    node tail;
    node(int data)
    {
        this.data=data;
    }
}
public class duinsertAtEndTail
{
    node head;
    node tail;
    public void insertAtEnd(int data)
    {
        node n=new node(data);
        if(head==null)
        {
            head=n;
            tail=n;
        }
        else
        {
            n.prev=tail;
            tail.next=n;
            tail=n;
            
        }
    }
    public void printlm()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        duinsertAtEndTail obj=new duinsertAtEndTail();
        Scanner sc=new Scanner(System.in);
        int nu=sc.nextInt();
        for(int i=0;i<nu;i++)
        {
            int number=sc.nextInt();
            obj.insertAtEnd(number);
        }
        obj.printlm();
    }
}