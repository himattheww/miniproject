package com.example.miniproject.controller;

import com.example.miniproject.model.ProfileEntity;
import com.example.miniproject.model.Response;
import com.example.miniproject.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @PostMapping(value = "/add-profile")
    public ResponseEntity<?> save(@RequestBody ProfileEntity profileEntity) {
        try {
            profileEntity.setId(UUID.randomUUID().toString());
            profileService.save(profileEntity);
            return new ResponseEntity<>("Berhasil", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/all")
    public ResponseEntity<?> findAllPagination(@RequestParam(name = "page", defaultValue = "0") Integer page,
                                               @RequestParam(name = "size", defaultValue = "10") Integer size,
                                               @RequestParam(name = "skill", defaultValue = "") String skill) {
        try {
            Pageable pageable = PageRequest.of(page, size);
            Page<ProfileEntity> response;
            if (skill.isEmpty()) {
                 response = profileService.findAllPagination(pageable);
            } else{
                 response = profileService.findBySkills(skill,pageable);
            }
            Response<ProfileEntity> res = new Response<>();
            res.setData(response.getContent());
            res.setPage(response.getTotalPages());
            res.setSize(response.getSize());
            res.setTotal((int) response.getTotalElements());
            return new ResponseEntity<>(res, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/update-profile")
    public ResponseEntity<?> update(@RequestBody ProfileEntity profileEntity) {
        try {
            profileService.save(profileEntity);
            return new ResponseEntity<>("Update Berhasil", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping(value = "/delete-profile/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") String id) {
        try {
            profileService.deleteById(id);
            return new ResponseEntity<>("Delete Berhasil", HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


   /* @GetMapping(name = "/all")
    public ResponseEntity<?> findAllPaginationBySkill(@RequestParam(name = "page", defaultValue = "0") Integer page,
                                               @RequestParam(name = "size",defaultValue = "10") Integer size, @RequestParam(name = "skill",defaultValue = "")) {
        try {
            Pageable pageable = PageRequest.of(page,size);
            Page<ProfileEntity>response = profileService.findAllPagination(pageable);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
