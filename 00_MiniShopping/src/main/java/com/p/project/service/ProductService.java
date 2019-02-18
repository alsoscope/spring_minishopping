package com.p.project.service;

import java.util.List;

import com.p.project.DTO_VO.ProductDTO_VO;

public interface ProductService {

	//1. ��ǰ ���
	public List<ProductDTO_VO> listProduct();
	
	//2. ��ǰ ��
	public ProductDTO_VO detailProduct(int product_id);
	
	//3. ��ǰ ����
	public void updateProduct(ProductDTO_VO vo);
	
	//4. ��ǰ ����
	public void deleteProduct(ProductDTO_VO vo);
}
