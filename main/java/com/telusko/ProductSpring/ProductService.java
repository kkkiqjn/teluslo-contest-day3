package com.telusko.ProductSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;

//    public void addProduct(Product p){
////        products.add(p);
//
//        db.save(p);
//
//    }
//
    public List<Product> getAllProducts(){

        return db.findAll();
    }
    
    public Product ggetProductWithText(String text){
        String str=text.toLowerCase();
        return db.findBynameContainingOrtypeContainingOrplaceContaining( str);
    }


    public Product getProduct(String name){
        return db.findByname(name);
    }

    public Product getProductbyPlace(String place){
        return db.findByplace(place);
    }

    public List<Product> getProductsOutofWarranty(){
        return db.findBywarrantyLessThan(2024);
             
     }



  

    
//
//    public Product getProduct(String name){
//        for(Product p : products){
//            if(p.getName().equals(name))
//                return p;
//        }
//
//        return null;
//    }


}
