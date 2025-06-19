package String.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateStrings {
    public static void main(String[] args) {

        String str ="apple, banana, apple, orange, banana, grape" ;
        
        List<String> list = Arrays.stream(str.split(", "))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet()
        .stream()
        .filter(en -> en.getValue() == 1)
        .map(en -> en.getKey())
        .toList();

        System.out.println(list);


        
    }
  
    
            
        
}
