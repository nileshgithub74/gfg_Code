

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        
        ArrayList<Integer> result = new ArrayList<>();
        
        Queue<Node> q = new LinkedList<>();
        
        q.add(root);
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int i=0; i< size; i++){
                Node curr = q.poll();
                
                if(i==0) result.add(curr.data);
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                
                
                
            }
        
        }
        return result;
        
    }
}