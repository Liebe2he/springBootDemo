package com.example.demo;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitTestJava8 {


    @Test
    public void testStream(){
        List<Integer> nums = Lists.newArrayList(1,1,null,2,3,4,null,5,6,7,8,9,10);
        System.out.println("求和："+nums
                .stream()//转成Stream
                .filter(team -> team!=null)//过滤
                .distinct()//去重
                .mapToInt(num -> num*2)//map操作
                .skip(2)//跳过前2个元素
                .limit(4)//限制取前4个元素
                .peek(System.out::println)//流式处理对象函数
                .sum());//
    }

}
