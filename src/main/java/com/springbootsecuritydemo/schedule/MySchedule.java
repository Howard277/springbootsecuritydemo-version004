package com.springbootsecuritydemo.schedule;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MySchedule {
	//corn中是秒 分 小时 日 月 年
	//@Scheduled(cron="0/5 * * * * *")
	public void clock() {
		System.out.println(new Date());
	}
}
