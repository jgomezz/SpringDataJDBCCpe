package pe.edu.tecsup.springbootapp.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepository;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepositoryImpl;

import java.util.List;

public class CategoriaServiceImpl implements CategoriaService{

    private static Logger log = LoggerFactory.getLogger(CategoriaServiceImpl.class);

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() throws Exception {
        log.info("Cqll findAll() ");
        return categoriaRepository.findAll();
    }


}
