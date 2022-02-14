package com.company;

import java.util.*;

public class Matrix {

    ArrayList<Integer> arr = new ArrayList();

    private ArrayList zerosArr = new ArrayList();

    public void calculateMatrix() {

        //Задача с палиндромом

//        String s = "ПААП";
//        if (s.toLowerCase().equals(new StringBuilder(s).reverse().toString().toLowerCase()))
//
//            System.out.println("Палиндром! " + s);
//
//        else
//            System.out.println("Не палиндром! " + s);

        //еревернуть массив

//        int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//        int size = myArray.length;
//        for (int i = 0; i < size / 2; i++) {
//            int temp = myArray[i];
//            myArray[i] = myArray[size - 1 - i];
//            myArray[size - 1 - i] = temp;
//        }
//        System.out.println("Array after reverse:: ");
//        System.out.println(Arrays.toString(myArray));
//    }

        int[] nums = {0,3,1,12,0};

        int zeroNums = 0;// Используется для подсчета количества нулей в массиве

        Arrays.sort(nums);

        for(int i = 0;i < nums.length; i ++ )
        {
            if(nums[i] == 0)
            {
                zeroNums++;// Переход к значению 0, количество +1
            }

            if(nums[i] != 0)
            {
                nums[i-zeroNums] = nums[i];// Перейти к ненулевому значению, переместить его в правильную позицию, пройденное расстояние равно нулю
            }
        }

        for(int j = nums.length-1; zeroNums >0 ;j -- , zeroNums-- )// Наконец, заполняем все 0 в конце массива
        {
            nums[j] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        //Сортировка пузырьком

        int temp;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]) {
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

    }
}
