package cn.ekgc.socip;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName <b>智慧公务车信息平台-汽车模块功能 Apply 启动类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-03 18:27
 * @Version 1.0
 */

@MapperScan("cn.ekgc.socip.*.dao")
@SpringBootApplication
@EnableEurekaClient
public class SocipApplyProviderStarter {
	public static void main(String[] args) {
		SpringApplication.run(SocipApplyProviderStarter.class,args);
	}
}
