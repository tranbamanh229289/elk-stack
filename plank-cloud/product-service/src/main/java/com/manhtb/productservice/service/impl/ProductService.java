package com.manhtb.productservice.service.impl;

import com.manhtb.productservice.dto.ProductDto;
import com.manhtb.productservice.model.Product;
import com.manhtb.productservice.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Override
    public ProductDto get(String id) {
        return null;
    }

    @Override
    public List<ProductDto> getAll() {
        return null;
    }

    @Override
    public ProductDto create(ProductDto productDto) {
        return null;
    }


    @Override
    public void delete(String id) {

    }
}
