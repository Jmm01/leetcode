package leetcode_04;

public class test19 {
    /**
     * 插入排序
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        //用来记录当前值
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            //当前要排序的元素
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && array[preIndex]>current) {
                //将比当前元素大的元素向右挪
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            //此时preIndex位置的元素没有当前元素大，应该插入到该元素的后面
            array[preIndex + 1] = current;
        }
        return array;
    }

    public static void main(String[] args) {
//        int[] array = new int[]{1,5,3,4,2};
//        System.out.println(insertionSort(array));
//

    }
}
