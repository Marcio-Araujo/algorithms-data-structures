package services.sort.impl;

import model.BaseEntity;
import model.SimpleList;
import services.sort.ListManipulation;

public class ArrayListManipulationImpl implements ListManipulation {

    @Override
    public void addElementInOrder(SimpleList simpleList, BaseEntity element) {
        if(simpleList.numEntries < simpleList.maxEntries  || element.getValue() > simpleList.arrayList.get(simpleList.numEntries-1).getValue() ){
            if(simpleList.numEntries < simpleList.maxEntries) simpleList.numEntries++;
            int i  = simpleList.numEntries-1;
            while(i > 0 && simpleList.arrayList.get(i-1).getValue() < element.getValue()){
                simpleList.arrayList.add(i, simpleList.arrayList.get(i-1));
                simpleList.arrayList.remove(i-1);
                i--;
            }
            simpleList.arrayList.add(i, element);
            if(simpleList.arrayList.size() > 10){
                simpleList.arrayList.remove(10);
            }
        }
    }
}
