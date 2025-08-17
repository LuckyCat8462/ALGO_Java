package Basics_01;

//[ ] arr int

// 有一种数出现了 奇数次，其他数出现了偶数次，如何找出
public class code01_eor {

    public static void printOldTimesNum1(int[] arr){
        int eor =0;
        for (int cur : arr){
            eor ^= cur;
        }
    }
    //有两种数a,b出现了奇数次，其他数other出现了偶数次，如何找出
    public static void printOldTimesNum2(int[] arr){
        int eor =0;
        for (int i=0;i<arr.length;i++){
            eor ^= arr[i];
        }
//        eor = a^b;
//        aor !=0
//        eor必有一个位置是1，因为a与b不同

        int rightOne = eor & (~eor + 1);
        int OnlyOne = 0;//eor'
        for(int cur : arr){
            if((cur & rightOne)==0){
                OnlyOne ^= cur;
            }
        }
        System.out.println(OnlyOne+""+(eor ^ OnlyOne));

    }

    public static void main(String[] args){
        int a =5;
        int b=7;

        a = a ^b;
        b = a ^b;
        a = a ^b;

        System.out.println(a);
        System.out.println(b);

        printOldTimesNum1(new int[]{a,b});
        printOldTimesNum2(new int[]{a,b});
    }

}


