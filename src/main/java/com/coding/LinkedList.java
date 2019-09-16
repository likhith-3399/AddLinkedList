package com.coding;

/**
 *  Linked List class which represents a SINGLE LINKED LIST
 */
public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = new Node();
    }


    /**
     * Method to add a Node in the begining of a linked list
     * @param number
     */
    public void insertNodeInBegining(int number) {
        Node insertNode = new Node(number);

        if(head != null) {
            insertNode.link = head.link;
        }

        head.link = insertNode;
    }

    /**
     * Method to add a Node at the end of a linked list
     * @param number
     */
    public void insertNodeAtEnd(int number){
        Node temp = head;

        Node insertNode = new Node(number);

        while (temp.link != null) {
            temp = temp.link;
        }

//        Once we reach last node
        temp.link = insertNode;
    }


    /**
     * Method to delete First Node of the linked list
     */
    public void deleteFirstNode() {
        if(head == null) {
            return;
        } else {
            if(head.link != null){
                head = head.link;
            }
        }
    }

    /**
     * Method to delete Last Node of the linked list
     */
    public void deleteLastNode() {
        if(head == null) return;

        Node tempNode = head;
        while(tempNode.link.link != null) {
            tempNode = tempNode.link;
        }
        // Once temp tempNode.link is null
        tempNode.link = null;
    }

    /**
     * Method to delete the node whose value matches the given number in the Linked List
     */
    public void deleteNode(int number) {
        if(head == null) return;

        Node temp = head;
        while (temp.link != null) {

            if(temp.link.number == number) {
                System.out.println("Found ..." + number + " .. Deleting.......");
                temp.link = temp.link.link;
                return;
            }
            System.out.println("........Searching for ..."+number);
            temp = temp.link;
        }

        System.out.println(number+" .. Not Found .....");
    }

    /**
     * Method to print the contents od a Linked list
     */
    public void printAll(){

        if(head != null && head.link == null){
            System.out.println("######## EMPTY SINGLE LIST #########");
            return;
        }

        System.out.println("----------- Current List Contents --------------");
        Node temp = head.link;
        while (temp != null) {
            System.out.print(temp.number);
            temp = temp.link;
        }
    }

    /**
     * Method which adds two numbers in the linked lists
     */
    public Integer addLists(int number1, int number2){
        if(number1 < 0 || number2 < 0) {

            throw new RuntimeException("Please enter a positive integer");
        }

        Utility utility = new Utility();

        LinkedList list1 = utility.createLinkedList(number1);
        LinkedList list2 = utility.createLinkedList(number2);

//        System.out.println("Result List : ");
        LinkedList result = utility.addTwoLists(list1, list2);
        return utility.convertListToInteger(result);
    }

}
