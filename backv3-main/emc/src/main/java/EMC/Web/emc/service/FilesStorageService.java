package EMC.Web.emc.service;
import java.io.IOException;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import EMC.Web.emc.entities.FileDB;
import EMC.Web.emc.repo.FileDBRepository;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.nio.file.Path;
import java.util.stream.Stream;
public interface FilesStorageService {
	  	String store(MultipartFile file);
	    Resource loadResource(String filename );

	    void deleeAll();
	    void init();
	    Stream<Path> loadFiles();

	    ResponseEntity<Resource> downloadImage(String imageName, HttpServletRequest request);
	
}
