package com.distribuida.service;

import com.distribuida.model.Cliente;
import com.sun.media.sound.DLSSoundbank;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import java.util.List;

public interface ClienteService {

    public List<Cliente> findAll();

    public Cliente find0ne(int id);

    public Cliente save(Cliente cliente);

    public Cliente update(int id, Cliente cliente, DLSSoundbank clienteDAO);

    public void delete(int id, SimpleJpaRepository<T, Integer> clienteDAO);

}
