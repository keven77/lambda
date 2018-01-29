package com.cpb.app.bean;

/**
 * @version V1.0
 * @Author pengbo
 * @Title: 节点类
 * @date 14:08 2017/10/24
 */
public class Node {
    private int key;
    private Object value;
    private Node leftChildNode;
    private Node rightChildNode;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getLeftChildNode() {
        return leftChildNode;
    }

    public void setLeftChildNode(Node leftChildNode) {
        this.leftChildNode = leftChildNode;
    }

    public Node getRightChildNode() {
        return rightChildNode;
    }

    public void setRightChildNode(Node rightChildNode) {
        this.rightChildNode = rightChildNode;
    }

    public Node(int key, Object value) {
        this.key = key;
        this.value = value;
    }
}
