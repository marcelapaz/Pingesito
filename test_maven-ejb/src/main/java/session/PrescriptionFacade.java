/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entity.Prescription;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Holiwi-PC
 */
@Stateless
public class PrescriptionFacade extends AbstractFacade<Prescription> implements PrescriptionFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_test_maven-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PrescriptionFacade() {
        super(Prescription.class);
    }
    
}
