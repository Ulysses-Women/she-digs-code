package com.ulysseswomen.shedigscode.repositories;

import com.ulysseswomen.shedigscode.models.Profile;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProfileRepository extends CrudRepository<Profile, Long>{
        List<Profile> findAll();
}
