package com.liu.study.job.xxl;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

/**
 * 1、在xxl-job-admin管理后台添加一个执行器，一个执行器包含：appName,title,address_type(注册方式)、address_list(机器地址)
 * 2、定义Job，并启动，可以参考CustomJob。
 * 3、在xxl-job-admin管理后台添加这个job，一个Job包含：执行器ID，cron表达式、报警邮件、执行器路由策略、任务参数、重试次数、子任务、状态。
 * 4、启动job。
 *
 * JobInfoController.triggerJob()：执行一次
 * 与spring整合入口：XxlJobSpringExecutor，其继承了XxlJobExecutor。
 */

/**
 * JobInfoController：任务管理
 * JobGroupController：执行器管理
 * JobLogController：调度日志管理
 */

/**
 * 1、首先引入xxl核心包:xxl-core。
 * 2、配置
 *
 * @author Liuweian
 * @createTime 2020/7/21 19:40
 * @version 1.0.0
 */
@Configuration
@ConfigurationProperties(prefix = "xxl.simple")
@Data
public class XxlConfig {

    /** */
    private String adminAddresses;

    /** */
    private String accessToken;

    /** */
    private String appname;

    /** */
    private String address;

    /** */
    private String ip;

    /** */
    private int port;

    /** */
    private String logPath;

    /** */
    private int logRetentionDays;

    @Bean
    public XxlJobSpringExecutor xxlJobExecutor() {
        System.out.println(">>>>>>>>>>> xxl-job config init <<<<<<<<<<");
        XxlJobSpringExecutor xxlJobSpringExecutor = new XxlJobSpringExecutor();
        xxlJobSpringExecutor.setAdminAddresses(adminAddresses);
        xxlJobSpringExecutor.setAppname(appname);
        xxlJobSpringExecutor.setAddress(address);
        xxlJobSpringExecutor.setIp(ip);
        xxlJobSpringExecutor.setPort(port);
        xxlJobSpringExecutor.setAccessToken(accessToken);
        xxlJobSpringExecutor.setLogPath(logPath);
        xxlJobSpringExecutor.setLogRetentionDays(logRetentionDays);
        return xxlJobSpringExecutor;
    }
}
