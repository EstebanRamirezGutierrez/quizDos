package com.corhuila.shoppingcar.Service;
import com.corhuila.shoppingcar.Document.Proveedor;
import com.corhuila.shoppingcar.IRepository.IProveedorRepository;
import com.corhuila.shoppingcar.IService.IProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProveedorServices implements IProveedorService {
    // Conectar con los datos - IRepository
    // Inyección de dependencia
    @Autowired
    private IProveedorRepository repository;

    @Override
    public List<Proveedor> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Proveedor> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    @Override
    public void update(Proveedor proveedor, String id) {
        // Obtener el objeto proveedor y el id
        // Verificar con el id, si existen los datos
        Optional<Proveedor> ps = repository.findById(id);

        // Cargar nuevo objeto
        if (ps.isPresent()) {
            Proveedor proveedorUpdate = ps.get();
            proveedorUpdate.setCodigo(proveedor.getCodigo());
            proveedorUpdate.setNombre(proveedor.getNombre());
            proveedorUpdate.setDireccion(proveedor.getDireccion());

            // Actualizar el objeto proveedor
            repository.save(proveedorUpdate);
        } else {
            System.out.println("No existe el proveedor");
        }
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }
}