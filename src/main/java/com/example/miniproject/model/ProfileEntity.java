package com.example.miniproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PROFILE")
public class ProfileEntity {
    @Id
    private String id;

    @Column(name = "nama")
    private String nama;

    @Column(name = "universitas")
    private String universitas;

    @Column(name = "lulus")
    private String lulus;

    @Column(name = "jenis_kelamin")
    private String jenisKelamin;

    @Column(name = "nomor_handphone")
    private String nomorHandphone;

    @Column(name = "skills")
    private String skills;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUniversitas() {
        return universitas;
    }

    public void setUniversitas(String universitas) {
        this.universitas = universitas;
    }

    public String getLulus() {
        return lulus;
    }

    public void setLulus(String lulus) {
        this.lulus = lulus;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNomorHandphone() {
        return nomorHandphone;
    }

    public void setNomorHandphone(String nomorHandphone) {
        this.nomorHandphone = nomorHandphone;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}
