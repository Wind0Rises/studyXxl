package com.liu.study.job.job;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * CustomJob的子任务。
 *
 * @author lwa
 * @version 1.0.0
 * @createTime 2020/8/3 15:31
 */
@Component
public class CustomJobChild {

    @XxlJob("customJobChild")
    public ReturnT<String> customJobChild(String param) {
        System.out.println("============= This is custom Job Child ===============");
        return ReturnT.SUCCESS;
    }

}