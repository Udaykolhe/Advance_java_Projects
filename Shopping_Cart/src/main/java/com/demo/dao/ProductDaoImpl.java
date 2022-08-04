package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.demo.beans.Catagory;
import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao {
	private static Connection conn;
	private static PreparedStatement pgetAll,paddPoduct,pdelById,pgetById,puptById,pgetallCat,pgetprodByCat,paddCat;
	
	static{
		
		try {
			conn=DBUtil.getMyConnection();
			pgetAll=conn.prepareStatement("SELECT * FROM product");
			paddPoduct=conn.prepareStatement("INSERT INTO product(pname,qty,price) VALUES (?,?,?)");
			pdelById=conn.prepareStatement("DELETE FROM product WHERE pid=?");
			pgetById=conn.prepareStatement("SELECT * FROM product WHERE pid=?");
			puptById=conn.prepareStatement("UPDATE product SET pname=?, qty=?, price=? WHERE pid=?");
			pgetallCat=conn.prepareStatement("SELECT * FROM catagory");
			pgetprodByCat=conn.prepareStatement("SELECT * FROM product WHERE cid=?");
			paddCat=conn.prepareStatement("INSERT INTO CATAGORY(cname) VALUES (?)");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Product> findAll() {
		List<Product> plist = new ArrayList<>();
		try {
			ResultSet rs = pgetAll.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void save(Product product) {
		try {
			paddPoduct.setString(1,product.getPname() );
			paddPoduct.setInt(2,product.getQty());
			paddPoduct.setFloat(3,product.getPrice());
			
			int status=paddPoduct.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	@Override
	public void delById(int pid) {
		try {
			pdelById.setInt(1, pid);
			pdelById.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	@Override
	public Product getById(int pid) {
		try {
			pgetById.setInt(1, pid);
			ResultSet rs = pgetById.executeQuery();
			if(rs.next()) {
				return new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Override
	public Object updateProduct(Product product) {
		try {
			puptById.setString(1, product.getPname());
			puptById.setInt(2,product.getQty());
			puptById.setFloat(3, product.getPrice());
			puptById.setInt(4,product.getPid());
			puptById.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public List<Catagory> findAllCatagory() {
		
		try {
			List<Catagory> clist = new ArrayList<>();
			ResultSet rs=pgetallCat.executeQuery();
			while(rs.next()) {
				clist.add(new Catagory(rs.getInt(1),rs.getString(2)));
			}
			return clist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Product> findProductByCatagory(int cid) {
		List<Product> plist = new ArrayList<>();
		try {
			pgetprodByCat.setInt(1, cid);
			ResultSet rs = pgetprodByCat.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> findAllSelected(String[] parr) {
		List<Product> plist = new ArrayList<>();
		try {
			String s =Stream.of(parr).map(v->"?").collect(Collectors.joining((",")));
			String sql=String.format("SELECT * FROM product WHERE pid IN (%s)",s);
			PreparedStatement pst=conn.prepareStatement(sql);
			//
			int index=1;
			for(String s1 : parr) {
				pst.setInt(index,Integer.parseInt(s1));
				index++;
			}
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void save(Catagory cat) {
		try {
			paddCat.setString(1, cat.getCname());
			paddCat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
