package com.manhtb.productservice.service;

import com.manhtb.productservice.dto.ProductDto;

import java.util.List;

public interface IProductService {
    public ProductDto get(String id);
    public List<ProductDto> getAll();
    public ProductDto create(ProductDto productDto);
    public void delete(String id);
}
