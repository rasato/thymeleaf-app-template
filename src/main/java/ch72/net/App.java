package ch72.net;

import ch72.net.domain.Customer;
import ch72.net.repository.CustomerRepository;
import ch72.net.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{

    @Autowired
    CustomerService customerService;

    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
