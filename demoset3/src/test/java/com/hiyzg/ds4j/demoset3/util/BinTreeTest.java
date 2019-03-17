package com.hiyzg.ds4j.demoset3.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by wangxiaohua on 2019/3/17.
 */
public class BinTreeTest {
    @Test
    public void frontShow() throws Exception {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);


        BinTree tree = new BinTree(root);

        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setLeft(node6);
        node3.setRight(node7);

        tree.frontShow();
    }

}