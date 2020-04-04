package services.sort.impl;

import model.BaseEntity;
import model.SimpleList;
import services.sort.ListManipulation;

public class ListManipulationImpl implements ListManipulation {

    @Override
    public void addElementInOrder(SimpleList simpleList, BaseEntity element) {
        //only include if the array is not full or if the element if greater than the last element.

        if(simpleList.numEntries < simpleList.arr.length || element.getValue() > simpleList.arr[simpleList.numEntries-1].getValue() ){
            if(simpleList.numEntries < simpleList.arr.length) simpleList.numEntries++;
            int i  = simpleList.numEntries-1;
            while(i > 0 && simpleList.arr[i-1].getValue() < element.getValue()){
                simpleList.arr[i] = simpleList.arr[i-1];
                i--;
            }
            simpleList.arr[i] = element;
        }
    }
}
