package webservice.webservice.controller;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author Administrator
 * @create 2019-06-17
 * @since 1.0.0
 */
@RestController
@RequestMapping("webservice")
public class HomeController implements FeignClientController {

    @RequestMapping("/hello")
    public String Hello()
    {
        return "world!";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    String handleFileUpload(@RequestParam(value = "file", required = true) MultipartFile file) throws IOException {
        byte[] bytes = file.getBytes();
        File fileToSave = new File(file.getOriginalFilename());
        FileCopyUtils.copy(bytes, fileToSave);
        return fileToSave.getAbsolutePath();
    }


}
