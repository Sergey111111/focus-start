package mocks.crud.task.service;

import mocks.crud.task.model.Address;
import mocks.crud.task.model.Person;
import mocks.crud.task.repository.AdvancedRepository;
import mocks.crud.task.repository.CrudRepository;

import java.util.List;

public class PersonService implements  AdvancedRepository {

    private AddressService addressService;
    private CrudRepository<Long, Person> personRepository;

    public PersonService(AddressService addressService, CrudRepository<Long, Person> personRepository) {
        this.addressService = addressService;
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> findAllRelatives(Person person) {
        return person.getRelatives();
    }

    @Override
    public Address getAddress(Person person) {
        return person.getAddress();
    }

    public void save(Person element) {
        personRepository.save(element);
    }

    public Person findById(Long id) {
        return personRepository.findById(id);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person update(Person element) {
        return personRepository.update(element);
    }

    public void delete(Person element) {
        personRepository.delete(element);
    }
}
