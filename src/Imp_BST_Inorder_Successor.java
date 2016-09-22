/*
public class Imp_BST_Inorder_Successor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(node.right!=null){
			findMin(node.right);//if right child exists then successor is the smallest value on the right side
								// which is the leftmost node on the right side!
		}
		else{
			findAncestor(node);//for no right child successor is the ancestor which is the left child 
							   //of it's parent!
		}
	}
	public static void findMin(Node node){
		while(node.left!=null){
			node=node.left;
		}
		System.out.println(node.val);
	}
	public static void findAncestor(Node node){
		Node parent=node.parent;
		while(node!=parent.left){
			node=parent;
			parent=parent.parent;
		}
		System.out.println(parent.val);
	}

}
*/
