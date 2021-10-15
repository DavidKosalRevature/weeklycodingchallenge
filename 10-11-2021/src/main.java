import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(1,1);
        map.put(2,2);
        map.put(3,3);

        Iterator iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Key: " + entry.getKey() + "| Value: " + entry.getValue());
        }

        for(Map.Entry entry: map.entrySet()){
            System.out.println("Key: " + entry.getKey() + "| Value: " + entry.getValue());
        }


        String s1 = "abcd";
        String s2 = "dabc";
        String s3 = "dbac";

        System.out.println(checkStringRotation(s1, s2));
        System.out.println(checkStringRotation(s1, s3));
    }

    public static boolean checkStringRotation(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        String s3 = s1 + s1;

        if(s3.contains(s2)){
            return true;
        }
        else{
            return false;
        }
    }
}
