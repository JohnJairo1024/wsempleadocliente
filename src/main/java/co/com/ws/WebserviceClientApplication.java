package co.com.ws;

import co.com.wss.NuevoEmpleadoRequest;
import co.com.wss.NuevoEmpleadoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class WebserviceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebserviceClientApplication.class, args);
    }
}
