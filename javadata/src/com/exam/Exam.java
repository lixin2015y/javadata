package com.exam;

import java.util.ArrayList;
import java.util.Stack;

public class Exam {

    /*输入一个字符串没有重复的返回true有重复的返回false*/
    public static boolean checkDifferent(String iniString) {
        for (int i = 0; i < iniString.length(); i++) {
            for (int j = i + 1; j < iniString.length(); j++) {
                if (String.valueOf(iniString.charAt(i)).equals(String.valueOf(iniString.charAt(j)))) {
                    return false;
                }
            }
        }
        return true;
    }


    /*逆序链表*/
    class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }

        return arrayList;

    }


    public static void main(String[] args) {

//        String str = "abcde";
//        System.out.println(checkDifferent(str));



    }
}
