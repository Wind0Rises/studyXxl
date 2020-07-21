package com.liu.study.job.xxl;

import com.xxl.job.core.executor.impl.XxlJobSpringExecutor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 1、首先引入xxl核心包:xxl-core。
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
        System.out.println(adminAddresses);
        System.out.println(port);
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
