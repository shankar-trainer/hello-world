package org.com.controller;

import java.util.List;
import java.util.Optional;

import org.com.dao.ProductRepositories;
import org.com.error.RecordNotFoundException;
import org.com.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prd")
//@CrossOrigin("http://localhost:4200")
public class ProductController {

@Autowired
ProductRepositories dao;

@RequestMapping("/allProduct")
public List<Product> getAllProduct(){
return dao.findAll();
}

@RequestMapping("/searchProduct1/{id}")
@ExceptionHandler(RecordNotFoundException.class)
public ResponseEntity<?> findProduct1(@PathVariable("id") int pid) {
Optional<Product> findById=dao.findById(pid);
try {
if(findById.isPresent()) {
Product product=findById.get();
return new ResponseEntity<Product>(product,HttpStatus.OK);
}
else
throw new RecordNotFoundException("Record not found");
}
catch(RecordNotFoundException e) {
return new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
}
}

@RequestMapping("/searchProduct/{id}")
public Product findProduct(@PathVariable("id") int pid) {
Optional<Product> findById=dao.findById(pid);
if(findById.isPresent())
return findById.get();

return null;
}

@PostMapping("/addProduct")
public String saveProduct(@RequestBody Product prd) {
Optional<Product> findById=dao.findById(prd.getPrdId());
if(!findById.isPresent()) {
dao.save(prd);
return "product added";
}

return "product already exists";
}

@PostMapping("/addProduct2")
@ExceptionHandler(RecordNotFoundException.class)
public ResponseEntity<Product> saveProduct2(@RequestBody Product prd) {
Optional<Product> findById=dao.findById(prd.getPrdId());
try{
if(!findById.isPresent()) {
dao.save(prd);
return new ResponseEntity<Product>(prd, HttpStatus.OK);
}
else
throw new RecordNotFoundException("Record already present...");
}
catch(RecordNotFoundException e){
return new ResponseEntity<Product>(prd, HttpStatus.NOT_FOUND);
}
}

@DeleteMapping("/deleteProduct/{id}")
public String removeProduct(@PathVariable("id") int pid) {
Optional<Product> findById=dao.findById(pid);
if(findById.isPresent()) {
dao.deleteById(pid);
return "product removed";
}

return "product not present";
}

@PutMapping("/updateProduct")
public String updateProduct(@RequestBody Product product) {
Optional<Product> findById=dao.findById(product.getPrdId());
if(findById.isPresent()) {
dao.save(product);
return "product updated";
}

return "product not present";
}

@RequestMapping("/totalProducts")
public String totalProducts(){
return "total products: "+dao.count();
}

@RequestMapping("/averageCost")
public String getAvgCost(){
return "average cost: "+dao.getAvgCost();
}

}