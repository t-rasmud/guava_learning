package com.yuraph.learning;

import com.google.common.base.Optional;

/**
 * Created by yuraph on 2017/10/15.
 */
public class TestOptional {

    public static void main(String[] args) {
        //测试optional的使用 Optinal.of方法的使用
        Optional<Integer> optional = Optional.of(12);
        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        //test optinal absent
        optional = Optional.absent();
        System.out.println(optional.isPresent());

        optional.or(12);
        optional.orNull();
        optional.fromNullable(null);
        System.out.print(optional.isPresent());


    }
}
