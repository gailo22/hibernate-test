package hibernate.test.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public abstract class AbstractHibernateDao<T extends Serializable> {

	private Class<T> clazz;

	//@Autowired
	private SessionFactory sessionFactory;

	public final void setClazz(final Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public T findOne(final long id) {
		return (T) getCurrentSession().get(this.clazz, id);
	}

	public List<T> findAll() {
		return getCurrentSession().createQuery("from " + this.clazz.getName()).list();
	}

	public void create(final T entity) {
		getCurrentSession().persist(entity);
	}

	public void update(final T entity) {
		getCurrentSession().merge(entity);
	}

	public void delete(final T entity) {
		getCurrentSession().delete(entity);
	}

	public void deleteById(final long entityId) {
		final T entity = findOne(entityId);
		delete(entity);
	}

	protected final Session getCurrentSession() {
		return this.sessionFactory.getCurrentSession();
	}
}
