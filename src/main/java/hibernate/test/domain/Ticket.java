package hibernate.test.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TICKET")
public class Ticket extends Product {

	private String airport;

	public String getAirport() {
		return this.airport;
	}

	public void setAirport(final String airport) {
		this.airport = airport;
	}



}
