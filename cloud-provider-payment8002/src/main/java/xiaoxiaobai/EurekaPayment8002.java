package xiaoxiaobai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: hys
 * @createTime: 2023年06月09日 14:07:39
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaPayment8002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPayment8002.class,args);
    }
}
