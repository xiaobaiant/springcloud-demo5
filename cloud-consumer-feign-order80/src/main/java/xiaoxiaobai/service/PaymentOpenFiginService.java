package xiaoxiaobai.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xiaoxiaobai.entities.Payment;


@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentOpenFiginService {
    @GetMapping(value = "/payment/get/{id}")
    xiaoxiaobai.common.CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
