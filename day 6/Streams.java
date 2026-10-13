import java.util.*;
import java.util.stream.Collectors;

public class Streams{
    public static void main(String[]args){


        // List<Integer> nums= Arrays.asList(1,2,3,4,5,6);

        // nums.stream().filter(n -> n%2==0).forEach(System.out::println);

        // nums.stream().map(n-> n*2).forEach(System.out::println);

                //nums.stream().sorted().forEach(System.out::println);


                 List<String> nums = Arrays.asList("aman", "kaushal", "amam");

        List<String> result = nums.stream()
                .filter(name -> name.startsWith("a"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}