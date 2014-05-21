/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package session;

import entity.Professionals;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Holiwi-PC
 */
@Stateless
public class ProfessionalsFacade extends AbstractFacade<Professionals> implements ProfessionalsFacadeLocal {
    @PersistenceContext(unitName = "com.mycompany_test_maven-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProfessionalsFacade() {
        super(Professionals.class);
    }
    
}
