/*
class Node {
    int data;
    Node next;
    Node prev;

    Node(int d) {
        data = d;
        next = null;
        prev = null;
    }
}
*/

class Solution {
    public Node createDLL(int arr[]) {
        // code here
        
        int n  = arr.length;
        
        Node  head =  new Node(arr[0]);
        Node prev = head;
        
        
        for(int i =1; i < n; i++){
            Node curr = new  Node(arr[i]);
            curr.prev = prev;
            prev.next = curr;
            prev = curr;
            
        }
        
        return head;
        
        
    }
}