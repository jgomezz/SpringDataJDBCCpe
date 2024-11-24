package pe.edu.tecsup.springbootapp.repositories;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.springbootapp.entities.Producto;

import java.util.List;

@Slf4j
@Repository
public class ProductoRepositoryImpl implements ProductoRepository{
    @Override
    public List<Producto> findAll() throws Exception {
        return List.of();
    }

    @Override
    public List<Producto> findByName(String nombre) throws Exception {
        return List.of();
    }

    @Override
    public Producto findById(Long id) throws Exception {
        return null;
    }

    @Override
    public void save(Producto producto) throws Exception {

    }

    @Override
    public void update(Long id, String nombreProducto) throws Exception {

    }

    @Override
    public void deleteById(Long id) throws Exception {

    }
}
