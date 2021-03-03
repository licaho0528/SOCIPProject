package cn.ekgc.socip;

import org.hibernate.validator.internal.constraintvalidators.bv.number.bound.AbstractMinValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName <b>智慧公务车信息平台-系统功能 Consumer 启动类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 23:19
 * @Version 1.0
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class SocipSystemConsumerStarter {
	public static void main(String[] args) {
		SpringApplication.run(SocipSystemConsumerStarter.class,args);
	}
}
