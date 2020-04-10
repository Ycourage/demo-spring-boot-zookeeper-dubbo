package com.icourage.consumeruser.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.icourage.providerticket.service.TicketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jy
 */
@RestController
public class UserController {

    /**
     * import which interface in file head above, this annotation will refer that interface in dubbo.
     */
    @Reference
    TicketService ticketService;

    @RequestMapping("/buyTicket")
    public String buyTicket(String name) {
        return name + " purchased a ticket " + ticketService.saleTicket();
    }
}
