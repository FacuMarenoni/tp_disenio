package com.model;

import jakarta.persistence.*;

@Entity
@Table(name = "metodo_de_pago")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class MetodoDePago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tipo_metodo", nullable = false, length = 20)
    private String tipoMetodo;

    @Column(name = "importe")
    private Double importe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoMetodo() {
        return tipoMetodo;
    }

    public void setTipoMetodo(String tipoMetodo) {
        this.tipoMetodo = tipoMetodo;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
}
