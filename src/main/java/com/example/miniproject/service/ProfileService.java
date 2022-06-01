package com.example.miniproject.service;

import com.example.miniproject.model.ProfileEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ProfileService {
    void save(ProfileEntity entity);

    Optional<ProfileEntity> findById(Long id);

    Page<ProfileEntity> findAll(Pageable pageable);

    Page<ProfileEntity> findProfileEntityBySkillNamaSkill(String skills, Pageable pageable);

    void savelist(List<ProfileEntity> listEntity);

    void deleteById(Long id);

}
