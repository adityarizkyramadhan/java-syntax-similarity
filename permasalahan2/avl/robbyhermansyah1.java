import java.util.*;
class Node {
    int data, height;
    Node left, right;

    Node(int d) {
        data = d;
        height = 1;
    }
}
class AVLTree {
    Node root;

    public int height(Node N) {
        if (N == null)
            return 0;

        return N.height;
    }


    public Node right(Node y) {
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }
    public Node left(Node x) {
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public int getBalance(Node N) {
        if (N == null)
            return 0;

        return height(N.left) - height(N.right);
    }

    public Node insert(Node node, int data) {
        if (node == null)
            return (new Node(data));

        if (data < node.data)
            node.left = insert(node.left, data);
        else if (data > node.data)
            node.right = insert(node.right, data);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && data < node.left.data)
            return right(node);

        if (balance < -1 && data > node.right.data)
            return left(node);

        if (balance > 1 && data > node.left.data) {
            node.left = left(node.left);
            return right(node);
        }

        if (balance < -1 && data < node.right.data) {
            node.right = right(node.right);
            return left(node);
        }

        return node;
    }

    public void inorder(Node node) {
        if (node.left != null) inorder(node.left);
        System.out.print(node.data + " ");
        if (node.right != null) inorder(node.right);
    }
}
public class Avl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int banyak = scan.nextInt();
        AVLTree myAvl = new AVLTree();
        for (int i=0; i<banyak; i++){
            myAvl.root = myAvl.insert(myAvl.root,scan.nextInt());
        }
        myAvl.inorder(myAvl.root);
    }
}


