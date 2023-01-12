import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> array1 = new ArrayList<>(Arrays.asList("Mamao","Pera","Kiwi","Morango","Banana"));
        List<String> array2 = new ArrayList<>(Arrays.asList("Limao","Banana","Uva","Morango","Melao"));
        List<String> result = new ArrayList<>();


        for(int i = 0; i < array1.size(); i++){
            String value = array1.get(i);

            if(array2.contains(value)){
                result.add(value);
            }
        }

        System.out.println(result);
    }
}
