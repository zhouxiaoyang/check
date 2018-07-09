package com.checkpoint.check.testLambda;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Description:
 * @Author: Winston Yang
 * @Date: Create in 14:50 2018/4/26
 * @Modified by:
 */
public class TestLambda {
    @Test
    public  void test(){

       String a= testLambda((String s)-> { int sa= s.length();  return  sa++;},"test");
       System.out.println(a);
       // new Thread(() -> System.out.println("sssss"));

    }

    private String  testLambda(LambdaInterface<String> lambdaInterface,String str){
        return lambdaInterface.testLambda("sss")+str;
    }

    @Test
    public  void testCompare(){
        List<Integer> list= Lists.newArrayList(1,2,3,4,5,67,8);

       // Collections.sort(list,(Integer x)-> );
        Collections.sort(list, (Comparator<Integer>) (o1, o2) -> o2-o1);
        //Collections.sort(list,( Comparator<Integer>) ( o1, o2) ->o1-o2);
        System.out.println(list);

    }
}
