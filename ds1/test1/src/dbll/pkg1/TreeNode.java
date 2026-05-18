class TreeNode{
	
	int element;
	TreeNode left;
	TreeNode right;

  TreeNode(int data){
	   element=data;
  }	
	
	public static void main(String args[]){
		
		TreeNode node=new TreeNode(10);
		node.left=new TreeNode(9);
		node.right=new TreeNode(11);
		
		
	}
	
}