/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.VeccUsuario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u10549640177
 */
public class UsuariosDAO extends DAO_Abstract{
    public UsuariosDAO(){}
    
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
       session.delete( object);
       session.getTransaction().commit();
    }

    @Override
    public Object list(int id) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccUsuario.class);
        criteria.add(Restrictions.eq("veccIdusuario", id));
        List Lista = criteria.list();
        session.getTransaction().commit();
        return Lista.get(0);
    }

    @Override
    public List listALL() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccUsuario.class);
        List Lista = criteria.list();
        session.getTransaction().commit();
        return(ArrayList) Lista;
    }
    
    public List listNome(String nome){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccUsuario.class);
        criteria.add(Restrictions.like("VeccNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listCpf(String cpf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccUsuario.class);
        criteria.add(Restrictions.like("VeccCpf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
    public List listNomeCpf(String nome, String cpf){
        session.beginTransaction();
        Criteria criteria = session.createCriteria(VeccUsuario.class);
        criteria.add(Restrictions.like("VeccNome", "%" + nome + "%"));
        criteria.add(Restrictions.like("VeccCpf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    
     public List login(String nome, String senha){
        session.beginTransaction();
       Criteria criteria = session.createCriteria(VeccUsuario.class);
        criteria.add(Restrictions.eq("VeccNome", nome ));
         criteria.add(Restrictions.eq("VeccSenha", senha ));
        List lista = criteria.list();
        session.getTransaction().commit();
    return lista;
     
    }    
}