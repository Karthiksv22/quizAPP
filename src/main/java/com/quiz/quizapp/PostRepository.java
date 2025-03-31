package com.quiz.quizapp;

import com.quiz.quizapp.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}



// here y we import mongorepository is that because it can handle all
// requests and directly
// it talks to Database directly with it can handle all CRUD operations