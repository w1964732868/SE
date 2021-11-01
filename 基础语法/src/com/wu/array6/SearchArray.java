package com.wu.array6;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/11/1
 * @description 线性查找、二分法查找(必须有序) 提升认值能力
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class SearchArray {
    public static void main(String[] args) {
        String[] arr = {"DD", "EE", "PP"};
        String dest = "AA";
        boolean isFlag = true;
        int i = 0;
        for (; i < arr.length; i++) {//[0  ~  arr.length-1]
            if (dest.equals(arr[i])) {
                isFlag = false;
                //线性查找 查询
                System.out.println("找到了，索引为" + i);
                break;//找到不用接着循环了
            }

        }
        if (i == arr.length) {
            System.out.println("没有找到1");
        }
        if (isFlag) {
            System.out.println("没有找到2");
        }

        int[] arr2 = {-98, -43, 2, 34, 54, 66, 79, 105, 210, 333};
        int dest1 = 34;
        int head = 0;//初始 首索引
        int end = arr2.length - 1;//初始 尾索引
        boolean isFlag1 = true;
        while (head <= end){
            int middle = (head+end)/2;
            if (arr2[middle] == dest1){
                isFlag1 = false;
                System.out.println("找到了，索引为" + middle);
                break;
            }else if(arr2[middle] > dest1){
                end = middle - 1;
            }else {//arr2[middle] < dest1
                head = middle + 1;
            }

        }
        if (isFlag1) {
            System.out.println("没有找到");
        }
    }
}
