package com.product.service.config.quartz;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class QuartzJobConfiguration {

//    @Bean
//    public JobDetail printRandomJobDetail() {
//        return JobBuilder
//                .newJob(DemoQuartzJob.class)
//                .withIdentity(JobKey.jobKey("sendMessage"))
//                .storeDurably()
//                .build();
//    }
//
//    @Bean
//    public Trigger printRandomJobTrigger() {
//        return TriggerBuilder
//                .newTrigger()
//                .forJob(printRandomJobDetail())
//                .withIdentity(TriggerKey.triggerKey("sendMessage"))
//                .withSchedule(CronScheduleBuilder.cronSchedule("*/5 * * * * ?"))
//                .build();
//    }
}
