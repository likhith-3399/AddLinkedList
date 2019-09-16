package com.coding;

/**
 *  Linked List class which represents a SINGLE LINKED LIST
 */
public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = new Node();
    }


    public void insertNodeInBegining(int number) {
        Node insertNode = new Node(number);

        if(head != null) {
            insertNode.link = head.link;
        }

        head.link = insertNode;
    }

    public void insertNodeAtEnd(int number){
        Node temp = head;

        Node insertNode = new Node(number);

        while (temp.link != null) {
            temp = temp.link;
        }

//        Once we reach last node
        temp.link = insertNode;
    }


    public void deleteFirstNode() {
        if(head == null) {
            return;
        } else {
            if(head.link != null){
                head = head.link;
            }
        }
    }

    public void deleteLastNode() {
        if(head == null) return;

        Node tempNode = head;
        while(tempNode.link.link != null) {
            tempNode = tempNode.link;
        }
        // Once temp tempNode.link is null
        tempNode.link = null;
    }

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

    public void printAll(){

        if(head != null && head.link == null){
            System.out.println("######## EMPTY SINGLE LIST #########");
            return;
        }

//        System.out.println("----------- Current List Contents --------------");
        Node temp = head.link;
        while (temp != null) {
            System.out.print(temp.number);
            temp = temp.link;
        }
    }


}
