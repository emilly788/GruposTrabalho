
package com.mycompany.grupostrabalho;

import java.time.LocalDate;

public class Membro {
    private String grupo;
    private String membro;
    private LocalDate inicio;

    public Membro(String grupo, LocalDate inicio, String membro) {
        this.grupo = grupo;
        this.membro = membro;
        this.inicio = inicio;
    }

    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getMembro() {
        return membro;
    }

    public void setMembro(String membro) {
        this.membro = membro;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }
    
//</editor-fold>    
    
}
