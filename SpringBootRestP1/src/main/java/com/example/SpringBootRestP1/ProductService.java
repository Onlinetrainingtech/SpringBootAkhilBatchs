package com.example.SpringBootRestP1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product>product=new ArrayList<>();
		product.add(new Product(1001,"mobile1","mobile4",1000.00,6));
		product.add(new Product(1002,"mobile2","mobile4",1000.00,5));
		product.add(new Product(1003,"mobile3","mobile4",2000.00,4));
		
		return product;
	}
   
}
