package arraysManipulation.model;

import java.util.List;

public class SimpleList {

    public BaseEntity[] arr;

    public List<BaseEntity> arrayList;

    public Integer numEntries;

    public Integer maxEntries;

    public SimpleList(List arr){
        this.arrayList = arr;
        this.numEntries = 0;
        this.maxEntries = 10;
    }

    public SimpleList() {
        this.arr = new BaseEntity[10];
        this.numEntries = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = new BaseEntity();
        }
        numEntries = 0;
    }

    public void showEntries(){
        BaseEntity[] arr = getArray();
        for(BaseEntity baseEntity : arr){
            System.out.println(baseEntity.getName() + " with value " + baseEntity.getValue());
        }
        System.out.println("================================= Sumary ===================================");
        for(BaseEntity baseEntity : arr){
            System.out.print(baseEntity.getValue() + "  ");
        }
        System.out.println();
    }

    private BaseEntity[] getArray(){
        return arrayList != null ? arrayList.toArray(BaseEntity[]::new) : arr;
    }
}
