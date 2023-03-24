package com.cursoapirest.modulos.status.dto;

import java.io.Serializable;
import java.util.Date;

public class StatusDTO implements Serializable {
private static final String VERSAO = "Versao: 0,0,1";
private static final String MENSAGEM = "Servidor Operando Com Sucesso!!";
    private String ver = VERSAO;
    private String msn=MENSAGEM;
    private Date date = new Date();

    public StatusDTO() {
    }

    public StatusDTO(String ver, String msn, Date date) {
        this.ver = ver;
        this.msn = msn;
        this.date = date;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
