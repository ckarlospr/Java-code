package Excercise;

public class ReverseTree {
    public static void reverseTree(Tree tree){
        if(tree!=null){
            right = tree.right;
            tree.right = tree.left;
            tree.left = right;
            reverse(tree.left);
            reverse(tree.right);
        }
    }
}
