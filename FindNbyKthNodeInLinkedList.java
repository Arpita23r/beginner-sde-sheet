class GfG
{
    public static int nknode(Node head, int k)
    {
       // add your code here
       Node slow = null;
       Node fast = head;
       int i = 0;
       while(fast!=null) {
           if(i%k==0){
               if(slow==null)slow=head;
               else slow=slow.next;
           }
           fast=fast.next;
           i++;
       }
       return slow.data;
    }
}
