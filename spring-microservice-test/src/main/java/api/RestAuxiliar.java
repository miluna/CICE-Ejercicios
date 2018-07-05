package api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("microservicio")
public interface RestAuxiliar {

    @RequestMapping("/welcome")
    String saludar();
}
