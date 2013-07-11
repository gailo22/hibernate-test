package hibernate.test.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Booking {

	@Id
	@GeneratedValue
	private Long id;
	private String name;

	@ManyToMany
	@JoinTable(name = "BOOK_PROD", joinColumns = @JoinColumn(name = "BOOK_ID"), inverseJoinColumns = @JoinColumn(name = "PROD_ID"))
	private Set<Product> products;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Set<Product> getProducts() {
		return this.products;
	}

	public void setProducts(final Set<Product> products) {
		this.products = products;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
