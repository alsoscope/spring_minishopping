package com.p.project.DAO;

import java.util.List;

import com.p.project.DTO_VO.CartDTO_VO;

public interface CartDAO {
	//1.��ٱ��� �߰�
	public void insertCart(CartDTO_VO vo);
	
	//2.��ٱ��� ���. select��ȸ�� ��� ����
	public List<CartDTO_VO> selectCart(String user_id);
	
	//3.��ٱ��� ����. ��ǰ����update
	public void updateCart(CartDTO_VO vo); 
	
	//4.��ٱ��� ����
	public void deleteCart(int cart_id);

	//5. ��ٱ��� �ݾ� �հ�. ��ٱ��� ��ǰ ��ü �ݾ� select��ȸ�� ��� ����
	public int sumMoney(String user_id);
	
	//6. ��ٱ��� ������ ��ǰ ���ڵ� Ȯ��. ������ ��ǰ �ִµ� select��ȸ�� ��� ����
	public int countCart(int product_id, String user_id);
	
	//7. ��ٱ��� ��ǰ���� ����. ������ ��ǰ�� ��� ���� �ջ��Ͽ� update
	public void updateCartNum(CartDTO_VO vo);
}