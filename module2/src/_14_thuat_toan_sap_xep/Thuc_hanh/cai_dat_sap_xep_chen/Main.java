package _14_thuat_toan_sap_xep.Thuc_hanh.cai_dat_sap_xep_chen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,76,22,34,5};
        InsertSort selectionSort = new InsertSort();
        selectionSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
