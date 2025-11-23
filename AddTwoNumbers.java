Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead=new ListNode();
        ListNode temp=newHead;
        int rem=0;
        while(l1!=null||l2!=null){
            int sum=rem;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            int res=sum%10;
            rem=sum/10;
            temp.next=new ListNode(res);
            temp=temp.next;
        }
        if(rem!=0) temp.next=new ListNode(rem);
           
        return newHead.next;
    }
