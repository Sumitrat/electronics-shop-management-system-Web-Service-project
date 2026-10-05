package controller;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
public abstract class AbstractFacade<T>{
private final Class<T> entityClass;
public AbstractFacade(Class<T> c){entityClass=c;}
protected abstract EntityManager getEntityManager();
public void create(T e){getEntityManager().persist(e);}
public void edit(T e){getEntityManager().merge(e);}
public void remove(T e){getEntityManager().remove(getEntityManager().merge(e));}
public T find(Object id){return getEntityManager().find(entityClass,id);}
public List<T> findAll(){CriteriaQuery<T> q=getEntityManager().getCriteriaBuilder().createQuery(entityClass);q.select(q.from(entityClass));return getEntityManager().createQuery(q).getResultList();}
public int count(){CriteriaQuery<Long> q=getEntityManager().getCriteriaBuilder().createQuery(Long.class);q.select(getEntityManager().getCriteriaBuilder().count(q.from(entityClass)));return getEntityManager().createQuery(q).getSingleResult().intValue();}
}