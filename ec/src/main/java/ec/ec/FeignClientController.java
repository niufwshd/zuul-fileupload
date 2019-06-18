package ec.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author Administrator
 * @create 2019-06-17
 * @since 1.0.0
 */


//@FeignClient(name = "webservice",fallback = DemoFeignFallback.class)
@FeignClient(name = "webservice")
public interface FeignClientController {

    @RequestMapping("/webservice/hello")
    public String Hello();

    @RequestMapping(value = "/webservice/upload",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String handleFileUpload(MultipartFile file) throws  IOException;
}

