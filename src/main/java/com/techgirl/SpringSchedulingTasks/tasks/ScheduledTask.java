package com.techgirl.SpringSchedulingTasks.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTask.class);

    @Scheduled(fixedRate = 5000)
    public void performTask(){
        logger.info("Scheduled task executed at {}", System.currentTimeMillis());
    }

    @Scheduled(cron = "0 0/1 * * * ?") //second minute hour day-of-month month day-of-week
    public void performTaskUsingCron(){
        logger.info("Scheduled task using cron executed at {}", System.currentTimeMillis());
    }
}
