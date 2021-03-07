package cn.ekgc.socip.transport.driver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName <b>智慧公务车信息平台-驾驶员信息传输层接口</b>
 * @Description
 * @Author Admin
 * @Date 2021-03-04 16:57
 * @Version 1.0
 */
@FeignClient(name = "socip-system-provider")
@RequestMapping("/driver/transport")
public interface DriverTransport {
}
