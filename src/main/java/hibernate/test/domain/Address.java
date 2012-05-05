/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.test.domain;

/**
 *
 * @author User
 */
public class Address {
    
    private Long id;
    private String line1;
    
    public Address() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address(String string) {
        line1 = string;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }
    
}
