package depthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Tree {

    private int totalNodes = 0;
    private int val;
    private Tree left;
    private Tree right;
    private ArrayList<Tree> list;

    Tree(int n) {
        totalNodes = n;
        list = new ArrayList<Tree>();
    }

    public void addNode(int n) {
        // Tree node = new Tree
    }

    public void addEdge(int from, int to) {

    }

    public static void main(String args[]) {
        Tree tree = new Tree(6);
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);

        tree.addEdge(1,2);

        for(int i = 0; i <= tree.totalNodes; i++) {

        }
    }
}
