package xiaoxiaobai.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import xiaoxiaobai.entities.Payment;
import xiaoxiaobai.service.PaymentOpenFiginService;

/**
 * @Author: hys
 * @createTime: 2023年06月09日 14:35:30
 * @Description:
 */
@Slf4j
@RestController
public class OrderFeginController {
    @Autowired
    private PaymentOpenFiginService openFiginService;

    @GetMapping("/consumer/payment/get/{id}")
    public xiaoxiaobai.common.CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return openFiginService.getPaymentById(id);
    }

}
