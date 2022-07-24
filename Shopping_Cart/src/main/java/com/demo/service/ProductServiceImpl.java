package com.demo.service;

import java.util.List;

import com.demo.beans.Catagory;
import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;



public class ProductServiceImpl implements ProductService {
        private ProductDao productDao;

		public ProductServiceImpl() {
			productDao=new ProductDaoImpl();
		}

		@Override
		public List<Product> getAllProducts() {
			return productDao.findAll();
		}

		@Override
		public void addProduct(Product product) {
			productDao.save(product);
		}

		

		@Override
		public void delById(int pid) {
			productDao.delById(pid);
			
		}

		@Override
		public Product editById(int pid) {
			return productDao.getById(pid);
		}

		@Override
		public void updateProduct(Product product) {
			 productDao.updateProduct(product);
			
		}

		@Override
		public List<Catagory> getAllCatagory() {
			return productDao.findAllCatagory();
		}

		

		@Override
		public List<Product> getProductByCatagory(int cid) {
			return productDao.findProductByCatagory(cid);
		}

		@Override
		public List<Product> getAllSelected(String[] parr) {
			return productDao.findAllSelected(parr);
		}

		@Override
		public void addCatagory(Catagory cat) {
			productDao.save(cat);
			
		}
		
	

		

        
}
