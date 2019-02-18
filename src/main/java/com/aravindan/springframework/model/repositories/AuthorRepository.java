package com.aravindan.springframework.model.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.aravindan.springframework.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

	@Override
	default <S extends Author> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default <S extends Author> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Optional<Author> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	default Iterable<Author> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default Iterable<Author> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	default long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	default void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void delete(Author entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll(Iterable<? extends Author> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	default void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	

}
