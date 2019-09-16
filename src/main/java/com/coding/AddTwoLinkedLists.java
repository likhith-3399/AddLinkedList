package com.coding;

import java.util.Scanner;

public class AddTwoLinkedLists {

    public static void main(String[] args) {

        int[] numbersList = new int[2];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first positive integer");
        int number1 = scanner.nextInt();
        System.out.println("Enter second positive integer");
        int number2 = scanner.nextInt();

        if(number1 < 0 || number2 < 0) {

            throw new RuntimeException("Please enter a positive integer");
        }

        LinkedList list1 = createNumberLinkedList(number1);
        LinkedList list2 = createNumberLinkedList(number2);

        System.out.println("Result List : ");
        LinkedList resultList = addTwoLists(list1, list2);
        resultList.printAll();

    }

    private static LinkedList createNumberLinkedList(int number) {
        LinkedList list = new LinkedList();

        int temp = 0;
        while (number > 0) {
            temp = number % 10;
            list.insertNodeAtEnd(temp);
            number = number / 10;
        }
        return list;
    }

    public static LinkedList addTwoLists(LinkedList l1, LinkedList l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        LinkedList resultList = new LinkedList();
        resultList.head = new Node();

        Node resultNode = resultList.head;

        int carry = 0, result = 0;
        Node temp1 = l1.head.link;
        Node temp2 = l2.head.link;

        while (temp1 != null || temp2 != null) {
            result = carry;
            carry = 0;
            if (temp1 != null) {
                result += temp1.number;
                temp1 = temp1.link;
            }
            if (temp2 != null) {
                result += temp2.number;
                temp2 = temp2.link;
            }
            if (result > 9) {
                carry = 1;
                result -= 10;
            }

            resultList.insertNodeInBegining(result);
        }

        if (carry > 0) {
            resultList.head.link = new Node(carry);
        }

        return resultList;
    }

}
