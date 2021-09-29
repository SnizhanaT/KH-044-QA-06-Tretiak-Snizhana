import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<String> studentNameList = new ArrayList<>();
        System.out.println("Creating a list of student names");
        System.out.println(studentNameList.add("Snizhana"));
        System.out.println(studentNameList.add("Anastasiia"));
        System.out.println(studentNameList.add("Valentyna"));
        System.out.println(studentNameList.add("Yuliia"));
        studentNameList.add(1, "Yuliia");
        System.out.println("Output student names list: "+studentNameList);
        System.out.println("Student on index 3 - "+studentNameList.get(3));
        System.out.println("Last index of Yuliia - "+studentNameList.lastIndexOf("Yuliia"));
        studentNameList.remove("Yuliia");
        System.out.println("Removed one Yuliia student. Left: "+studentNameList);
        System.out.println("Removed student on index 0 - "+studentNameList.remove(0));
        System.out.println("Set new student Tetiana instead of - "+studentNameList.set(1, "Tetiana"));
        System.out.println(studentNameList);
        System.out.println("List is empty: "+studentNameList.isEmpty());
        System.out.println("list size is: "+studentNameList.size());
        System.out.println("List contains Snizhana - "+studentNameList.contains("Snizhana"));
        studentNameList.clear();
        System.out.println(studentNameList);


        System.out.println(" ");

        Set<String> studentFullNameList = new HashSet<>();
        System.out.println("Creating a set of full student names");
        System.out.println(studentFullNameList.add("Snizhana Tretiak"));
        System.out.println(studentFullNameList.add("Anastasiia Gaman"));
        System.out.println(studentFullNameList.add("Valentyna Valentyna"));
        System.out.println(studentFullNameList.add("Yuliia Fedorova"));
        System.out.println(studentFullNameList.add("Yuliia Yuliia"));
        System.out.println(studentFullNameList.add("Yuliia Yuliia"));
        System.out.println("Output student full names set: "+studentFullNameList);
        studentFullNameList.remove("Valentyna Valentyna");
        System.out.println("Removed one student. Left: "+studentFullNameList);
        System.out.println("Set is empty: "+studentFullNameList.isEmpty());
        System.out.println("Set size is: "+studentFullNameList.size());
        System.out.println("Set contains Snizhana Tretiak - "+studentFullNameList.contains("Snizhana Tretiak"));
        studentFullNameList.clear();
        System.out.println(studentFullNameList);

        System.out.println(" ");

        Queue<Character> alphabetQueue = new ArrayDeque<>();
        System.out.println("Creating an alphabet queue");
        System.out.println(alphabetQueue.offer('A'));
        System.out.println(alphabetQueue.offer('B'));
        System.out.println(alphabetQueue.offer('C'));
        System.out.println(alphabetQueue.add('D'));
        System.out.println("Output the alphabet: "+alphabetQueue);
        System.out.println("Ouput the first element: "+alphabetQueue.peek());
        System.out.println("Remove the first element - "+alphabetQueue.poll());
        System.out.println("Alphabet left: "+alphabetQueue);
        System.out.println("Remove the D element - "+alphabetQueue.remove('D'));
        alphabetQueue.clear();
        System.out.println(alphabetQueue);

        System.out.println(" ");

        Map<String, String> map = new HashMap<>();
        System.out.println("Creating a map of users and passwords");
        map.put("user1", "qwas");
        map.put("user2", "qwas1");
        map.put("user3", "qwas2");
        map.put("user4", "qwas3");
        System.out.println(map);
        System.out.println("Is map empty - "+map.isEmpty());
        System.out.println("Map size is - "+map.size());
        System.out.println("The password of user1 is - "+map.get("user1"));
        System.out.println("Does user2 exist - "+map.containsKey("user2"));
        System.out.println("Is qwas1 password used - "+map.containsValue("qwas1"));
        System.out.println("What keys do we have in this map - "+map.keySet());
        System.out.println("What passwords are used in this map - "+map.values());
        System.out.println("Output pairs key+password: "+map.entrySet());
        map.clear();
        System.out.println(map);
    }
}