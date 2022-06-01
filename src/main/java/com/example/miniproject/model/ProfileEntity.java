package com.example.miniproject.model;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "profile")
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REMOVE})
    @JoinTable(name = "connector",
            joinColumns = @JoinColumn(name = "id_profile"),
            inverseJoinColumns = @JoinColumn(name ="id_skill")
    )
    private List<SkillEntity> skill;

    ProfileEntity(){

    }
    public void addSkill(SkillEntity skillEntity){
        this.skill.add(skillEntity);
        skillEntity.getListEntity().add(this);
    }

    public List<SkillEntity> getSkill() {
        return skill;
    }

    public void setSkill(List<SkillEntity> skill) {
        this.skill = skill;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
