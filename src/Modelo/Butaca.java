/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Patty
 */
public class Butaca {
    private String numeroButaca;
    private int idSala;
    private String estado;
    
    public Butaca(String numeroButaca, int idSala, String estado) {
        this.numeroButaca = numeroButaca;
        this.idSala = idSala;
        this.estado = estado;
    }

    public Butaca() {
    }

    public String getNumeroButaca() {
        return numeroButaca;
    }

    public void setNumeroButaca(String numeroButaca) {
        this.numeroButaca = numeroButaca;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
