package ru.books.shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.books.shop.entity.Product;
import ru.books.shop.entity.ProductType;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    public List<Product> findByProductType(ProductType productType);

}
