package hibernate.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue
	private Long id;
	private String line1;

	public Address() {}

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Address(final String string) {
		this.line1 = string;
	}

	public String getLine1() {
		return this.line1;
	}

	public void setLine1(final String line1) {
		this.line1 = line1;
	}

}
