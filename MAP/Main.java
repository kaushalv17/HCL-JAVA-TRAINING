package MAP;
import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {

        // ArrayList of 5 students
        ArrayList<Student> list = new ArrayList<>();

       list.add(new Student("Aman", 22));
list.add(new Student("Rahul", 20));
list.add(new Student("Priya", 21));
list.add(new Student("Neha", 19));
list.add(new Student("Karan", 23));
        // Store age as key and name as value
        HashMap<Integer, String> map = new HashMap<>();

        for (Student s : list) {
            map.put(s.age, s.name);
        }

        // Sort the HashMap by age
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        // Print sorted HashMap
        System.out.println(sortedMap);
    }
}
