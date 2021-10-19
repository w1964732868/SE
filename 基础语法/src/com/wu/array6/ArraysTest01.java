package com.wu.array6;

/**
 * @author huijie.wu
 * @version 1.0.0
 * @date 2021/10/9
 * @description 数组的声明 创建 java内存分析(堆、栈、方法区)   增强型for循环
 * @copyright COPYRIGHT © 2014 - 2021 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 **/
public class ArraysTest01 {
    public static void main(String[] args) {//方法区：可以被所有线程共享 包含所有class和static变量
        int[] nums;//数组的声明 在栈里
        nums = new int[10];//数组创建  在堆里：new出来的对象和数组
        //int[] nums = new int[10]//等价于 这个动态初始化

        //给数组赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;
        System.out.println("==========普通for循环===========");//能知道下标 nums[i]才是数组的值

        //求和
        int num = 0;//栈：基本数据类型的变量包含具体值、引用对象的变量 (会存放这个引用在堆里面的具体地址)
        for (int i = 0; i < nums.length; i++) {
            num += nums[i];//数据求和
        }
        System.out.println("数组的总和：" + num);//数组的总和：55

        //找最大值
        int max = nums[0];//栈
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("max = " + max);//max = 10

        System.out.println("===========增强型for循环==========");
        int num1 = 0;
        for (int i : nums) {//i直接是数组里的值
            num1 += i;
        }
        System.out.println("数组的总和：" + num1);//数组的总和：55

        int max1 = 0;
        for (int i : nums) {//int i 代表数组里面每个元素  没有下标
            if (i > max1) {
                max1 = i;
            }
        }
        System.out.println("max1 = " + max1);//max1 = 10

        System.out.println("===========打印==========");
        printNums(nums);
        System.out.println();
        System.out.println("===========反转==========");
        int[] reverse = reverse(nums);
        printNums(reverse);
        System.out.println();
    }

    /**
     * 打印数组
     *
     * @param nums 入参为数组
     */
    public static void printNums(int[] nums) {
        for (int array : nums) {
            System.out.print(array + " ");
        }
        System.out.println();
        System.out.println("=====================");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    /**
     * 返回数组
     *
     * @param nums
     * @return 数组
     */
    public static int[] reverse(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            result[j] = nums[i];
        }

        return result;
    }

}
