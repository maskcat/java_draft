package cs61b.ch5;

import cs61b.ch5.Map61B.ArrayMap;
import cs61b.ch5.Map61B.MapHelper;

public class Main {
    public static void main(String[] args) {
        ArrayMap<String, Integer> map61 = new ArrayMap<>();
        map61.put("1",1);
        map61.put("2",2);
        map61.put("test",3);
        Integer get = MapHelper.get(map61,"test");
        System.out.println(get);
    }
}
