package pe.edu.tecsup.springbootapp.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.entities.Producto;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class ProductoServiceTest {

    @Autowired
    ProductoService productoService;

    @Test
    void findAll() throws Exception {
        Boolean VALUE_EXPECTED = true;

        log.info("Start testing ");

        List<Producto> productos =  this.productoService.findAll();
        productos.stream().forEach(prod -> System.out.println(prod.getNombre()));
        productos.isEmpty();

        assertEquals(VALUE_EXPECTED, !productos.isEmpty());

    }

    @Test
    void findByName() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void update() {
    }
}