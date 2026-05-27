package com.distribuida.service;

import com.distribuida.model.Cliente;
import jakarta.servlet.ServletRequestAttributeListener;

import java.util.List;

public interface ClienteService {

    public List<Cliente> findAll();

    public Cliente find0ne(int id);

    public Cliente save(Cliente cliente);

    public Cliente update(int id, Cliente cliente);

    public void delete(int id);

}
