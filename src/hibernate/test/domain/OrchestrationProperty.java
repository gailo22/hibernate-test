/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.test.domain;

/**
 *
 * @author User
 */
public class OrchestrationProperty {
    
    private Long id;
    private String name;
    private String value;
    
    public OrchestrationProperty() {}
    public OrchestrationProperty(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    
}
