package com.coding;

import java.util.Scanner;


/**
 * Main method to add two linked lists
 */
public class AddTwoLinkedLists {

    public static void main(String[] args) {
        int[] numbersList = new int[2];
        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();

        System.out.println("Enter first positive integer");
        int number1 = scanner.nextInt();
        System.out.println("Enter second positive integer");
        int number2 = scanner.nextInt();

        Integer result = linkedList.addLists(number1, number2);
        System.out.println(result);
    }

}
