package com.coding;

import org.apache.commons.lang3.StringUtils;

/**
 *  Utility/ Helper class to perform operations to add two Linked listed
 */
public class Utility {


    /**
     * Method to form a Linked List for a given integer with each element of integer in a Node of List
     *
     * @param number
     *
     * @return LinkedList
     */
    public LinkedList createLinkedList(int number) {
        LinkedList list = new LinkedList();

        int temp = 0;
        while (number > 0) {
            temp = number % 10;
            list.insertNodeAtEnd(temp);
            number = number / 10;
        }
        return list;
    }


    /**
     * Method to add two linked list values/ numbers and return a result linked list
     *
     * @param l1
     * @param l2
     *
     * @return LinkedList
     */
    public LinkedList addTwoLists(LinkedList l1, LinkedList l2) {
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


    /**
     * Utility method to convert list to Integer
     * @param linkedList
     * @return
     */
    public Integer convertListToInteger(LinkedList linkedList) {
        Node temp = linkedList.head.link;
        String number = StringUtils.EMPTY;
        while (temp != null) {
            number += temp.number;
            temp = temp.link;
        }

        return Integer.parseInt(number);
    }

}
