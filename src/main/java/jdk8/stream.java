package jdk8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class stream {
    /**
     * 　中间操作
     *
     * 　　filter：过滤流，过滤流中的元素，返回一个符合条件的Stream
     *
     * 　　map：转换流，将一种类型的流转换为另外一种流。（mapToInt、mapToLong、mapToDouble 返回int、long、double基本类型对应的Stream）
     *
     * 　　flatMap：简单的说，就是一个或多个流合并成一个新流。（flatMapToInt、flatMapToLong、flatMapToDouble 返回对应的IntStream、LongStream、DoubleStream流。）
     *
     * 　　distinct：返回去重的Stream。
     *
     * 　　sorted：返回一个排序的Stream。
     *
     * 　　peek：主要用来查看流中元素的数据状态。
     *
     * 　　limit：返回前n个元素数据组成的Stream。属于短路操作
     *
     * 　　skip：返回第n个元素后面数据组成的Stream。
     *
     * 　　结束操作
     *
     * 　　forEach: 循环操作Stream中数据。
     *
     * 　　toArray: 返回流中元素对应的数组对象。
     *
     * 　　reduce: 聚合操作，用来做统计。
     *
     * 　　collect: 聚合操作，封装目标数据。
     *
     * 　　min、max、count: 聚合操作，最小值，最大值，总数量。
     *
     * 　　anyMatch: 短路操作，有一个符合条件返回true。
     *
     * 　　allMatch: 所有数据都符合条件返回true。
     *
     * 　　noneMatch: 所有数据都不符合条件返回true。
     *
     * 　　findFirst: 短路操作，获取第一个元素。
     *
     * 　　findAny: 短路操作，获取任一元素。
     *
     * 　　forEachOrdered: 暗元素顺序执行循环操作
     */
    public static void main(String[] args) {
//        testCollectionStream();
//        unLimitStream();
//        unLimitStream2();
//        testMap();
//        filter();
//        testFlatMap();
//        sort();
//        sort2();
//        testMaxAndMin();
        findFirst();
    }
    public static void testCollectionStream(){
        List<String> strings = Arrays.asList("abc","adc","bcd","def");
        //创建普通流
        Stream<String> stringStream = strings.stream();
        stringStream.forEach(System.out::println);
        //创建并行流
        Stream<String> parallelStream = strings.parallelStream();
        stringStream.forEach(System.out::println);
    }

    public static void emptyStream(){
        Stream<Integer> stream = Stream.empty();
    }
    public static void unLimitStream(){
        Stream.generate((() -> "number" + new Random().nextInt())).limit(20).forEach(System.out::println);
    }
    public static void unLimitStream2(){
        Stream.iterate(0,x -> x+1).limit(10).forEach(System.out::println);
        Stream.iterate(0,x -> x).limit(10).forEach(System.out::println);
    }

    //遍历字符串数组转为大写输出
    public static void testMap(){
        String[] str = {"sdf","sdfdsFFF","dfsGdsf"};
        Stream.of(str).map(t ->t.toUpperCase()).forEach(System.out::println);
    }
    //过滤器筛选符合条件的输出
    public static void filter(){
        String[] str = {"sdf","sdfdsFFF","dfsGdsf"};
        Stream.of(str).filter(t -> ! t.equals("sdf")).forEach(System.out::println);
    }

//    一个或多个流合并成一个新流
    public static void testFlatMap(){
        List<String> list = Arrays.asList("beijing changcheng", "beijing gugong", "beijing tiantan", "gugong tiananmen");
        list.stream().map(item -> Arrays.stream(item.split(" "))).forEach(System.out::println);
        list.stream().flatMap(item -> Arrays.stream(item.split(" "))).forEach(System.out::println);
        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(2);
        List<Integer> b=new ArrayList<>();
        b.add(3);
        b.add(4);
        List<Integer> figures=Stream.of(a,b).flatMap(u->u.stream()).collect(Collectors.toList());
        figures.forEach(f->System.out.println(f));

    }

    //根据字符串长度排序
    public static void sort(){
        String[] arr1 = {"abc","a","bc","abcd"};
        Arrays.stream(arr1).sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }

    public static void sort2(){
        String[] arr1 = {"abc","a","bc","abcd"};
        Arrays.stream(arr1).sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
    }

    public static void testMaxAndMin(){
        String[] arr = {"abc","a","bc","abcd"};
        Optional<String> option = Stream.of(arr).max(Comparator.comparing(String::length));
        option.ifPresent(System.out::println);
        Stream.of(arr).min(Comparator.comparing(String::length)).ifPresent(System.out::println);
    }

    public static void findFirst(){
        String[] arr = {"abc","a","bc","abcd"};
        String str = Stream.of(arr).parallel().filter(t -> t.length()>3).findFirst().orElse("nothing");
        System.out.println(str);
    }

}
