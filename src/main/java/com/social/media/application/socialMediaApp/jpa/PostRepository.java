package com.social.media.application.socialMediaApp.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.media.application.socialMediaApp.user.Post;

public interface PostRepository extends JpaRepository<Post, Integer>{

}
