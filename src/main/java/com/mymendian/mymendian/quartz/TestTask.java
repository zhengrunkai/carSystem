package com.mymendian.mymendian.quartz;

import com.mymendian.mymendian.service.SendJunkMailService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configurable
@EnableScheduling
public class TestTask {
    private  static  final Logger logger= LogManager.getLogger(TestTask.class);

    @Autowired
    SendJunkMailService sendJunkMailService;
    @Scheduled(cron="0 0 23 * * ? ")
    public void reportCurrentByCron(){
        logger.info("定时器运行了！！！");
        sendJunkMailService.sendJunkMail("1256311705@qq.com","17软件2班1714080902221郑润楷","正常运行");
    }
}