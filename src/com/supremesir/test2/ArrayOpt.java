package com.supremesir.test2;

/**
 * @author HaoFan Fang
 * @date 2019/12/6 10:59
 */

public class ArrayOpt {

    private  int[] array;
    private int min_location, min_number;
    private double average;

    ArrayOpt(int[] array) {
        this.array = array;
        min_location = -1;
        min_number = 10000;
        find();
        compute();
    }

    private void find() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min_number) {
                min_number = array[i];
                min_location = i;
            }
        }
    }

    private void compute() {
        int sum = 0;
        for (int e :array){
            sum += e;
        }
        average = (double) sum / array.length;
    }

    public int getMin_location() {
        return min_location + 1;
    }

    public int getMin_number() {
        return min_number;
    }

    public double getAverage() {
        return average;
    }
}
