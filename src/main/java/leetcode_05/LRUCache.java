package leetcode_05;

import java.util.*;
//146.LRU缓存机制
public class LRUCache {
    private int capacity;
    private Map keyMap = new LinkedHashMap<Object, Object>();

    //构造函数
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    //取出key对应的值，不存在就返回-1
    public int get(int key) {
        if(!keyMap.containsKey(key)){
            return -1;
        }else {
            Object temp = keyMap.get(key);
            keyMap.remove(key);
            keyMap.put(key,temp);
            return (int)temp;
        }
    }
    //放入一个key-value，如果key已存在，就更新对应value
    //不然就插入，如果缓存达到上限时，要先删除最久未使用的数据值
    public void put(int key, int value) {
        if(keyMap.containsKey(key)){
            keyMap.remove(key);
        }else if(keyMap.size() == capacity){
            Iterator<Map.Entry<Integer, Integer>> iterator = keyMap.entrySet().iterator();
            Map.Entry<Integer, Integer> temp = iterator.next();
            iterator.remove();
        }
        keyMap.put(key,value);
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.put(3,3);
        lruCache.put(4,4);
    }
}