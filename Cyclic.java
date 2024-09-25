package LinkedList;

class Cyclic {
    int val;
    Cyclic next;
    Cyclic(int x){
        val = x;
    }    
    public static class LinkedList{
        public boolean hasCycle(Cyclic head){
            if(head == null || head.next == null){
                return false;
            }
            Cyclic hare =  head;
            Cyclic turtle = head;
            while (hare.next != null && hare.next.next != null) {
                hare = hare.next.next;
                turtle = turtle.next;
                if(hare == turtle){
                    return true;
                }
            }
            return false;
        }
        public Cyclic removeCycle(Cyclic head){
            Cyclic hare =  head;
            Cyclic turtle = head;
            while (hare.next != null && hare.next.next != null) {
                hare = hare.next.next;
                turtle = turtle.next;
                if(hare == turtle){
                    break;
                }
            }
            Cyclic ptr1 = head;
            Cyclic ptr2 = hare;
            while (ptr1 != ptr2) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
            Cyclic temp = ptr2;
            while (temp.next != ptr2) {
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Cyclic head = new Cyclic(1);
        head.next = new Cyclic(2);
        head.next.next = new Cyclic(3);
        head.next.next.next = new Cyclic(4);
        head.next.next.next.next = new Cyclic(5);
        // Creating the cycle
        head.next.next.next.next.next = head.next.next;

        System.out.println(l1.hasCycle(head));
        System.out.println(l1.removeCycle(head));
    }
}