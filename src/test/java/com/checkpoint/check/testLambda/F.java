package com.checkpoint.check.testLambda;

/**
 * @Description:
 * @Author: Winston Yang
 * @Date: Create in 12:24 2018/5/17
 * @Modified by:
 */
public class F {

    private static int x=100;
    public static void main(String args[]){
                    F hs1=new F();
                    hs1.x++;
                   F  hs2=new F();
                 hs2.x++;
                hs1=new F();
                 hs1.x++;
                  F.x--;
                   System.out.println("x="+x);
              }

//    public static void main(String[]args){
//        System.out.println(change(14));
//    }

    public static int change(int sub){
        int count=0;
        while (true){
            if(sub<2){
                return count;
            }
            if (sub==2) return ++count;
            count+=sub/3;
            sub=sub%3+sub/3;
        }


    }



}
