package pe.edu.upc.helpmefastspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.helpmefastspring.entities.Comentarios;
import pe.edu.upc.helpmefastspring.entities.Distrito;


import java.util.List;
@Repository
public interface IComentariosDAO extends JpaRepository<Comentarios,Integer>{

    @Query("from Comentarios c where c.Calificacion like %:Calificacion%")
    List<Comentarios> buscarComentarios(@Param("Calificacion") String Calificacion);
}
