package services.sort;

import model.BaseEntity;
import model.SimpleList;

import java.util.List;

public interface ListManipulation {

    void addElementInOrder(SimpleList array, BaseEntity element);
}
