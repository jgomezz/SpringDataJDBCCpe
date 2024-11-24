package pe.edu.tecsup.springbootapp.services;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.springbootapp.entities.Categoria;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepository;
import pe.edu.tecsup.springbootapp.repositories.CategoriaRepositoryImpl;

import java.util.List;

@Slf4j
@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() throws Exception {
        log.info("Cqll findAll() ");
        return categoriaRepository.findAll();
    }


}
