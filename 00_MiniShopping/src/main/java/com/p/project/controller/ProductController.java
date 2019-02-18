package com.p.project.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p.project.DTO_VO.ProductDTO_VO;
import com.p.project.service.ProductService;

//��ǰ ���� ������ ����
@Controller
@RequestMapping("/shop/product/*")
public class ProductController {
	
	private static final Logger logger=LoggerFactory.getLogger(ProductController.class);
	
	@Inject
	ProductService productService;
	
	//1. ��ǰ ��ü ��� ������ ����. service���� ������ ����Ʈ ��ü ����
	@RequestMapping(value="list", method=RequestMethod.GET)
	public String listProduct(Model model) {
		List<ProductDTO_VO> list=productService.listProduct();
		model.addAttribute("list", list);
		System.out.println("list.toString()");
		return "productList";
	}
	
	//2. ��ǰ �󼼺��� ������ ����. �ϳ��� URL�� �ϳ��� ������ ���ҽ��� ��ǥ(Rest)�� �� �ֵ��� ó��
	//@ResponseBody
	@RequestMapping("/detail/{product_id}")
	public String detailProduct(Model model, @PathVariable("product_id")int product_id) {
		model.addAttribute("vo", productService.detailProduct(product_id));
		logger.info("Ŭ���� product_id : " + product_id);
		
		return "productDetail";
	}
	
	
}//ProductController
