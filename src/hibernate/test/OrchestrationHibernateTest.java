/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.test;

import hibernate.test.domain.OrchestrationProperty;
import hibernate.test.domain.OrchestrationTask;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;

/**
 *
 * @author User
 */
public class OrchestrationHibernateTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        OrchestrationTask task = new OrchestrationTask();
        task.setName("Task1");
        task.setDescription("Task description");
        
        Set<OrchestrationProperty> properties = new HashSet<OrchestrationProperty>();
        properties.add(new OrchestrationProperty("doi", "delete-article"));
        properties.add(new OrchestrationProperty("prop", "delete-article-123"));
        
        task.setProperties(properties);
        
        session.save(task);

        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();
    }


}