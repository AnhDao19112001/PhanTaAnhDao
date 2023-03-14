package test;

import java.util.HashSet;
import java.util.Set;

public class test1 {
    public static void main(String []args){
        int [] arr = new int[]{1, 3, 5,6};
        Set<Integer> set = new HashSet<Integer>();
        int max = arr[0],  min = arr[0], i = 0;
        for(Integer value : arr){
            if(max < value){
                max = value;
            }
            if(min > value){
                min = value;
            }
            if(!set.contains(value)){
                set.add(value);
            }
        }
        int newArr[] = new int [max - set.size()];
        while(max >= min){
            if(!set.contains(min)){
                newArr[i] = min;
                i++;
            }
            min++;
        }
        for(Integer value : newArr){
            System.out.println(value);
        }
    }
}
