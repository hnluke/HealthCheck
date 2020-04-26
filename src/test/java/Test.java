import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        list1.add("s");
        list1.add("b");
        list1.add("c");
        list1.add("p");
        list2.add("a");
        list2.add("f");
        list2.add("d");
        list2.add("s");
        System.out.print(list1.retainAll(list2));
        System.out.println(list1.size());


    }
}
