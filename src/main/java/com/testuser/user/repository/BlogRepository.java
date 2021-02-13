package com.testuser.user.repository;

import com.testuser.user.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends
        JpaRepository<Blog,Integer>{

    List<Blog> findByTitleContainingOrContentContaining
            (String text, String textAgain);

}
