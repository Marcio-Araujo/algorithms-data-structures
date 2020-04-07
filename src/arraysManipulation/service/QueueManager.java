package arraysManipulation.service;

import arraysManipulation.model.BaseEntity;
import arraysManipulation.model.SimpleList;
import arraysManipulation.service.impl.ArrayListManipulationImpl;
import arraysManipulation.service.impl.ListManipulationImpl;

import java.util.ArrayList;
import java.util.List;

public class QueueManager {

    private SimpleList simpleListManager;

    private ListManipulation listManipulation;

    public QueueManager(SimpleList arr){
        listManipulation = new ListManipulationImpl();
        simpleListManager = arr;
    }

    public QueueManager(List<BaseEntity> arr){
        listManipulation = new ArrayListManipulationImpl();
        simpleListManager = new SimpleList(new ArrayList<>(10));
    }

    public void showEntries(){
        simpleListManager.showEntries();
    }

    public void add(BaseEntity element){
        listManipulation.addElementInOrder(simpleListManager, element);
    }

}
