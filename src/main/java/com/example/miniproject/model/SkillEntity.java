package com.example.miniproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "skill")
public class SkillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nama_skill")
    private String namaSkill;

    @ManyToMany(mappedBy = "skill")
    @JsonIgnore
    private List<ProfileEntity> listEntity;

    SkillEntity(){

    }

    public List<ProfileEntity> getListEntity() {
        return listEntity;
    }

    public void setListEntity(List<ProfileEntity> listEntity) {
        this.listEntity = listEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaSkill() {
        return namaSkill;
    }

    public void setNamaSkill(String namaSkill) {
        this.namaSkill = namaSkill;
    }
}
