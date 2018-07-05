package api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@FeignClient
@RestController
public class RestResource {


    @Autowired
    RestAuxiliar auxiliar;

    @Autowired
    RestAuxiliar2 auxiliar2;

    @RequestMapping("/hola")
    public String saludar() {
        return "Hola desde microservicio 1";
    }

    @RequestMapping("/saludo2")
    public String saludo2(){
        return  auxiliar.saludar();
    }

    @RequestMapping("/saludo3")
    public String saludo3(){
        return auxiliar2.saludo();
    }

}
