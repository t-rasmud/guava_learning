package com.yuraph.learning;

import com.google.common.base.Preconditions;

/**
 * Created by yuraph on 2017/10/15.
 */
public class TestPreconditions {

    public  static void main(String[] args) {
        Preconditions.checkArgument('a' > 'b');
        Preconditions.checkNotNull(12, "测试空指针异常");
        Preconditions.checkNotNull(12);
        Preconditions.checkState(true);

    }
}
