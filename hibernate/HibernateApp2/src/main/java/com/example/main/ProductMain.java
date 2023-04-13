package com.example.main;

import com.example.dao.ProductDao;
import com.example.model.Product;

import java.util.Scanner;

/**
 * Created by shankar on 3/31/2023.
 */
public class ProductMain {
    public static void main(String[] args) {
        String ch="y";

        Scanner scanner=new Scanner(System.in);
        Product product;
        ProductDao productDao=new ProductDao();
        while(ch.equalsIgnoreCase("y")){

            System.out.println("1.add Record");
            System.out.println("2.search Record");
            System.out.println("3.display all Record");
            System.out.println("4.delete the  Record");
            System.out.println("5.update the  Record");

            int operation=scanner.nextInt();

            switch (operation){
                case  1:
                    System.out.println("Enter product name and cost");
                    product=new Product();
                    scanner.nextLine();
                    product.setPrdName(scanner.nextLine());
                    product.setPrdCost(scanner.nextFloat());
                    if(productDao.addProduct(product))
                        System.out.println("product added");
                    else
                        System.out.println("product id already exist");

                    break;
                case  2:
                    System.out.println("Enter product id to search ");
                    product=null;
                    product=productDao.searchProduct(scanner.nextInt());
                   if(product==null)
                       System.out.println("product not found");
                    else {
                       System.out.println("product found");
                       System.out.println(product.getPrdId()+"\t"+product.getPrdName()+"\t"+product.getPrdCost());
                    }
                       break;
                case  3:
                    for (Product p: productDao.getAllProduct()  ) {
                        System.out.println(p.getPrdId()+"\t"+p.getPrdName()+"\t"+p.getPrdCost());
                    }
               break;

                case  4:
                    System.out.println("Enter product id to delete");
                    int prdid=scanner.nextInt();
                    productDao.deleteProduct(prdid);
                    break;

                case  5:
                    System.out.println("Update Operation");
                    System.out.println("Enter product id,  name and cost");
                    product=null;
                    product=new Product();
                    product.setPrdId(scanner.nextInt());
                    scanner.nextLine();
                    product.setPrdName(scanner.nextLine());
                    product.setPrdCost(scanner.nextFloat());
                    System.out.println("product id is "+product.getPrdId());
                    if(productDao.updateProduct(product))
                        System.out.println("product updated");
                    else
                        System.out.println("product id not present");

                    break;
                  default:
                      System.out.println("invalid operation ");

            }

            System.out.println("continue y\\n");
            ch=scanner.next();

        }
    }
}
