class Node{

    int data;
    Node left;
    Node rigth;
   
    public Node(int data) {
        this.data = data;
    }
}
class BinaryTree{

    Node root;
    public void add(int data){
        root = addRecursion(root,data);
    }

    public Node addRecursion(Node root,int data){

        if(root == null)
            root = new Node(data);
        else if(data < root.data){
           root.left =  addRecursion(root.left, data);
        }
        else if(data > root.data){
           root.rigth = addRecursion(root.rigth, data);
        }

        return root;
    }

    public void show(){
        showRecursion(root);
        System.out.println();
    }

     //In-order - Left Node,Root Node,Right Node
     //Pre-order -Root Node, Left Node,Right Node
     //post-order - Left Node, Right Node,Root Node
   
    public void  showRecursion(Node root){

        if(root != null){
          showRecursion(root.left);
          System.out.print(root.data+" ");
          showRecursion(root.rigth);
        }
      
    }

}
public class TreeDemo {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(8);
        tree.add(4);
        tree.add(10);
        tree.add(6);
        tree.add(2);

        tree.show();//2 4 6 8 10 
    
        tree.add(1);

        tree.show();//1 2 4 6 8 10 

        tree.add(11);

        tree.show();//1 2 4 6 8 10 11 
    }

}
