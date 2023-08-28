package com.example.KodlamaIO.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.KodlamaIO.dataAccess.abstracts.LanguageRepository;
import com.example.KodlamaIO.entities.concretes.Language;

@Repository // bu sınıf bir data access nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1,"Java"));
		languages.add(new Language(2,"C#"));
		languages.add(new Language(3,"Phytion"));
		
	}




	@Override
	public List<Language> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}

	}
	
	


