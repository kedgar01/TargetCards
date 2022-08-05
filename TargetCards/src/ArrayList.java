import java.util.Arrays;

public class ArrayList<T> {

    private T[] list;
    private int noOfEntries;
    private final int size = 100;


    public ArrayList() {
        T[] tempList = (T[]) new Object[size + 1];
        noOfEntries = 0;
        list = tempList;
    }

    public void add(T newEntry) {
        list[noOfEntries] = newEntry;
        noOfEntries++;
    }


    public void add(int newPosition, T newEntry) {
        if (newPosition >= 1 && newPosition <= noOfEntries + 1) {
            if (noOfEntries + 1 - newPosition >= 0)
                System.arraycopy(list, newPosition, list, newPosition + 1, noOfEntries + 1 - newPosition);
            list[newPosition] = newEntry;
            noOfEntries++;
        } else throw new IndexOutOfBoundsException("New entry position is out of bounds");
    }


    public void remove(int position) {
        if (position >= 0 && position <= noOfEntries) {
            System.arraycopy(list, position + 1, list, position, noOfEntries - position);
            noOfEntries--;
        } else throw new IndexOutOfBoundsException("Remove position is out of bounds");
    }


    public void clear() {
        noOfEntries = 0;
    }


    public void replace(int position, T newEntry) {
        if (position >= 0 && position <= noOfEntries) {
            list[position] = newEntry;
        } else throw new IndexOutOfBoundsException("Replace position is out of bounds");
    }


    public T getEntry(int position) {
        if (position >= 0 && position <= noOfEntries) {
            return list[position];
        } else throw new IndexOutOfBoundsException("Get entry position is out of bounds");
    }


    public T[] toArray() {
        T[] arr = (T[]) new Object[noOfEntries];
        System.arraycopy(list, 0, arr, 0, noOfEntries);
        return arr;
    }


    public int getLength() {
        return noOfEntries;
    }


    public boolean isEmpty() {
        return (noOfEntries == 0);
    }

    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>();

        arr.add("cat");
        arr.add("dog");
        arr.add( 1, "lizard") ;
        System.out.println("List should be cat, lizard, dog") ;
        System.out.println(Arrays.toString(arr.toArray()));
        arr.remove( 0) ;
        System.out.println("List should be lizard, dog");
        System. out.println(Arrays.toString(arr.toArray())) ;
        arr.replace ( 1,"lion");
        System.out.println("List should be lizard, lion") ;
        System.out.println(Arrays.toString(arr.toArray()));
        System.out.println("List is empty?" + arr.isEmpty());
        arr.clear();
        System.out.println("List is empty?" + arr.isEmpty());
        System.out.println("Get first element in list: " + arr.getEntry(0));
        System.out.println(arr.getLength());
        arr.add("frog");
        System.out.println(arr.getLength());
    }

}