package pe.edu.tecsup.springbootapp.services;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoriaServiceImplTest {

    private static Logger log = LoggerFactory.getLogger(CategoriaServiceImplTest.class);

    @Autowired
    CategoriaService categoriaService;

    @Test
    void findAll() throws Exception {

        this.categoriaService.findAll();

    }
}