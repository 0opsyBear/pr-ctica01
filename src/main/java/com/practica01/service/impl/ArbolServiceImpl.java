/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.service.impl;

import com.practica01.dao.ArbolDao;
import com.practica01.domain.Arbol;
import com.practica01.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Desktop
 */
@Service
public class ArbolServiceImpl implements ArbolService{
    @Autowired
    private ArbolDao arbolDao;
    
    
    @Transactional(readOnly = true)
    @Override
    public List <Arbol> getArboles(){
        var lista = arbolDao.findAll();
        return lista;
    }
    
    
    @Transactional(readOnly = true)
    @Override
    public Arbol getArbol (Arbol arbol){
        return arbolDao.findById(arbol.getIdArbol()).orElse(null);
    }
    
   
    @Transactional
    @Override
    public void save (Arbol arbol){
        arbolDao.save(arbol);
    }
    
    
    @Transactional
    @Override
    public void delete (Arbol arbol){
        arbolDao.delete(arbol);
    }
}
