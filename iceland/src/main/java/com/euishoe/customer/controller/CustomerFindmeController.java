package com.euishoe.customer.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.euishoe.common.controller.Controller;
import com.euishoe.common.controller.ModelAndView;
import com.euishoe.common.factory.XMLObjectFactory;
import com.euishoe.customer.service.CustomerService;
import com.euishoe.customer.service.CustomerServiceImpl;

/**
 * /user/list.mall에 대한 요청 처리 컨트롤러
 * @author 김기정
 *
 */
public class CustomerFindmeController implements Controller {
	
	CustomerService customerService;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException {
		ModelAndView mav = new ModelAndView();
		
		XMLObjectFactory factory = (XMLObjectFactory)request.getServletContext().getAttribute("objectFactory");
		customerService = (CustomerService)factory.getBean(CustomerServiceImpl.class);
		
		mav.setView("/customer/findme/findme.html");
		
		return mav;
	}

}
