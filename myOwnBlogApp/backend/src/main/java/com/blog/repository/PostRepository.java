package com.blog.repository;

import com.blog.model.Post;
import com.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findByAuthorOrderByCreatedAtDesc(User author);
    List<Post> findAllByOrderByCreatedAtDesc();
}
