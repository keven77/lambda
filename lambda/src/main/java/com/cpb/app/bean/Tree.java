package com.cpb.app.bean;

/**
 * @version V1.0
 * @Author pengbo
 * @Title: 二叉树类
 * @date 14:12 2017/10/24
 */
public class Tree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public Tree() {

    }

    public Tree(Node root) {
        this.root = root;
    }

    public void insert(int key, Object value) {
        Node node = new Node(key, value);
        if (this.root == null) {
            this.root = node;
        }
        while (true) {
            Node currentNode = this.root;
            if (key > currentNode.getKey()) {
                if (currentNode.getRightChildNode() == null) {
                    currentNode.setRightChildNode(node);
                    return;
                } else {
                    currentNode = currentNode.getRightChildNode();
                }
            } else {
                if (currentNode.getLeftChildNode() == null) {
                    currentNode.setLeftChildNode(node);
                    return;
                } else {
                    currentNode = currentNode.getLeftChildNode();
                }
            }
        }
    }

    public Node find(int key) {
        Node currentNode = this.root;
        while (currentNode.getKey() != key) {
            if (key > currentNode.getKey()) {
                currentNode = currentNode.getRightChildNode();
            } else {
                currentNode = currentNode.getLeftChildNode();
            }
        }
        if (currentNode == null) {
            return null;
        }
        return null;
    }
    
}
