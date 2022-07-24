package com.demo.dao;

import java.util.List;

import com.demo.beans.Catagory;
import com.demo.beans.Product;

public interface ProductDao {

	List<Product> findAll();

	void save(Product product);

	

	void delById(int pid);

	Product getById(int pid);

	Object updateProduct(Product product);

	List<Catagory> findAllCatagory();

	List<Product> findProductByCatagory(int cid);

	List<Product> findAllSelected(String[] parr);

	void save(Catagory cat);

}
