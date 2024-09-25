package LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
    public static class LinkedList{
        public ListNode deleteNode(ListNode head, int n){
            if(head == null){
                return head;
            }
            if(n < 0 || n >= length(head)){
                throw new IndexOutOfBoundsException();
            }
            if(n == 0){
                return head.next;
            }
            ListNode prev = head;
            for(int i=0; i<n-1; i++){
                prev = prev.next;
            }
            prev.next = prev.next.next;
            return head;
        }
        private int length(ListNode head){
            int len = 0;
            while(head != null){
                len++;
                head = head.next;
            }
            return len;
        }
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head = l1.deleteNode(head, 2);
        while (head != null) {
            System.out.print(head.val+" ");
            head = head.next;
        }
    }
}
