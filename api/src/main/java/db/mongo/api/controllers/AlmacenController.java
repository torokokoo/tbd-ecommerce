package db.mongo.api.controllers;

import db.mongo.api.models.Almacen;
import db.mongo.api.services.AlmacenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/almacenes")
@CrossOrigin
public class AlmacenController {
    @Autowired
    private AlmacenService almacenService;

    @GetMapping("/")
    public List<Almacen> getAlmacenes(){
        return almacenService.findAll();
    }

    @PostMapping("/")
    public Almacen addAlmacen(@RequestBody Almacen almacen){
        return almacenService.save(almacen);
    }
}
