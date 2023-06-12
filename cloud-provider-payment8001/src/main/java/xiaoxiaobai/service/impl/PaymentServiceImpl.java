package xiaoxiaobai.service.impl;

import org.springframework.stereotype.Service;
import xiaoxiaobai.dao.PaymentDao;
import xiaoxiaobai.entities.Payment;
import xiaoxiaobai.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author: hys
 * @createTime: 2023年06月09日 14:03:48
 * @Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {

        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
