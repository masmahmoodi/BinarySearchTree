


// Go down to find main class

public class BinrarySearchTreeDriver_ {
   // inner class for creating nodes
   static  class Node {
        Node left;
        Node right;
        int value;
        // inner class constructor 
        Node(int value){
            this.value = value;
        }
    }
   
   
    //static method
    static Node insert(Node root,int value){
        if(root ==null){
            root = new Node(value);
            return root;
        }
        if(value<root.value){
            root.left = insert(root.left, value);
            
                   
        }else{
            root.right = insert(root.right, value);
        }
        return root;
    }
    
    // pre order
    static void  preOrder(Node root){
        if(root == null){
            System.out.print ("-1 ");
            return;
        }
        System.out.print(root.value+" ");
        preOrder(root.left);
        preOrder(root.right);
        
    }
    
    
    
    // post order
    static void postOrder(Node root){
        if(root == null){
               System.out.print ("-1 ");
                return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value+" ");
    }
    
    
      // in order
        static void inOrder(Node root){
        if(root == null){
               System.out.print ("-1 ");
                return;
        }
        postOrder(root.left);
          System.out.print(root.value+" ");
        postOrder(root.right);
      
    }
        
   // search     
   static boolean Search(Node root, int key){
    
        if(root==null){
            return false;
        }
        if(root.value==key){
            return true;
        }
        if(key<root.value){
           return Search(root.left, key);
        }
        else {
            return Search(root.right, key);
        } 
    }

         
     
        
    public static void main(String[] args) {
  
        
                 // run your code here 
        
        
        
//        int values[] = {1,2,3,5,7,6,15,10};
//        Node root = null;
//        for (int i = 0; i < values.length; i++) {
//           root = insert(root, values[i]);
//  
//        }
        
        
   
    
}
















