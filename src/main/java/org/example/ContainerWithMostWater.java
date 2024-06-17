package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ContainerWithMostWater {
    //brute force method
    public int maxArea(int[] height) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int maxWaterContained=0;

        for(int i=0; i< height.length; i++){
            for (int j=i+1; j< height.length; j++){
                int waterCapacity = Math.abs((j-i)*Math.min(height[i], height[j]));
                maxWaterContained=Math.max(maxWaterContained, waterCapacity);
            }
        }
        return maxWaterContained;
    }

    public int maxAreaTwoPointer(int[] height){
        int maxWaterContainerArea=0;
        int left=0, right=height.length-1;
        while (left!=right){
            int currentWaterArea=((right-left)*Math.min(height[left],height[right]));
            maxWaterContainerArea=Math.max(maxWaterContainerArea, currentWaterArea);
            if(height[right]<=height[left]){
                right--;
            }else left++;

        }

        return maxWaterContainerArea;
    }
}
