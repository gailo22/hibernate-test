package hibernate.test.dao.foo;

import hibernate.test.dao.AbstractHibernateDao;


//@Repository
public class FooDao extends AbstractHibernateDao<Foo> implements IFooDao {

	public FooDao() {
		setClazz(Foo.class);
	}
}