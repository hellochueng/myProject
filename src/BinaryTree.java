

public class BinaryTree {
	 private TreeNode root=null;  
     
	    public BinaryTree(){  
	        root=new TreeNode(1,"rootNode(A)");  
	    }  
	    
	    public void createBinTree(TreeNode root){  
	        TreeNode newNodeB = new TreeNode(2,"B");  
	        TreeNode newNodeC = new TreeNode(3,"C");  
	        TreeNode newNodeD = new TreeNode(4,"D");  
	        TreeNode newNodeE = new TreeNode(5,"E");  
	        TreeNode newNodeF = new TreeNode(6,"F");  
	        root.leftChild=newNodeB;  
	        root.rightChild=newNodeC;  
	        root.leftChild.leftChild=newNodeD;  
	        root.leftChild.rightChild=newNodeE;  
	        root.rightChild.rightChild=newNodeF;  
	    }  
	      
	      
	    public boolean isEmpty(){  
	        return root==null;  
	    }  
	  
	    //树的高度  
	    public int height(){  
	        return height(root);  
	    }  
	      
	      
	    private int height(TreeNode subTree){  
	        if(subTree==null)  
	            return 0;//递归结束：空树高度为0  
	        else{  
	            int i=height(subTree.leftChild);  
	            int j=height(subTree.rightChild);  
	            return (i<j)?(j+1):(i+1);
	        }  
	    }
	    
	    public static void main(String[] args) {
	    	BinaryTree t = new BinaryTree();
	    	t.createBinTree(t.root);	
	    	System.out.println(t.height());
		}
}

class  TreeNode{  
    private int key=0;  
    private String data=null;  
    private boolean isVisted=false;  
    TreeNode leftChild=null;  
    TreeNode rightChild=null;  
      
    public TreeNode(){}  
       
    public TreeNode(int key,String data){  
        this.key=key;  
        this.data=data;  
        this.leftChild=null;  
        this.rightChild=null;  
    }  


}  