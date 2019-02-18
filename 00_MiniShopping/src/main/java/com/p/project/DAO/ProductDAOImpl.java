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
	
	// 01. ��ǰ ��� : ��ü ��ǰ ����� select ��ȸ�� ����� ����
	@Override
	public List<ProductDTO_VO> listProduct() {
		return sqlSession.selectList("product.listProduct");
	}

	//02. ��ǰ �� : ��ǰ �� ������ select��ȸ�� ����� ����
	@Override
	public ProductDTO_VO detailProduct(int product_id) {
		return sqlSession.selectOne("product.detailProduct", product_id);
	}

	//03. ��ǰ ����
	@Override
	public void updateProduct(ProductDTO_VO vo) {
	}

	//04. ��ǰ ����
	@Override
	public void deleteProduct(int Product_id) {
	}

}