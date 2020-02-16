import java.util.*;

class Data<K, V> {
    private K key;
    private V value;

    public Data(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Data{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}



public class Demo {
    public static void main(String[] args) {
        /*
        List<Data<String>> elements = new LinkedList<>();
        elements.add(new Data<String>("Some text"));
        elements.add(new Data<String>("1"));

        Demo app = new Demo();
        app.printList(elements);
         */

        Comparator c = new Comparator<Data<Integer, String>>() {
            @Override
            public int compare(Data<Integer, String> o1, Data<Integer, String> o2) {
                if(o1.getKey() > o2.getKey()){
                    return 1;
                }else if (o1.getKey() < o2.getKey()){
                    return -1;
                }
                return 0;
            }
        };

        Demo app = new Demo();
        Set<Data<Integer, String>> set = new TreeSet<>(c);
        set.add(new Data(1, "One"));
        set.add(new Data(2, "Two"));
        set.add(new Data(3,"Three"));
        set.add(new Data(4,"Four"));
        app.printList2(set);

    }

    void printList2(Set<Data<Integer, String>> set){
        for (Data<Integer,String> s :set) {
            System.out.println(s);
        }
    }

}
