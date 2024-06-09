class GfG {
    Node deleteNode(Node head, int x) {
        if (head == null || x <= 0) {
            return head;
        }

        if (x == 1) {
            return head.next;
        }

        Node prev = null;
        Node curr = head;
        int count = 1;

        while (curr != null && count < x) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        if (curr != null) {
            prev.next = curr.next;
        }

        return head;
    }
}
