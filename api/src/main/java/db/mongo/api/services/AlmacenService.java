package db.mongo.api.services;

import db.mongo.api.models.Almacen;
import db.mongo.api.repositories.AlmacenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlmacenService {
    @Autowired
    AlmacenRepository almacenRepository;

    public List<Almacen> findAll() {
        return almacenRepository.findAll();
    }

    public Almacen save(Almacen almacen) {
        return almacenRepository.save(almacen);
    }
}
