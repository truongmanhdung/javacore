package packageTwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List linked = new LinkedList();
        linked.add(1);
        linked.add(2);
        List arrayList = new ArrayList();
        arrayList.add(1);
        methodOne(linked);
        methodOne(arrayList);
    }
    public static void methodOne(List list){
        System.out.println( list.size());
    }
}
