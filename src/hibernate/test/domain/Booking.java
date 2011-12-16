/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.test.domain;

import java.util.Set;

/**
 *
 * @author User
 */
public class Booking {
    
    private Long id;
    private String name;
    
    private Set<Product> products;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
