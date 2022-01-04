package in.rahulit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahulit.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Serializable> {

}
