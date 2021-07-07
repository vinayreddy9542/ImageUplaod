package com.vinay.Imageupload.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vinay.Imageupload.Entity.ImageGallery;

public interface InageGalleryRepositary extends JpaRepository<ImageGallery, Long> {
	
}
