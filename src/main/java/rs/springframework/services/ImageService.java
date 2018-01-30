package rs.springframework.services;

import org.springframework.web.multipart.MultipartFile;

/**
 *  rs.springframework on 7/3/17.
 */
public interface ImageService {

    void saveImageFile(String recipeId, MultipartFile file);
}
