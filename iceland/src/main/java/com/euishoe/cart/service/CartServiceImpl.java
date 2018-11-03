package com.euishoe.cart.service;
/**
 * 쇼핑몰 장바구니와 관련된  서비스 인터페이스를 기반으로 구현
 * 
 * @author 전상일
 *
 */

import com.euishoe.cart.dao.CartDao;

public class CartServiceImpl implements CartService {
	public CartDao cartDao;

	public CartDao getCartDao() {
		return cartDao;
	}

	public void setCartDao(CartDao cartDao) {
		this.cartDao = cartDao;
	}
}
