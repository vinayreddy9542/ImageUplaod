package com.vinay.Imageupload.repositary;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinay.Imageupload.Entity.ImageGallery;

@Service
public class ImageGalleryService {
	
	@Autowired
	private InageGalleryRepositary repo;
	
	public void saveImage(ImageGallery ig) {
		repo.save(ig);
	}
	
	public List<ImageGallery> getAllActiveImages() {
		return repo.findAll();
	}

	public Optional<ImageGallery> getImageById(Long id) {
		return repo.findById(id);
	}
}
