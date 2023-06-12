package xiaoxiaobai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: hys
 * @createTime: 2023年06月09日 14:25:37
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients     //使用openFegin激活并开启
public class OrderFeginMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeginMain80.class,args);
    }
}
