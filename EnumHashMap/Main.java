import java.util.EnumMap;
import java.util.Map;

public class Main extends Mobile{

    public static void main(String[] args){

        Map< Phone , Integer > map = new EnumMap<>(Phone.class);

        System.out.println("\n\t\t\t\t\t\t\t\t=====ENUM HASHMAP=====\n");

            map.put(Phone.OPPO , 7000);
            map.put(Phone.VIVO , 9400);
            map.put(Phone.SAMSUNG , 147000);
            map.put(Phone.APPLE , 150000);
            map.put(Phone.XIAOMI , 7000);
            map.put(Phone.REDMI , 8000);
            map.put(Phone.NOTHING , 10000);
        System.out.println(map);
        }
}