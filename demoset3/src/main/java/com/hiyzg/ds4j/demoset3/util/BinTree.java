package com.hiyzg.ds4j.demoset3.util;

/**
 * Created by wangxiaohua on 2019/3/17.
 */
public class BinTree {
    private TreeNode root;

    public BinTree(TreeNode root) {
        this.root = root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void frontShow() {
        this.root.frontShow();
    }

}
