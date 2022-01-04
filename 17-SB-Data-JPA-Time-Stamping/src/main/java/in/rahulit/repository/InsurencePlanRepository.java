package in.rahulit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.rahulit.entity.InsurencePlan;

public interface InsurencePlanRepository extends JpaRepository<InsurencePlan, Serializable> {

}
