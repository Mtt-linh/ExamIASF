package com.example.SpringCRUDUpdate.model;
import com.example.SpringCRUDUpdate.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
public interface ProductModel  extends  PagingAndSortingRepository<Product,Integer> {
    Page<Product> findProductsByPrice(int price, Pageable pageable);

    Page<Product> findProductsByStatus(int status, Pageable pageable);

    Page<Product> findByName(String name, Pageable pageable);

}
