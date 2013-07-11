package hibernate.test;

import hibernate.test.domain.Address;
import hibernate.test.domain.Person;
import hibernate.test.domain.Product;
import hibernate.test.domain.Ticket;
import hibernate.test.domain.Visa;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;


public class HibernateTest {

	public static void main(final String[] args) {

		final Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		final Person person = new Person();
		person.setName("Montree");
		person.setLastName("BUngnasang");        

		final Set<Address> addresses = new HashSet<Address>();
		addresses.add(new Address("line1"));
		addresses.add(new Address("line2"));
		person.setAddresses(addresses);

		session.save(person);

		Product prod = new Visa();
		prod.setName("Visa");
		prod.setDescription("Visa Desc");

		session.save(prod);

		prod = new Ticket();
		prod.setName("Ticket");
		prod.setDescription("Ticket Desc");

		session.save(prod);

		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}


}
