package com.demo.service;

import java.util.List;

import com.demo.beans.Catagory;
import com.demo.beans.Product;

public interface ProductService {

	List<Product> getAllProducts();

	void addProduct(Product product);

	void delById(int pid);

	Product editById(int pid);

	void updateProduct(Product product);

	List<Catagory> getAllCatagory();

	List<Product> getProductByCatagory(int cid);

	List<Product> getAllSelected(String[] parr);

	void addCatagory(Catagory cat);
   
}
