package controller;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import product.Appliance;
@Stateless public class ApplianceFacade extends AbstractFacade<Appliance>{
@PersistenceContext(unitName="WebServicePU") private EntityManager em;
protected EntityManager getEntityManager(){return em;}
public ApplianceFacade(){super(Appliance.class);}
}