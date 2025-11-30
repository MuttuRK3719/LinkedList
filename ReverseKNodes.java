 ListNode temp = head, prev1 = null;
        while (temp != null) {
            ListNode kThNode = KthNode(temp, k);
            if (kThNode == null) {
                if (prev1 != null)
                    prev1.next = temp;
                break;
            }
            ListNode nextNode = kThNode.next;
            kThNode.next = null;
            reverse(temp);
            if (temp == head) {
                head = kThNode;
            } else {
                prev1.next = kThNode;
            }
            prev1 = temp;
            temp = nextNode;

        }
        return head;
    }

    ListNode KthNode(ListNode head, int k) {
        ListNode temp = head;
        while (temp != null && k > 1) {
            temp = temp.next;
            k--;
        }
        return k == 1 ? temp : null;
    }

    ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
