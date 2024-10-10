/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.perpustakaan.java.model;

/**
 *
 * @author ROBBIABD
 */
public class Buku {
    private int isbn;
    private String judul;
    private String jenisBuku;

    public Buku(int isbn, String judul, String jenisBuku) {
        this.isbn = isbn;
        this.judul = judul;
        this.jenisBuku = jenisBuku;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getTipeBuku() {
        return jenisBuku;
    }

    public void setTipeBuku(String tipeBuku) {
        this.jenisBuku = tipeBuku;
    }
    
    
}
