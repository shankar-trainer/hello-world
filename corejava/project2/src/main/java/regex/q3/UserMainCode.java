package regex.q3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class UserMainCode {
    static int sizeOfResultandHashMap(HashMap<Integer, String> map1) {
        ConcurrentHashMap<Integer,String> map3=new ConcurrentHashMap<>(map1);

        for (int i : map3.keySet()) {
            if (i % 4 == 0)
                map3.remove(i);
        }
        return map3.size();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        HashMap<Integer,String> map=new HashMap<>();
        for (int i = 0; i<x ; i++) {
            int k=scanner.nextInt();
            scanner.nextLine();
            String v= scanner.nextLine();
            map.put(k,v);
        }
        System.out.println(UserMainCode.sizeOfResultandHashMap(map));
    }
}