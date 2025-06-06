class Node{
int val;
Node left,right;
Node(int val){
this.val=val;
left=right=null;
}
}
public class BinarySearchTree{
 Node root;
 Node insert(Node node,int key){
 if(node==null)
 return new Node(key);
 if(key<node.val)
 node.left=insert(node.left,key);
 else if(key>node.val)
 node.right=insert(node.right,key);
 return node;
 }
 boolean search(Node node,int key){
 if(node==null)
 return false;
 if(key==node.val)
 return true;
 else if(key<node.val)
 return search(node.left,key);
 else
 return search(node.right,key);
 }
 void inorder(Node node){
  if(node!=null){
  inorder(node.left);
  System.out.println(node.val+"");
  inorder(node.right);
  }}
  void preorder(Node node){
   if(node!=null){
   System.out.println(node.val+"");
   preorder(node.left);
   preorder(node.right);}}
  }
 