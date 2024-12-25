package db.mongo.api.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexType;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Almacen")
@Data
@AllArgsConstructor
public class Almacen {

    @Id
    private String idAlmacen;

    @Getter
    @Setter private String nombre;
    private String descripcion;

    @GeoSpatialIndexed(type = GeoSpatialIndexType.GEO_2DSPHERE)
    private Location location;
}
