package com.example.miniproject.service;

import com.example.miniproject.model.ProfileEntity;
import com.example.miniproject.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileServiceImpl implements ProfileService {
    @Autowired
    private ProfileRepository profileRepository;

    @Override
    public void save(ProfileEntity entity) {
        profileRepository.save(entity);

    }

    @Override
    public Optional<ProfileEntity> findById(String id) {
        return profileRepository.findById(id);
    }

    @Override
    public Page<ProfileEntity> findAllPagination(Pageable pageable) {
        return profileRepository.findAll(pageable);
    }

    @Override
    public Page<ProfileEntity> findBySkills(String skills, Pageable pageable) {
        return profileRepository.findAllBySkill(skills, pageable);
    }

    @Override
    public void deleteById(String id) {
        profileRepository.deleteById(id);
    }


}
