package com.abc.database;

import com.abc.database.util.DatabaseUtil;
import com.abc.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    Statement st;
    PreparedStatement pst, pst1;
    Connection con;
    ResultSet rs;
    Product product;
    List<Product> plist;
    List<String> col_list;
    ResultSetMetaData metaData;

    public ProductDao() throws SQLException {
        con = DatabaseUtil.myConnection();
        st = con.createStatement();
    }

    public List<String> getColNames() throws SQLException {
        rs = null;
        rs = st.executeQuery("select * from product");
        metaData = rs.getMetaData();
        col_list = null;
        col_list = new ArrayList<>();
        for (int i = 1; i <= metaData.getColumnCount(); i++) {
            col_list.add(metaData.getColumnName(i));
        }
        return col_list;
    }

    public String addProduct(Product p) throws SQLException {
        pst = con.prepareStatement("select * from product where prdid=?");
        pst.setInt(1, p.getPrdId());
        rs = null;
        rs = pst.executeQuery();
        if (rs.next())
            return "Product id already present";
        else {
            pst1 = null;
            pst1 = con
                    .prepareStatement("insert into product values(?,?,?,?,?,?,?)");
            pst1.setInt(1, p.getPrdId());
            pst1.setString(2, p.getCname());
            pst1.setString(3, p.getPrdType());
            pst1.setString(4, p.getPrdColor());
            pst1.setInt(5, p.getQty());
            pst1.setFloat(6, p.getBuyPrice());
            pst1.setFloat(7, p.getSellPrice());

            pst1.executeUpdate();
            return "Product Added";
        }
    }

    public String updateProduct(Product p) throws SQLException {
        pst = con.prepareStatement("select * from product where prdid=?");
        pst.setInt(1, p.getPrdId());
        rs = null;
        rs = pst.executeQuery();
        if (!rs.next())
            return "Product id not present";
        else {
            pst1 = null;
            pst1 = con
                    .prepareStatement("update  product set cname=?, prdtype=?, prdcolor=?,qty=?,buyprice=?,sellprice=? where prdId=?");
            pst1.setInt(7, p.getPrdId());
            pst1.setString(1, p.getCname());
            pst1.setString(2, p.getPrdType());
            pst1.setString(3, p.getPrdColor());
            pst1.setInt(4, p.getQty());
            pst1.setFloat(5, p.getBuyPrice());
            pst1.setFloat(6, p.getSellPrice());

            pst1.executeUpdate();

            return "Product Updated";
        }
    }

    public String deleteProductById(int prdId) throws SQLException {
        pst = con.prepareStatement("select * from product where prdId=?");
        pst.setInt(1, prdId);
        rs = null;
        rs = pst.executeQuery();
        if (!rs.next())
            return "Product id not  present";
        else {
            pst1 = null;
            pst1 = con.prepareStatement("delete from  product  where prdId=?");
            pst1.setInt(1, prdId);
            pst1.executeUpdate();

            return "Product Deleted";
        }
    }
