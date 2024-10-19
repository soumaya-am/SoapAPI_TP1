package com.soap.soap_server;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.Date;
import java.util.List;
@WebService(serviceName ="ProductWS")
public class ProductWebService {
  private ProductRepository productRepository;

    @WebMethod(operationName = "sellingPrice")
    public Double sellingPrice(@WebParam(name = "Price") Long code){
        Product product = productRepository.findProductByCode(code);
        return product.getPrice()*1.5;
    }
    @WebMethod(operationName = "getProduct")
    public Product getProduct(@WebParam(name = "code") Long code){
        return productRepository.findProductByCode(code);

    }
    @WebMethod(operationName = "productList")
    public List<Product> productList(){
        return productRepository.findAll();

    }

    @WebMethod(operationName = "addProduct")
    public Product addProduct(String name,Double price){
           Product product=new Product();
           product.setName(name);
           product.setPrice(price);
           product.setDateCreation(new Date());
        productRepository.save(product);
        return  product ;
    }

    @WebMethod(operationName = "updateProduct")
    public Product updateProduct(Long code ,String name, Double price){
        Product product =productRepository.findProductByCode(code);
        product.setName(name);
        product.setPrice(price);
      return productRepository.save(product);
    }

    @WebMethod(operationName = "deleteProduct")
    public void deleteProduct(@WebParam Long code){
        productRepository.deleteProductByCode(code);
    }
}
