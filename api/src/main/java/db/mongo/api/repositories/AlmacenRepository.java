package db.mongo.api.repositories;

import db.mongo.api.models.Almacen;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface AlmacenRepository extends MongoRepository<Almacen, String> {
}
