package com.hiyzg.ds4j.demoset3.util;

/**
 * Created by wangxiaohua on 2019/3/17.
 */
public class TreeNode {
    private int value;

    private TreeNode left;

    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void frontShow() {
        System.out.println(this.value);
        if (left != null) {
            this.left.frontShow();
        }
        if (right != null) {
            this.right.frontShow();
        }
    }
}
