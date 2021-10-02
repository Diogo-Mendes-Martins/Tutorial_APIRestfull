package springboot.api.tutorial.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import springboot.api.tutorial.entities.Product; 


@Repository
public interface ProductRepository extends CrudRepository <Product, Long> { }