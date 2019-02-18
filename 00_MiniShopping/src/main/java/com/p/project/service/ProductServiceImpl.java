package com.p.project.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.p.project.DAO.ProductDAO;
import com.p.project.DTO_VO.ProductDTO_VO;

@Service
public class ProductServiceImpl implements ProductService{

	@Inject
	ProductDAO productDao;
	
	//1. ��ǰ ��� : listProduct() ��ǰ���� ProductDAO�� ��� �޼��� ȣ��
	@Override
	public List<ProductDTO_VO> listProduct() {
		return productDao.listProduct();
	}

	//2. ��ǰ �� : detailProduct(int product_id) ��ǰ���� ProductDAO�� �󼼺��� �޼��� ȣ��
	@Override
	public ProductDTO_VO detailProduct(int product_id) {
		return productDao.detailProduct(product_id);
	}
	
	//3. ��ǰ ����
	@Override
	public void updateProduct(ProductDTO_VO vo) {
	}

	//4. ��ǰ ����
	@Override
	public void deleteProduct(ProductDTO_VO vo) {
	}

}
