package ss10.bai_tap.bt_1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("Chien");
        myList.add("Huy");
        myList.add("Vinh");

        System.out.println("Element at index 1: " + myList.get(1));

        myList.remove(2);
        System.out.println("After removing element at index 2: " + myList.get(1));

        System.out.println("List contains 'Huy': " + myList.contains("Huy"));
        System.out.println("Index of 'Vinh': " + myList.indexOf("Vinh"));
        System.out.println("Size: " + myList.size());

        MyList<String> clonedList = myList.clone();
        System.out.println("Cloned list element at 0: " + clonedList.get(0));
    }
}
