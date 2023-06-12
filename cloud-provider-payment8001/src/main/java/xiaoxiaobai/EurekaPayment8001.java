package xiaoxiaobai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: hys
 * @createTime: 2023年06月08日 19:52:13
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaPayment8001.class, args);
    }
}
