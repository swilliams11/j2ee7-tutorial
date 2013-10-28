/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaeetutorial.dukestutoring.web;

import javaeetutorial.dukestutoring.entity.Address;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author ian
 */
@Named
@RequestScoped
public class AddressManager {

    protected Address newAddress;

    /**
     * Get the value of newAddress
     *
     * @return the value of newAddress
     */
    public Address getNewAddress() {
        return newAddress;
    }

    /**
     * Set the value of newAddress
     *
     * @param newAddress new value of newAddress
     */
    public void setNewAddress(Address newAddress) {
        this.newAddress = newAddress;
    }


    /** Creates a new instance of AddressManager */
    public AddressManager() {
        this.newAddress = new Address();
    }

}
