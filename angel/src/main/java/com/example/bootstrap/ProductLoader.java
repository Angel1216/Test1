package com.example.bootstrap;

import com.example.domain.Product;
import com.example.repositories.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {
 
    private ProductRepository productRepository;
 
    private Logger log = Logger.getLogger(ProductLoader.class);
 
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
 
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
 
        Product shirt = new Product();
        shirt.setNombre("Angel JPA");
        shirt.setPaterno("Paterno JPA");
        shirt.setMaterno("Materno JPA");
        shirt.setEdad(122);
        productRepository.save(shirt);
 
        log.info("Saved PersistenceJPAExample - id: " + shirt.getEdad());
 
        Product mug = new Product();
        shirt.setNombre("Angel 2 JPA");
        shirt.setPaterno("Paterno 2 JPA");
        shirt.setMaterno("Materno 2 JPA");
        shirt.setEdad(123);
        productRepository.save(mug);
 
        log.info("Saved Mug - id:" + mug.getEdad());
    }
}
