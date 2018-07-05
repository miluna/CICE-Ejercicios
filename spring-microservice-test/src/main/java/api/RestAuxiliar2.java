package api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("microservicio-feign")
public interface RestAuxiliar2 {

    @RequestMapping("/get-saludo")
    String saludo();
}
