package EMC.Web.emc.controlleur;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import EMC.Web.emc.entities.Cheque;
import EMC.Web.emc.entities.FileDB;
import EMC.Web.emc.repo.ChequeRepository;
import EMC.Web.emc.service.FilesStorageService;
import message.ResponseFile;
import message.ResponseMessage;

@Controller
@CrossOrigin("http://localhost:8082")
public class FilesController {@Autowired
	  private FilesStorageService storageService;
	@Autowired
	private ChequeRepository chequeRepository;

	 



	
	}
