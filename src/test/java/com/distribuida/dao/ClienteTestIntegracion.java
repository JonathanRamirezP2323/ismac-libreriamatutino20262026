package com.distribuida.dao;

import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTestIntegracion {

    private Cliente cliente;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)
public class ClienteTestIntegracion {


    @Autowired
    private ClienteDAO clienteDAO;

    @Test
    public void findAll(){
        List<Cliente> clientes = clienteDAO.findAll();
        assertNotNull(clientes);
        assertTrue(clientes.size() > 0);
        for (Cliente item : clientes){
            System.out.println(item.toString());
        }
    }

    @Test
    public void find0ne(){
        Optional<Cliente> cliente = clienteDAO.findById(1);
        assertTrue(cliente.isPresent(), "El cliente con id = 1, debería existir");
        System.out.println(cliente.toString());
    }

    @Test
    public void save(){
        Cliente cliente = new Cliente(
                0, "1701234567", "Bob", "Esponja", "En el mar"
                , "0987654321", "besponja@correo.com");
        Cliente clienteGuardado = clienteDAO.save(cliente);
        assertNotNull(clienteGuardado.getIdCliente(), "El cliente guardado debe tener un id.");
        assertEquals("1701234567",clienteGuardado.getCedula());
        assertEquals("Bob",clienteGuardado.getNombre());
    }

    @Test
    public void update(){
        Optional<Cliente> cliente = clienteDAO.findById(44);
        assertTrue(cliente.isPresent(), "El cliente con id=44 debe de existir para ser actualzado");

        cliente.orElse(null).setCedula("1701234567");
        cliente.orElse(null).setNombre("Bob");
        cliente.orElse(null).setApellido("Esponja");
        cliente.orElse(null).setDireccion("En el mar");
        cliente.orElse(null).setTelefono("0987654321");
        cliente.orElse(null).setCorreo("besponja@correo.com");

        Cliente clienteActualizado = clienteDAO.save(cliente.orElse(null));

        assertEquals("Bob", clienteActualizado.getNombre());
        assertEquals("Esponja", clienteActualizado.getApellido());
    }

    @Test
    public void delete(){
        if(clienteDAO.existsById(44)){
            clienteDAO.deleteById(44);
        }
        assertFalse(clienteDAO.existsById(44), "El id=44 debería haberse eliminado");
    }
  }
}
