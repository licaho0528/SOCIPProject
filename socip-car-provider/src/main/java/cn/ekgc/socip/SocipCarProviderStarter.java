package cn.ekgc.socip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName <b>智慧公务车信息平台-汽车模块功能 Provide 启动类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-03 18:00
 * @Version 1.0
 */
@MapperScan("cn.ekgc.socip.*.dao")
@SpringBootApplication
@EnableEurekaClient
public class SocipCarProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(SocipCarProviderStarter.class,args);
	}
}
