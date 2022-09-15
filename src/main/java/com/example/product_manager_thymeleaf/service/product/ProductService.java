package com.example.product_manager_thymeleaf.service.product;

import com.example.product_manager_thymeleaf.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
        private static final Map<Integer,Product> listproduct;

        static {
                listproduct= new HashMap<>();
                listproduct.put(1, new Product(1,"banh1",120,"banh keo","BHX"));
                listproduct.put(2, new Product(2,"banh2",130,"banh keo","BHX"));
                listproduct.put(3, new Product(3,"banh3",140,"banh keo","BHX"));
                listproduct.put(4, new Product(4,"banh4",150,"banh keo","BHX"));
        }
        @Override
        public List<Product> findAll() {
                return new ArrayList<>(listproduct.values());
        }

        @Override
        public void save(Product product) {
                listproduct.put(product.getId(),product);
        }

        @Override
        public Product findById(int id) {
                return listproduct.get(id);
        }

        @Override
        public void update(int id, Product product) {
                listproduct.put(id,product);
        }

        @Override
        public void remove(int id) {
                listproduct.remove(id);
        }
}
