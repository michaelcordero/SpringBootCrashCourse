package com.corderosoft.tech.photozclone.service;

import com.corderosoft.tech.photozclone.model.Photo;
import com.corderosoft.tech.photozclone.repository.PhotozRepository;
import org.springframework.stereotype.Service;

@Service
public class PhotozService {
    private final PhotozRepository photozRepository;

    private PhotozService(PhotozRepository photozRepository) {
        this.photozRepository = photozRepository;
    }

    public Iterable<Photo> get() {
        return photozRepository.findAll();
    }

    public Photo get(Integer id) {
        return photozRepository.findById(id).orElse(null);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photozRepository.save(photo);
        return photo;
    }

    public void remove(Integer id) {
        photozRepository.deleteById(id);
    }
}
