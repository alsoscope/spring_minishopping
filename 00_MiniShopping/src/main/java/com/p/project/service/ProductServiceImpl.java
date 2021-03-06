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
	
	//1. 상품 목록 : listProduct() 상품관련 ProductDAO의 목록 메서드 호출
	@Override
	public List<ProductDTO_VO> listProduct() {
		return productDao.listProduct();
	}

	//2. 상품 상세 : detailProduct(int product_id) 상품관련 ProductDAO의 상세보기 메서드 호출
	@Override
	public ProductDTO_VO detailProduct(int product_id) {
		return productDao.detailProduct(product_id);
	}
	
	//3. 상품 수정
	@Override
	public void updateProduct(ProductDTO_VO vo) {
	}

	//4. 상품 삭제
	@Override
	public void deleteProduct(int product_id) {
	}

	//5. 상품 등록
	@Override
	public void insertProduct(ProductDTO_VO vo) {
		productDao.insertProduct(vo);
	}

	//6. 상품 이미지 삭제 위한 이미지 파일 정보
	@Override
	public String fileInfo(int product_id) {
		return productDao.fileInfo(product_id);
	}

}
