/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Mb;

import entity.Patients;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import session.PatientsFacadeLocal;

/**
 *
 * @author Holiwi-PC
 */
@ManagedBean
@RequestScoped
public class TestBean {
    
    @EJB
    private PatientsFacadeLocal patientsFacade;

    String nombre;
    
    public TestBean() {
    }
    
   
    public void mostrar(){
        FacesContext context = FacesContext.getCurrentInstance();
        List<Patients> persona= patientsFacade.findAll();
        
        for(int i=0;i<persona.size();i++){
            System.out.println(persona.get(i).getFirstName());
            System.out.println(getNombre());
            //FacesContext.getCurrentInstance().getExternalContext().redirect("inicio.xhtml");
            
            
        }
        
        context.addMessage(null, new FacesMessage("welcomeee", getNombre()));
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
