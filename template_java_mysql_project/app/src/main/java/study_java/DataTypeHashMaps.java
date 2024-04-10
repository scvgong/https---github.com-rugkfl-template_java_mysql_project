package study_java;
import java.util.HashMap;

public class DataTypeHashMaps {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        // 값 넣기
        hashMap.put("England","London");
        hashMap.put("Germany","Berlin");
        hashMap.put("Norway","Oslo");

        /* 
        hashMap.get("Norway")
        "Oslo"
        hashMap.size()
        3
        hashMap.remove("Germany")
        "Berlin"
        hashMap.size()
        2
        */

        for(String key:hashMap.keySet()){
            System.out.println("hashMap value with key : " + key + ", value : " + hashMap.get(key));
        }

        System.out.println("Hello World!");
       // return 0; 
    }
}