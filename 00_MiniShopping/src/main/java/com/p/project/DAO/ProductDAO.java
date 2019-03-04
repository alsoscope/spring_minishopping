package com.p.project.DAO;

import java.util.List;

import com.p.project.DTO_VO.ProductDTO_VO;

//����Ͻ����� ,DB���� �۾�ó��
public interface ProductDAO {
	//1. ��ǰ���
	public List<ProductDTO_VO> listProduct();
	
	//2.��ǰ ��
	public ProductDTO_VO detailProduct(int product_id);
	
	//3.��ǰ ����
	public void updateProduct(ProductDTO_VO vo);
	
	//4.��ǰ ����
	public void deleteProduct(int Product_id);
	
	//5. ��ǰ�߰�
	public void insertProduct(ProductDTO_VO vo);
	
	//6. ��ǰ �̹��� ���� ���� �̹��� ���� ����
	public String fileInfo(int product_id);
}
