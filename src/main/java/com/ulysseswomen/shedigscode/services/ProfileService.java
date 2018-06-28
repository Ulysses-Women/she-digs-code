package com.ulysseswomen.shedigscode.services;

import com.ulysseswomen.shedigscode.models.Profile;
import com.ulysseswomen.shedigscode.repositories.ProfileRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    private final ProfileRepository profileDao;

    public ProfileService(ProfileRepository profileDao){
        this.profileDao = profileDao;
    }

    public Profile save(Profile profile){
        profileDao.save(profile);
        return profile;
    }
}
