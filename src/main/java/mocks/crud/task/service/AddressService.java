package mocks.crud.task.service;

import mocks.crud.task.model.Address;
import mocks.crud.task.repository.CrudRepository;

import java.util.List;

public class AddressService implements CrudRepository<Long, Address> {

private CrudRepository<Long, Address> addressRepository;

    public AddressService(AddressService addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void save(Address element) {
        addressRepository.save(element);
    }

    @Override
    public Address findById(Long id) {
        return addressRepository.findById(id);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public Address update(Address element) {
        return addressRepository.update(element);
    }

    @Override
    public void delete(Address element) {
        addressRepository.delete(element);
    }
}
