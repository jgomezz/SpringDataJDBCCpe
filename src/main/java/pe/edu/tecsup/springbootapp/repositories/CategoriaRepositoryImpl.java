package pe.edu.tecsup.springbootapp.repositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pe.edu.tecsup.springbootapp.entities.Categoria;

import java.util.ArrayList;
import java.util.List;

public class CategoriaRepositoryImpl implements CategoriaRepository{

    private static Logger log = LoggerFactory.getLogger(CategoriaRepositoryImpl.class);

    @Override
    public List<Categoria> findAll() throws Exception {

        log.info("call findAll()");

        List<Categoria> categorias = new ArrayList<>();

        Categoria cat = new Categoria();
        cat.setId(1L);
        cat.setNombre("Portatiles");
        cat.setOrden(1);

        categorias.add(cat);

        return categorias;
    }

}
