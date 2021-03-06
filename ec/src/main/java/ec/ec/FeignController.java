package ec.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;


@RestController
public class FeignController
{
     @Autowired
     private FeignClientController feClientService;

     @RequestMapping("/hi")
     public String hi()
     {
         return feClientService.Hello();
     }
   @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public String handleFileUpload(@RequestParam(value = "file", required = true) MultipartFile file) throws IOException
    {
          return feClientService.handleFileUpload(file);
    }

}
