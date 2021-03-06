package com.p.project.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.p.project.DTO_VO.CartDTO_VO;

public interface CartService {
	
	//1. 장바구니 추가
	public void insertCart(CartDTO_VO vo);
	
	//2. 장바구니 수정
	public List<CartDTO_VO> selectCart(String user_id);

	//3. 장바구니 수정
	public void updateCart(CartDTO_VO vo);
	
	//4. 상품 삭제
	public void deleteCart(int cart_id);

	//5. 장바구니 금액 합계. 상품 전체 금액 select조회한 결과 리턴
	public int sumMoney(String user_id);
	
	//6. 장바구니 동일한 상품 확인
	public int countCart(int product_id, String user_id);

	//7. 장바구니 수량 수정
	public void updateCartNum(CartDTO_VO vo);
}
