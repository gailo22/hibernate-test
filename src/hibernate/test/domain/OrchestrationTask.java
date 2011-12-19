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
public class OrchestrationTask {
    
    private Long id;
    private String name;
    private String description;
    
    private Set<OrchestrationProperty> properties;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<OrchestrationProperty> getProperties() {
        return properties;
    }

    public void setProperties(Set<OrchestrationProperty> properties) {
        this.properties = properties;
    }

    
}
