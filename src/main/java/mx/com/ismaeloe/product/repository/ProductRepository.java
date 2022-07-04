package mx.com.ismaeloe.product.repository;

import mx.com.ismaeloe.product.entity.Category;
import mx.com.ismaeloe.product.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository  extends JpaRepository<Product, Long> {

    public List<Product> findByCategory(Category category);
}
