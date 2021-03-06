package com.p.project.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.p.project.DTO_VO.ProductDTO_VO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Inject
	SqlSession sqlSession;
	
	// 01. 상품 목록 : 전체 상품 목록을 select 조회한 결과를 리턴
	@Override
	public List<ProductDTO_VO> listProduct() {
		return sqlSession.selectList("product.listProduct");
	}

	//02. 상품 상세 : 상품 상세 정보를 select조회한 결과를 리턴
	@Override
	public ProductDTO_VO detailProduct(int product_id) {
		return sqlSession.selectOne("product.detailProduct", product_id);
	}

	//03. 상품 수정
	@Override
	public void updateProduct(ProductDTO_VO vo) {
	}

	//04. 상품 삭제
	@Override
	public void deleteProduct(int Product_id) {
	}

	//5. 상품 추가
	@Override
	public void insertProduct(ProductDTO_VO vo) {
		sqlSession.insert("product.insertProduct", vo);
	}

	//6. 상품 이미지 삭제 위한 이미지 파일 정보
	@Override
	public String fileInfo(int product_id) {
		return sqlSession.selectOne("product.fileInfo", product_id);
	}

}
