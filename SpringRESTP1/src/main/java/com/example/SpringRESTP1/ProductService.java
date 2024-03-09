package com.example.SpringRESTP1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService
{

	@Override
	public List<Product> findAll() {
		
		ArrayList<Product>product=new ArrayList<>();
		product.add(new Product(1001,"m1","e1",1000.00,6));
		product.add(new Product(1002,"m2","e2",2000.00,7));
		product.add(new Product(1003,"m3","e3",1000.00,4));
		product.add(new Product(1004,"m4","e4",2000.00,5));
		
		return product;
	}
   
}
