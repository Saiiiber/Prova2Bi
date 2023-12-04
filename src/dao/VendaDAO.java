/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VeccCliente;
import bean.VeccVenda;
import bean.VeccVendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u10549640177
 */
    public class VendaDAO extends DAO_Abstract {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccVenda.class);
        criteria.add(Restrictions.eq("veccIdvenda", id));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccVenda.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public List listProduto(String produto){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccVenda.class);
        criteria.add(Restrictions.like("VeccNome", "%" + produto + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listPreco(int preco){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccVenda.class);
        criteria.add(Restrictions.like("VeccPreco", "%" + preco + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listProdutoPreco(String produto, int preco){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccCliente.class);
        criteria.add(Restrictions.like("VeccProduto", "%" + produto + "%"));
        criteria.add(Restrictions.like("VeccPreco", "%" + preco + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}

