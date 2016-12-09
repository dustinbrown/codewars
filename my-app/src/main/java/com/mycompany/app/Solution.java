package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Solution {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int totalItems = customers.length -1 ;
        if (customers.length == 0) { return 0;}
        List<Integer> inprogressList = new ArrayList<>();
        for (int i=0; i < n; i++) {
            if (i > totalItems) {
                inprogressList.add(0);
            } else {
                inprogressList.add(customers[i]);
            }
        }
        boolean itemsLeft = true;
        int queueSpot = n - 1;
        int time = 0;

        while (itemsLeft) {
            int availableWorker = 0;
            for (int i = 0; i < n; i++) {
                Integer currentItem = inprogressList.get(i);
                if (currentItem == 0 && (totalItems >= queueSpot|| queueSpot > totalItems)) {
                    // worker finished, grab a new one
                    queueSpot++;
                    if (queueSpot > totalItems) {
                        availableWorker++;
                        continue;
                    }
                    inprogressList.set(i, customers[queueSpot] - 1);
                }else {
                    inprogressList.set(i, currentItem -1);
                }
            }
            if (availableWorker == n) {
                itemsLeft = false;
            } else {
                time++;
            }
        }
        return time;
    }
}
