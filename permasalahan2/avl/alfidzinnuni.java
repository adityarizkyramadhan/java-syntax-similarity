import java.util.Scanner;

class Node{
    int data;
    int level;
    Node left, right;

    Node(int data){
        this.data = data;
        level = 0;
        left = right = null;
    }
}

class AVL{
    Node root;

    AVL(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    int checkLevel(Node node){
        if (node == null){
            return (-1);
        } else {
            return node.level;
        }
    }

    int highestLevel(int leftHeight, int rightHeight){
        if (leftHeight > rightHeight){
            return leftHeight;
        } else {
            return rightHeight;
        }
    }

    void insert(int data){
        root = inputData(data, root);
    }

    Node inputData(int data, Node node){
        if (node == null){
            node = new Node(data);
        } else if (data < node.data){
            node.left = inputData(data, node.left);
            if ((checkLevel(node.left) - checkLevel(node.right)) > 1){
                if (data < node.left.data){

                } else {

                }
            }
        } else if (data > node.data){
            node.right = inputData(data, node.right);
            if ((checkLevel(node.right) - checkLevel(node.left)) > 1){
                if (data > node.right.data){

                } else {

                }
            }
        }

        node.level = (highestLevel(checkLevel(node.left), checkLevel(node.right)) + 1);
        return node;
    }

    Node switchLeft(Node temp){
        Node node = temp.left;
        temp.left = node.right;
        node.right = temp;

        temp.level = (highestLevel(checkLevel(temp.left), checkLevel(temp.right)) + 1);
        node.level = (highestLevel(checkLevel(node.left), temp.level) + 1);
        return node;
    }

    Node switchRight(Node temp){
        Node node = temp.right;
        temp.right = node.left;
        node.left = temp;

        temp.level = (highestLevel(checkLevel(temp.left), checkLevel(temp.right)) + 1);
        node.level = (highestLevel(checkLevel(node.right), temp.level) + 1);
        return node;
    }

    Node doubleSwitchLeft(Node temp){
        temp.left = switchRight(temp.left);
        return switchLeft(temp);
    }

    Node doubleSwitchRight(Node temp){
        temp.right = switchRight(temp.right);
        return switchRight(temp);
    }

    void print(){
        traverse(root);
    }

    void traverse(Node temp){
        if (temp != null){
            traverse(temp.left);
            System.out.printf("%d ", temp.data);
            traverse(temp.right);
        }
    }
}

public class Nugas{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt(); input.nextLine();
        AVL tree = new AVL();

        for (int i = 0; i < x; i++){
            int temp = input.nextInt();
            tree.insert(temp);
        }

        tree.print();

        input.close();
    }
}
