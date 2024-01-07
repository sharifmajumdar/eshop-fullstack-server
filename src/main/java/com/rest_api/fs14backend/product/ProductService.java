package com.rest_api.fs14backend.product;

import com.rest_api.fs14backend.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(UUID id) {
        return productRepository.findById(id).orElse(null);
    }

    public void deleteById(UUID id) {
        productRepository.deleteById(id);
    }

    public Product createOne(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(UUID id, Product updatedProduct) {
        // Check if the product exists
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Product not found"));

        // Perform any necessary validation or business logic

        // Update the product with the updated details
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setDescription(updatedProduct.getDescription());
        existingProduct.setCategories(updatedProduct.getCategories());
        existingProduct.setVariants(updatedProduct.getVariants());
        existingProduct.setQuantity(updatedProduct.getQuantity());
        existingProduct.setSizes(updatedProduct.getSizes());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setImage(updatedProduct.getImage());
        existingProduct.setImageAlt(updatedProduct.getImageAlt());

        // Save the updated product using the repository
        Product updatedProduct1 = productRepository.save(existingProduct);

        return updatedProduct1;
    }

}
