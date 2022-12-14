package ss10.bai_tap.ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0; // so luong phan tu trong mang
    private static final int DEFAULT_CAPACITY = 10;
    public Object element[];

    public MyList() {
      element = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0 ){
            element = new Object[capacity];
        }else {
           throw new IllegalArgumentException("capacity" + capacity);
        }
    }

    public int size(){
        return this.size;
    }

    public void clear(){
        size = 0;
        for (int i = 0; i<element.length; i++){
            element[i] = null;
        }
    }

    public boolean add(E elements){
        if (element.length == size){
            this.ensureCapacity(2);
        }
        element[size] = elements;
        size++;
        return true;
    }

    public void add(E elements, int index){
        if (index > element.length){
            throw new IllegalArgumentException("index:  " + index);
        }else if (element.length == size){
            this.ensureCapacity(2);
        }

       if (element[index] == null){
           element[index] = elements;
       }else {
           for (int i=0;i>= index;i--){
               element[i] = element[i-1];
           }
           element[index] = elements;
           size++;
       }

    }

// phuong thuc tang kich thuoc ham
    public void ensureCapacity(int minCapacity){
        if (minCapacity >= 0){
            int newSize = this.element.length + minCapacity;
            element = Arrays.copyOf(element, newSize);
        }else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity );
        }
    }



    public E get(int index){
        return (E) element[index];
    }

    public int indexOf(E elements){
        int index = -1;
        for (int i =0; i<size;i++){
            if (this.element[i].equals(elements)){
                return i;
            }
        }
        return index;
    }

}



