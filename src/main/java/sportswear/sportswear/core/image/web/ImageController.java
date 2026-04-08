package sportswear.sportswear.core.image.web;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/images")
public class ImageController {


    private final String IMAGE_DIR = "D:/images/";

    @GetMapping("/{imageName}")
    public ResponseEntity<Resource> serveImage(@PathVariable String imageName) {
        try {
            Path filePath = Paths.get(IMAGE_DIR).resolve(imageName).normalize();
            Resource resource = new UrlResource(filePath.toUri());

            if (!resource.exists()) {
                return ResponseEntity.notFound().build();
            }

            MediaType mediaType = MediaType.APPLICATION_OCTET_STREAM;
            if (imageName.endsWith(".png")) mediaType = MediaType.IMAGE_PNG;
            else if (imageName.endsWith(".jpg") || imageName.endsWith(".jpeg")) mediaType = MediaType.IMAGE_JPEG;
            else if (imageName.endsWith(".gif")) mediaType = MediaType.IMAGE_GIF;

            return ResponseEntity.ok()
                    .contentType(mediaType)
                    .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + resource.getFilename() + "\"")
                    .body(resource);

        } catch (MalformedURLException e) {
            return ResponseEntity.badRequest().build();
        }
    }
}