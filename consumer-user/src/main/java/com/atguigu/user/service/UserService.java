package com.atguigu.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @Author hike97 許せ　サスケ　これで最後だ
 * @Description
 * @create 2019-06-26 15:21
 * @Modified By:
 **/
@Service
public class UserService {

	@Reference
	TicketService ticketService;

	public  void hello(){
		String ticket = ticketService.getTicket ();
		System.out.println ("买到票了:" + ticket);
	}
}
