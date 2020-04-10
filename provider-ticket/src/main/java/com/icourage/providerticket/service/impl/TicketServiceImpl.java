package com.icourage.providerticket.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.icourage.providerticket.service.TicketService;
import org.springframework.stereotype.Component;

/**
 * @author jy
 */
@Service
@Component
public class TicketServiceImpl implements TicketService {

    /**
     * sale movie ticket
     *
     * @return a movie name
     */
    @Override
    public String saleTicket() {
        return "《avatar》";
    }
}
