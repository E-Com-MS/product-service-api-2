package com.devops.product_service_api_2.service;

import com.devops.product_service_api_2.dto.request.RequestProductDto;
import com.devops.product_service_api_2.dto.response.ResponseProductDto;
import com.devops.product_service_api_2.dto.response.paginate.ResponseProductPaginateDto;

public interface ProductService {
    public void create(RequestProductDto requestProductDto);
    public void update(RequestProductDto requestProductDto,String id);
    public void delete(String id);
    public ResponseProductDto findById(String id);
    public ResponseProductPaginateDto findAll(String searchText, int page, int size);
}
