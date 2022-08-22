package com.javainterview.executorframework;


import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SearchTask extends RecursiveTask<Integer> {

    int array[];
    int start, end;
    int searchElemend;

    public SearchTask(int[] array, int start, int end, int searchElemend) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.searchElemend = searchElemend;
    }

    @Override
    protected Integer compute() {
        System.out.println(Thread.currentThread().getName());
        return processSearch();
    }

    private Integer processSearch() {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (array[i] == searchElemend) {
                count++;
            }
        }
        return count;
    }
}

public class ForkJoinPoolExample1 {
    public static void main(String[] args) {
        int array[] = { 1, 2, 6, 3,  4,  5,  6, 7, 8, 9, 10, 11, 12, 6 };
        int searchElemend = 6;
        int start = 0;
        int end = array.length-1;

        ForkJoinPool joinPool = ForkJoinPool.commonPool();
        SearchTask task = new SearchTask(array, start, end, searchElemend);
        int result = joinPool.invoke(task);
        System.out.println(searchElemend + " found "
                + result + " times ");

    }
}
