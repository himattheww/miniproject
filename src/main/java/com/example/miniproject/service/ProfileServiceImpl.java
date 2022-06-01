package com.example.miniproject.service;

import com.example.miniproject.model.ProfileEntity;
import com.example.miniproject.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
    public Optional<ProfileEntity> findById(Long id) {
        return profileRepository.findById(id);
    }

    @Override
    public Page<ProfileEntity> findAll(Pageable pageable) {
        return profileRepository.findAll(pageable);
    }

    @Override
    public Page<ProfileEntity> findProfileEntityBySkillNamaSkill(String skills, Pageable pageable) {
        return profileRepository.findProfileEntityBySkillNamaSkill(skills, pageable);
    }

//    @Override
//    public Page<ProfileEntity> findBySkills(String skills, Pageable pageable) {
//
//        List<ProfileEntity> listEntity = profileRepository.findAllBySkill(skills);
//
//        List<String> listIdBySkill = new ArrayList<>();
//        for(ProfileEntity entity : listEntity){
//            listIdBySkill.add(entity.getId());
//        }
//        return profileRepository.findAllPaginationBySkill(listIdBySkill,pageable);
//    }

    @Override
    public void savelist(List<ProfileEntity> listEntity) {
        profileRepository.saveAll(listEntity);
    }

    @Override
    public void deleteById(Long id) {
        profileRepository.deleteById(id);
    }


}
