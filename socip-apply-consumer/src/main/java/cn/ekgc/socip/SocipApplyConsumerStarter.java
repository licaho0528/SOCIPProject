package cn.ekgc.socip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName <b>智慧公务车信息平台-汽车模块功能 Apply 启动类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-03 18:31
 * @Version 1.0
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SocipApplyConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(SocipApplyConsumerStarter.class,args);
	}
}
