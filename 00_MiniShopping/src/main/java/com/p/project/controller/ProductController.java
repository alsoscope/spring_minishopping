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

//상품 관련 페이지 매핑
@Controller
@RequestMapping("/shop/product/*")
public class ProductController {
	
	private static final Logger logger=LoggerFactory.getLogger(ProductController.class);
	
	@Inject
	ProductService productService;
	
	//1. 상품 전체 목록 페이지 매핑. service에서 가져온 리스트 객체 리턴
	@RequestMapping(value="list", method=RequestMethod.GET)
	public String listProduct(Model model) {
		List<ProductDTO_VO> list=productService.listProduct();
		model.addAttribute("list", list);
		System.out.println("list.toString()");
		return "productList";
	}
	
	//2. 상품 상세보기 페이지 매핑. 하나의 URL이 하나의 고유한 리소스를 대표(Rest)할 수 있도록 처리
	//@ResponseBody
	@RequestMapping("/detail/{product_id}")
	public String detailProduct(Model model, @PathVariable("product_id")int product_id) {
		model.addAttribute("vo", productService.detailProduct(product_id));
		logger.info("클릭한 product_id : " + product_id);
		
		return "productDetail";
	}
	
	
}//ProductController
