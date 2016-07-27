package ch72.net.service;

import ch72.net.domain.Customer;
import ch72.net.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by asato on 2016/07/27.
 */
@Service
@Transactional
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    // implement CRUD only. if need some validation, implement yourself.
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Page<Customer> findAllOrderByName(Pageable pageable) {
        return customerRepository.findAllOrderByName(pageable);
    }

    public Customer findOne(Integer id) {
        return customerRepository.findOne(id);
    }

    public Customer create(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }

    public void delete(Integer id) {
        customerRepository.delete(id);
    }

}
