package com.social.media.application.socialMediaApp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.media.application.socialMediaApp.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
