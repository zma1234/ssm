package com.zma.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



/**
 * 
 * TODO 
 * @describe: TODO
 * @project: ssm
 * @author: zma
 * @datetime: 2017年8月2日 下午2:30:24
 * @copyright: zhouma.com
 * @version: V2.0
 */
@Component("taskJob")
public class TaskJob {
	
	/**
	 *  CRON表达式    含义 
		"0 0 12 * * ?"    每天中午十二点触发 
		"0 15 10 ? * *"    每天早上10：15触发 
		"0 15 10 * * ?"    每天早上10：15触发 
		"0 15 10 * * ? *"    每天早上10：15触发 
		"0 15 10 * * ? 2005"    2005年的每天早上10：15触发 
		"0 * 14 * * ?"    每天从下午2点开始到2点59分每分钟一次触发 
		"0 0/5 14 * * ?"    每天从下午2点开始到2：55分结束每5分钟一次触发 
		"0 0/5 14,18 * * ?"    每天的下午2点至2：55和6点至6点55分两个时间段内每5分钟一次触发 
		"0 0-5 14 * * ?"    每天14:00至14:05每分钟一次触发 
		"0 10,44 14 ? 3 WED"    三月的每周三的14：10和14：44触发 
		"0 15 10 ? * MON-FRI"    每个周一、周二、周三、周四、周五的10：15触发 
	 */
	@Scheduled(cron="0/3 * * * * ?")
	public void runJob1(){
		System.out.println("job1执行中");
	}
	@Scheduled(cron="0/3 * * * * ?")
	public void runJob2(){
		System.out.println("job2执行中");
	}

}