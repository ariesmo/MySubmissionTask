package com.example.mysubmissiontask;

public class Submission {
    String nama;
    String keterangan;
    String foto;
    String detail;

    public Submission(String nama, String keterangan, String foto, String detail) {
        this.nama = nama;
        this.keterangan = keterangan;
        this.foto = foto;
        this.detail = detail;
    }

    public Submission() {
    }


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
