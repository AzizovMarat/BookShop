package ru.books.shop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.books.shop.entity.ProductType;

@Repository
public interface ProductTypeRepository extends CrudRepository<ProductType, Long> {

}
