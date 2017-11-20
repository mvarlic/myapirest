package com.spring.api.myapirest.repositories;

import com.spring.api.myapirest.models.Bookmark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.io.Serializable;

@RepositoryRestResource(collectionResourceRel="bookmarks",path="bookmarks")
public interface BookmarkRepository extends CrudRepository<Bookmark,Serializable> {

}