public String deleteProductByQty(int qty) throws SQLException {
        pst = con.prepareStatement("select * from product where qty=?");
        pst.setInt(1, qty);
        rs = null;
        rs = pst.executeQuery();
        if (!rs.next())
            return "Product id not  present";
        else {
            pst1 = null;
            pst1 = con.prepareStatement("delete from  product  where qty=?");
            pst1.setInt(1, qty);
            pst1.executeUpdate();
            return "Product Deleted";
        }
    }

    public String deleteProductByCname(String cname) throws SQLException {
        pst = con.prepareStatement("select * from product where cname=?");
        pst.setString(1, cname);
        rs = null;
        rs = pst.executeQuery();
        if (!rs.next())
            return "Product  not  present";
        else {
            pst1 = null;
            pst1 = con.prepareStatement("delete from  product  where cname=?");
            pst1.setString(1, cname);
            pst1.executeUpdate();

            return "Product Deleted";
        }
    }

    public String deleteProductByProductType(String prdType) throws SQLException {
        pst = con.prepareStatement("select * from product where prdType=?");
        pst.setString(1, prdType);
        rs = null;
        rs = pst.executeQuery();
        if (!rs.next())
            return "Product  not  present";
        else {
            pst1 = null;
            pst1 = con.prepareStatement("delete from  product  where prdType=?");
            pst1.setString(1, prdType);
            pst1.executeUpdate();
            return "Product Deleted";
        }
    }

    public String deleteProductByPrdColor(String prdColor) throws SQLException {
        pst = con.prepareStatement("select * from product where prdColor=?");
        pst.setString(1, prdColor);
        rs = null;
        rs = pst.executeQuery();
        if (!rs.next())
            return "Product not present";
        else {
            pst1 = null;
            pst1 = con.prepareStatement("delete from  product  where prdColor=?");
            pst1.setString(1, prdColor);
            pst1.executeUpdate();

            return "Product Deleted";
        }
    }


    public String deleteProductByBuyPrice(float buyprice) throws SQLException {
        pst = con.prepareStatement("select * from product where buyPrice=?");
        pst.setFloat(1, buyprice);
        rs = null;
        rs = pst.executeQuery();
        if (!rs.next())
            return "Product  not  present";
        else {
            pst1 = null;
            pst1 = con.prepareStatement("delete from  product  where buyPrice=?");
            pst1.setFloat(1, buyprice);
            pst1.executeUpdate();

            return "Product Deleted";
        }
    }

    public String deleteProductBySellPrice(float sellprice) throws SQLException {
        pst = con.prepareStatement("select * from product where sellPrice=?");
        pst.setFloat(1, sellprice);
        rs = null;
        rs = pst.executeQuery();
        if (!rs.next())
            return "Product id not  present";
        else {
            pst1 = null;
            pst1 = con.prepareStatement("delete from  product  where prdId=?");
            pst1.setFloat(1, sellprice);
            pst1.executeUpdate();

            return "Product Deleted";
        }
    }

    public Product searchById(int prdId) throws SQLException {
        pst = con.prepareStatement("select * from product where prdid=?");
        pst.setInt(1, prdId);
        rs = null;
        rs = pst.executeQuery();
        if (rs.next()) {
            product = null;
            product = new Product();
            product.setPrdId(rs.getInt(1));
            product.setCname(rs.getString(2));
            product.setPrdType(rs.getString(3));
            product.setPrdColor(rs.getString(4));
            product.setQty(rs.getInt(5));
            product.setBuyPrice(rs.getFloat(6));
            product.setSellPrice(rs.getFloat(7));

            return product;
        } else {
            return null;
        }
    }

    public List<Product> searchByCname(String cname) throws SQLException {
        pst = con.prepareStatement("select * from product where cname=?");
        pst.setString(1, cname);
        rs = null;
        rs = pst.executeQuery();
        plist = null;
        plist = new ArrayList<>();

        while (rs.next()) {
            product = null;
            product = new Product();
            product.setPrdId(rs.getInt(1));
            product.setCname(rs.getString(2));
            product.setPrdType(rs.getString(3));
            product.setPrdColor(rs.getString(4));
            product.setQty(rs.getInt(5));
            product.setBuyPrice(rs.getFloat(6));
            product.setSellPrice(rs.getFloat(7));
            plist.add(product);
        }
        return plist;
    }


    public List<Product> searchByPrdType(String prdtype) throws SQLException {
        pst = con.prepareStatement("select * from product where prdtype=?");
        pst.setString(1, prdtype);
        rs = null;
        rs = pst.executeQuery();
        plist = null;
        plist = new ArrayList<>();

        while (rs.next()) {
            product = null;
            product = new Product();
            product.setPrdId(rs.getInt(1));
            product.setCname(rs.getString(2));
            product.setPrdType(rs.getString(3));
            product.setPrdColor(rs.getString(4));
            product.setQty(rs.getInt(5));
            product.setBuyPrice(rs.getFloat(6));
            product.setSellPrice(rs.getFloat(7));
            plist.add(product);
        }
        return plist;
    }

    public List<Product> searchByPrdColor(String color) throws SQLException {
        pst = con.prepareStatement("select * from product where prdcolor=?");
        pst.setString(1, color);
        rs = null;
        rs = pst.executeQuery();
        plist = null;
        plist = new ArrayList<>();

        while (rs.next()) {
            product = null;
            product = new Product();
            product.setPrdId(rs.getInt(1));
            product.setCname(rs.getString(2));
            product.setPrdType(rs.getString(3));
            product.setPrdColor(rs.getString(4));
            product.setQty(rs.getInt(5));
            product.setBuyPrice(rs.getFloat(6));
            product.setSellPrice(rs.getFloat(7));
            plist.add(product);
        }
        return plist;
    }

    public List<Product> searchByQty(int qty) throws SQLException {
        pst = con.prepareStatement("select * from product where qty=?");
        pst.setInt(1, qty);
        rs = null;
        rs = pst.executeQuery();
        plist = null;
        plist = new ArrayList<>();

        while (rs.next()) {
            product = null;
            product = new Product();
            product.setPrdId(rs.getInt(1));
            product.setCname(rs.getString(2));
            product.setPrdType(rs.getString(3));
            product.setPrdColor(rs.getString(4));
            product.setQty(rs.getInt(5));
            product.setBuyPrice(rs.getFloat(6));
            product.setSellPrice(rs.getFloat(7));
            plist.add(product);
        }
        return plist;
    }

    public List<Product> searchByBuyPrice(float buyprice) throws SQLException {
        pst = con.prepareStatement("select * from product where buyPrice=?");
        pst.setFloat(1, buyprice);
        rs = null;
        rs = pst.executeQuery();
        plist = null;
        plist = new ArrayList<>();

        while (rs.next()) {
            product = null;
            product = new Product();
            product.setPrdId(rs.getInt(1));
            product.setCname(rs.getString(2));
            product.setPrdType(rs.getString(3));
            product.setPrdColor(rs.getString(4));
            product.setQty(rs.getInt(5));
            product.setBuyPrice(rs.getFloat(6));
            product.setSellPrice(rs.getFloat(7));
            plist.add(product);
        }
        return plist;
    }

    public List<Product> searchBySellPrice(float sellprice) throws SQLException {
        pst = con.prepareStatement("select * from product where sellPrice=?");
        pst.setFloat(1, sellprice);
        rs = null;
        rs = pst.executeQuery();
        plist = null;
        plist = new ArrayList<>();

        while (rs.next()) {
            product = null;
            product = new Product();
            product.setPrdId(rs.getInt(1));
            product.setCname(rs.getString(2));
            product.setPrdType(rs.getString(3));
            product.setPrdColor(rs.getString(4));
            product.setQty(rs.getInt(5));
            product.setBuyPrice(rs.getFloat(6));
            product.setSellPrice(rs.getFloat(7));
            plist.add(product);
        }
        return plist;
    }

    public List<Product> getProductList() throws SQLException {
        rs = null;
        rs = st.executeQuery("select * from product");
        plist = null;
        plist = new ArrayList<>();

        while (rs.next()) {
            product = null;
            product = new Product();
            product.setPrdId(rs.getInt(1));
            product.setCname(rs.getString(2));
            product.setPrdType(rs.getString(3));
            product.setPrdColor(rs.getString(4));
            product.setQty(rs.getInt(5));
            product.setBuyPrice(rs.getFloat(6));
            product.setSellPrice(rs.getFloat(7));
            plist.add(product);
        }
        return plist;
    }
}
