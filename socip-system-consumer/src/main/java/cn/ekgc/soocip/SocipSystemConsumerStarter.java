package cn.ekgc.soocip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName <b> 智慧公务车信息平台-用户模块 Consumer 启动类 </b>
 * @Description
 * @Author Admin
 * @Date 2021-03-03 23:00
 * @Version 1.0
 */
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class SocipSystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(SocipSystemConsumerStarter.class,args);
	}
}
