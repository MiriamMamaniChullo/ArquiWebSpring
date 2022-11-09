package pe.edu.upc.helpmefastspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefastspring.entities.Anuncio;

import java.util.List;
@Repository
public interface IAnuncioDAO extends JpaRepository<Anuncio,Integer> {
    @Query("from Anuncio a where a.servicio.descServicios like %:descServicios%")
    List<Anuncio> buscarServicio(@Param("descServicios") String descServicios);
}

