package com.atguigu.ticket.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.ticket.service.TicketService;

/**
 * @Author hike97 許せ　サスケ　これで最後だ
 * @Description
 * @create 2019-06-26 14:47
 * @Modified By:
 **/
@Service//dubbo的service
@org.springframework.stereotype.Service
public class TicketServiceImpl implements TicketService {

	@Override
	public String getTicket () {
		return "Naruto Shippuden";
	}
}
