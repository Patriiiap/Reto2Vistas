package org.example.reto2benidormchess;

public class Jugador {

    private int rangoInicial;
    private int rangoFinal;
    private String fideid;
    private String nombre;
    private int elo;
    private String pais;
    private boolean cv;
    private boolean h;
    private int rangofinal;
    private String NombreTorneo;


    public Jugador(int rangoInicial, String fideid, String nombre, int elo, String pais, boolean cv, boolean h, String nombreTorneo) {
        this.rangoInicial = rangoInicial;
        this.fideid = fideid;
        this.nombre = nombre;
        this.elo = elo;
        this.pais = pais;
        this.cv = cv;
        this.h = h;
        NombreTorneo = nombreTorneo;
    }

    public int getRangoInicial() {
        return rangoInicial;
    }

    public void setRangoInicial(int rangoInicial) {
        this.rangoInicial = rangoInicial;
    }

    public int getRangoFinal() {
        return rangoFinal;
    }

    public void setRangoFinal(int rangoFinal) {
        this.rangoFinal = rangoFinal;
    }

    public String getFideid() {
        return fideid;
    }

    public void setFideid(String fideid) {
        this.fideid = fideid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getElo() {
        return elo;
    }

    public void setElo(int elo) {
        this.elo = elo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isCv() {
        return cv;
    }

    public void setCv(boolean cv) {
        this.cv = cv;
    }

    public boolean isH() {
        return h;
    }

    public void setH(boolean h) {
        this.h = h;
    }

    public int getRangofinal() {
        return rangofinal;
    }

    public void setRangofinal(int rangofinal) {
        this.rangofinal = rangofinal;
    }

    public String getNombreTorneo() {
        return NombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        NombreTorneo = nombreTorneo;
    }
}
