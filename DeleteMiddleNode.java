public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
        ListNode slow=null;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow==null?head:slow.next;
        }
        if(slow.next!=null)
        slow.next=slow.next.next;
        else{
            slow.next=null;
        }
        return head;
    }
