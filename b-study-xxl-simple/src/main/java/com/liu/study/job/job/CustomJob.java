package com.liu.study.job.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @desc 
 * @author Liuweian
 * @createTime 2020/7/21 20:55
 * @version 1.0.0
 */
@Component
public class CustomJob {

    @XxlJob("testHandler")
    public ReturnT<String> testHandler(String param) throws Exception {
        System.out.println("###################################");
        return ReturnT.SUCCESS;
    }

}
