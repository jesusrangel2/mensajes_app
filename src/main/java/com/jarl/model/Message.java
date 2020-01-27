package com.jarl.model;

public class Message {

    private Integer id;
    private String mensaje;
    private String autor;
    private String date_publication;

    public Message() {
    }

    public Message(String mensaje, String autor, String date_publication) {
        this.mensaje = mensaje;
        this.autor = autor;
        this.date_publication = date_publication;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDate_publication() {
        return date_publication;
    }

    public void setDate_publication(String date_publication) {
        this.date_publication = date_publication;
    }
}
