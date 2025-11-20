package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Huesped;
import com.model.TipoDoc;

import java.util.List;

@Repository
public interface HuespedRepository extends JpaRepository<Huesped, Long> {
     
    boolean existsByTipoDocumentoAndNumeroDocumento(TipoDoc tipoDocumento, String numeroDocumento);

    @Query("SELECT h FROM Huesped h WHERE " +
           "(:nombre IS NULL OR LOWER(h.nombres) LIKE :nombre) AND " +
           "(:apellido IS NULL OR LOWER(h.apellido) LIKE :apellido) AND " +
           "(:tipoDocumento IS NULL OR h.tipoDocumento = :tipoDocumento) AND " +
           "(:numeroDocumento IS NULL OR h.numeroDocumento LIKE :numeroDocumento)")
    List<Huesped> buscarHuespedes(
            @Param("nombre") String nombre,
            @Param("apellido") String apellido,
            @Param("tipoDocumento") TipoDoc tipoDocumento,
            @Param("numeroDocumento") String numeroDocumento);
}