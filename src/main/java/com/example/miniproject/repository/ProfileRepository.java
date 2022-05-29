package com.example.miniproject.repository;

import com.example.miniproject.model.ProfileEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<ProfileEntity, String> {
    @Query(value = "from ProfileEntity p where p.skills like %:skill% ")
    Page<ProfileEntity> findAllBySkill(@Param("skill") String skill, Pageable pageable);


}
