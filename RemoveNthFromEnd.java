public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null||head.next==null) return null;
        ListNode fast=head;
        ListNode slow=head;
        int count=0;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            count+=2;
        }
        if(fast!=null){
            count++;
        }
        ListNode curr=head;
        if(count==n){
            return head.next;
        }
        count-=n+1;
        while(count>0){
            curr=curr.next;
            count--;
        }
        curr.next=curr.next.next;
        return head;
    }
