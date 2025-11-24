package com.dto;

import com.enums.TipoDoc;

public class HuespedDTO {
    private Long idHuesped;
    private String nombres;
    private String apellido;
    private TipoDoc tipoDocumento;
    private String numeroDocumento;

    public HuespedDTO(Long idHuesped, String nombres, String apellido, TipoDoc tipoDocumento, String numeroDocumento) {
        this.idHuesped = idHuesped;
        this.nombres = nombres;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
    }

    public Long getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(Long idHuesped) {
        this.idHuesped = idHuesped;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public TipoDoc getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDoc tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }
}
