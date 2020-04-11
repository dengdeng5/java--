package com.mk.java.suanfa;

/**
 * A最多出现不能大于2次，L不能连续出现大于三次
 */
class Solution {

    public static void main(String[] args) {
        boolean aAA = checkRecord("LLAAL");
        System.out.println(aAA);
    }
    /**
     * 1、转换为数组来判断
     * 2、直接用字符串比较
     * @param s
     * @return
     */
    static boolean checkRecord(String s) {
       /* //用数组来判断
         int countA = 0, countL = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'A'){
                if(++countA == 2) return false;
                countL = 0;
            }else if(ch == 'L'){
                if(++countL == 3) return false;
            }else{
                countL = 0;
            }
        }
        return true;
    }*/
        //2、用字符串判断
        /**
         * 先获取A第一次出现的位置 indexof
         * 让后从A第一次出现的位置开始查，看还有没有A   A的判断完成（不大于两个）
         *
         * 判断L  连续出现三次   获取出现的位置，如果再出现
         *
         */
       return s.indexOf('A') == s.lastIndexOf('A') && !s.contains("LLL");
    }
}
