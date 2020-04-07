package arraysManipulation.controller;

import arraysManipulation.model.BaseEntity;
import arraysManipulation.model.SimpleList;
import arraysManipulation.service.QueueManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Execution {

    private static QueueManager queueManager;

    private static final int PRIMITIVE_ARRAY = 1;
    private static final int JAVA_UTIL_LIST = 2;


    public static void main(String[] args) {

        initiateQueueManager(getUserOption());

        queueManager.add(new BaseEntity(10, "João"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(3, "Maria"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(4, "Bernardo"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(15, "Alicia"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(9, "Ana"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(16, "Manoel"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(7, "Clarissa"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(2, "Kátia"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(1, "Mariana"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(30, "Marina"));
        queueManager.showEntries();

        queueManager.add(new BaseEntity(22, "Roger"));
        queueManager.showEntries();

    }

    private static int getUserOption(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Top 10 score list function");
        System.out.println("Define array implementation");
        System.out.println("===========================");
        System.out.println(PRIMITIVE_ARRAY  + " - primitive array");
        System.out.println(JAVA_UTIL_LIST + " - Java util List");

        return myObj.nextInt();
    }

    private static void initiateQueueManager(int option){
        if(option == PRIMITIVE_ARRAY){
            queueManager = new QueueManager(new SimpleList());
        } else if(option == JAVA_UTIL_LIST){
            queueManager = new QueueManager(new ArrayList<>());
        }
    }
}
