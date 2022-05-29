package com.example.miniproject.service;

import com.example.miniproject.model.ProfileEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProfileService {
    void save(ProfileEntity entity);

    Optional<ProfileEntity> findById(String id);

    Page<ProfileEntity> findAllPagination(Pageable pageable);

    Page<ProfileEntity> findBySkills(String skills, Pageable pageable);

    void deleteById(String id);

}
