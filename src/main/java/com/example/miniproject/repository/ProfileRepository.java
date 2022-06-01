package com.example.miniproject.repository;

import com.example.miniproject.model.ProfileEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, Long> {
    Page<ProfileEntity> findAll(Pageable pageable);
    Page<ProfileEntity>  findProfileEntityBySkillNamaSkill(String namaSkill, Pageable pageable);

}
