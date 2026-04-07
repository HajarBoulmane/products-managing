package net.hajar.products_managing.repository;

import net.hajar.products_managing.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
