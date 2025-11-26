public static Node sortList(Node head) {
        Node node0=new Node(0);
        Node node1=new Node(0);
        Node node2=new Node(0);
        Node head0=node0;
        Node head1=node1;
        Node head2=node2;
        while(head!=null){
            if(head.data==0){
                node0.next=head;
                node0=node0.next;
            }
            else if(head.data==1){
                node1.next=head;
                node1=node1.next;
            }
            else{
                node2.next=head;
                node2=node2.next;
            }
            head=head.next;
        }
        node2.next=null;
        node1.next=head2.next;
        node0.next=head1.next;
        return head0.next;
    }
