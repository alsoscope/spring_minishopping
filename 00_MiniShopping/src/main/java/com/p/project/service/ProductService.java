package com.p.project.service;

import java.util.List;

import com.p.project.DTO_VO.ProductDTO_VO;

public interface ProductService {

	//1. 상품 목록
	public List<ProductDTO_VO> listProduct();
	
	//2. 상품 상세
	public ProductDTO_VO detailProduct(int product_id);
	
	//3. 상품 수정
	public void updateProduct(ProductDTO_VO vo);
	
	//4. 상품 삭제
	public void deleteProduct(ProductDTO_VO vo);
}
