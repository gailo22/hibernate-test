package hibernate.test;

import hibernate.test.domain.OrchestrationProperty;
import hibernate.test.domain.OrchestrationTask;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Example;

public class QueryByExampleTest {

	public static void main(final String[] args) {
		final Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();

		final OrchestrationTask task = new OrchestrationTask();
		task.setName("task1%");

		final Set<OrchestrationProperty> properties = new HashSet<OrchestrationProperty>();
		final OrchestrationProperty property1 = new OrchestrationProperty();
		property1.setName("prop1");
		properties.add(property1);
		final OrchestrationProperty property2 = new OrchestrationProperty();
		property2.setName("prop2");
		properties.add(property2);

		task.setProperties(properties);

		final Criteria criteria = session.createCriteria(task.getClass());
		criteria.add(Example.create(task).enableLike());

		final Set<OrchestrationProperty> properties2 = task.getProperties();
		if (properties2 != null) {
			final Criteria subCriteria = criteria.createCriteria("properties");
			Iterator<OrchestrationProperty> iterator = properties2.iterator();
			while (iterator.hasNext()) {
				final OrchestrationProperty next = iterator.next();
				subCriteria.add(Example.create(next).enableLike());
			}
		}

		final List<OrchestrationTask> list = criteria.list();

		System.out.println("result: " + list);

		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();

	}

}
