package com.geladeira.repository;

import io.geladeira.entity.Empregados;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class EmpregadosRepository implements PanacheRepository<Empregados>{

    //CREATE
    public void createEmpregado(Empregados empregado){
        persist(empregado);
    }

    // READ - todos 
    public List<Empregados> findAllEmpregados(){
        return listAll();
    }

    // READ - por Id
    public Empregados findByIdEmpregados (Long id){
        return findById(id);
    }

    public void updateEmpregado(Empregados e){
        getEntityManager().merge(empregado);
    }

    // DELETE
    public void deleteEmpregado(Empregados empregado){
        delete(empregado)
    }

    // DELETE - por ID 
    public boolean deleteByIdEmpregado (Long id ){
        return deleteById(id);
    }

}
