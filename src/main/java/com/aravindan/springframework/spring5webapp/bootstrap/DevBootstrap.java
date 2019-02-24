package com.aravindan.springframework.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.aravindan.springframework.spring5webapp.model.Author;
import com.aravindan.springframework.spring5webapp.model.Book;
import com.aravindan.springframework.spring5webapp.model.Publisher;
import com.aravindan.springframework.spring5webapp.model.repositories.AuthorRepository;
import com.aravindan.springframework.spring5webapp.model.repositories.BookRepository;
import com.aravindan.springframework.spring5webapp.model.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	
	private AuthorRepository authorRepository;
	private BookRepository bookRepository;
	private PublisherRepository publisherRepository;
	
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("onApplicationEvent start");
		initData();
		System.out.println("onApplicationEvent stop");
	}
	
	private void initData() {
		System.out.println("initData start");
		Author eric = new Author("Eric", "Evans");
		Publisher harpercollins = new Publisher("Harper Collins", "2000", "sydney", "NSW");
		Book ddd = new Book("Domain Driven Design", "1234", harpercollins);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		authorRepository.save(eric);
		publisherRepository.save(harpercollins);
		bookRepository.save(ddd);
		
		Author rod = new Author("Rod", "Johnson");
		Publisher worx = new Publisher("Worx", "3000", "melbourne", "VIC");
		Book noEJB = new Book("J2EE Development Without EJB", "2345", worx);
		eric.getBooks().add(noEJB);
		//noEJB.getAuthors().add(rod);
		
		authorRepository.save(rod);
		publisherRepository.save(worx);
		bookRepository.save(noEJB);
		
				
	}

}
