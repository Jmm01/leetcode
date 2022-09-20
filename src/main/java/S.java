import java.util.ArrayList;
import java.util.List;

public class S extends F {
    @Override
    void sys() {
        System.out.println("子类的sys方法");
    }
    public static void main(String[] args) {
//        F f = new S();
//        f.sys();
        String a = "abcde";
        String b = "abcd";
        String c = "abde";
        System.out.println(a.contains(b));
        System.out.println(a.contains(c));
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('a');
        list.add('d');
        list.add('a');
        list.add('c');
        boolean remove = list.remove((Object) 'r');
//        System.out.println("teacher" - "bleacher");
        System.out.println(remove);
//        list.remove('c');

    }

}


