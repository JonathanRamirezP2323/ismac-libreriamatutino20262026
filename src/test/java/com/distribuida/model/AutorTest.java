package com.distribuida.model;

import org.hibernate.engine.jdbc.batch.spi.BatchObserver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    private Autor autor;

    @BeforeEach
    public void setUp(){
        autor = new Autor(
                1
                ,"Puro"
                ,"Hueso"
                ,"Colombia"
                ,"En el norte"
                ,"0985806732"
                ,"phueso@correo.com"
        );
    }

    @Test
    public void testAutorConstructorAndGetters(){
        assertAll( "Pruebas unitarias constructor Autor",
                () -> assertEquals(1, autor.getIdAutor()),
                () -> assertEquals("Puro", autor.getNombre()),
                () -> assertEquals("Hueso", autor.getApellido()),
                () -> assertEquals("Colombia", autor.getPais()),
                () -> assertEquals("En el norte", autor.getDireccion()),
                () -> assertEquals("0987654321", autor.getTelefono()),
                () -> assertEquals("phueso@correo.com", autor.getCorreo())
        );

        System.out.println(autor.toString());

    }

    @Test
    public void testAutorSetters(){
        autor.setIdAutor(2);
        autor.setNombre("Anderson");
        autor.setApellido("Yar");
        autor.setPais("Perú");
        autor.setDireccion("En el centro");
        autor.setTelefono("0952097641");
        autor.setCorreo("ayar@correo.com");

        assertAll( "Pruebas unitarias constructor Autor",
                () -> assertEquals(2, autor.getIdAutor()),
                () -> assertEquals("Anderson", autor.getNombre()),
                () -> assertEquals("Yar", autor.getApellido()),
                () -> assertEquals("Perú", autor.getPais()),
                () -> assertEquals("En el centro", autor.getDireccion()),
                () -> assertEquals("0987654321", autor.getTelefono()),
                () -> assertEquals("phueso@correo.com", autor.getCorreo())
        );

        System.out.println(autor.toString());

    }

    @Test
    public void testClienteToString(){
        String str = autor.toString();
        assertAll("Validar datos de cliente con toString",
                () -> assertTrue(str.contains("1")),
                () -> assertTrue(str.contains("Puro")),
                () -> assertTrue(str.contains("Hueso")),
                () -> assertTrue(str.contains("Colombia")),
                () -> assertTrue(str.contains("En el norte")),
                () -> assertTrue(str.contains("0985806732")),
                () -> assertTrue(str.contains("phueso@correo.com"))
        );
    }
}
