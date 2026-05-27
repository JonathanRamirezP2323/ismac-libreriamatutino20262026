package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp(){
        cliente = new Cliente(
                1
                ,"1701234567"
                ,"Bob"
                ,"Esponja"
                ,"En el mar"
                ,"0987654321"
                ,"besponja@correo.com"
        );
    }

    @Test
    public void testClienteConstructorAndGetters(){
        assertAll( "Pruebas unitarias constructor Cliente",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("1701234567", cliente.getCedula()),
                () -> assertEquals("Bob", cliente.getNombre()),
                () -> assertEquals("Esponja", cliente.getApellido()),
                () -> assertEquals("En el mar", cliente.getDireccion()),
                () -> assertEquals("0987654321", cliente.getTelefono()),
                () -> assertEquals("bvesponja@correo.com", cliente.getCorreo())
                );

        System.out.println(cliente.toString());

    }

    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1701234567");
        cliente.setNombre("Bob2");
        cliente.setApellido("Esponja2");
        cliente.setDireccion("En el mar, 2");
        cliente.setTelefono("0987654321");
        cliente.setCorreo("besponja@correo.com");

        assertAll( "Pruebas unitarias constructor Cliente",
                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("170123456", cliente.getCedula()),
                () -> assertEquals("Bob2", cliente.getNombre()),
                () -> assertEquals("Esponja2", cliente.getApellido()),
                () -> assertEquals("En el mar, 2", cliente.getDireccion()),
                () -> assertEquals("0987654321", cliente.getTelefono()),
                () -> assertEquals("bvesponja2@correo.com", cliente.getCorreo())
        );

        System.out.println(cliente.toString());

    }

    @Test
    public void testClienteToString(){
        String str = cliente.toString();
        assertAll("Validar datos de cliente con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("1701234567")),
                () -> assertTrue(str.contains("Bob")),
                () -> assertTrue(str.contains("Esponja")),
                () -> assertTrue(str.contains("En el mar")),
                () -> assertTrue(str.contains("0987654321")),
                () -> assertTrue(str.contains("besponja@correo.com"))
        );
    }

}