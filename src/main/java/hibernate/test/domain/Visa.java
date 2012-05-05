/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate.test.domain;

/**
 *
 * @author User
 */
public class Visa extends Product {
    
    private String issuer;

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }
    
    
}
