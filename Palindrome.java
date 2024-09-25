package LinkedList;
import java.util.Stack;

class Palindrome {
    int val; 
    Palindrome next;
    Palindrome(int x) {
        val = x;
    }
    public static class LinkedList{
        public boolean isPalindrome(Palindrome head){
            Stack<Integer> stack = new Stack<>();
            Palindrome currNode = head;
            while (currNode != null) {
                stack.push(currNode.val);
                currNode = currNode.next;
            }
            currNode = head;
            while (currNode != null) {
                if(currNode.val != stack.pop()){
                    return false;
                }
                currNode = currNode.next;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        Palindrome head = new Palindrome(1);
        head.next = new Palindrome(2);
        head.next.next = new Palindrome(3);
        head.next.next.next = new Palindrome(2);
        head.next.next.next.next = new Palindrome(1);

        System.out.println(l1.isPalindrome(head));

    }
}