package cn.ekgc.socip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName <b>智慧公务用车-注册中心启动类</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-02 17:52
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class SocipRegistryCenterStarter {
	public static void main(String[] args) {
		SpringApplication.run(SocipRegistryCenterStarter.class,args);
	}
}
