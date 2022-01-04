package in.rahulit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.rahulit.entity.InsurencePlan;
import in.rahulit.repository.InsurencePlanRepository;

@Service
public class InsurenceService {

	@Autowired
	private InsurencePlanRepository planRepository;

	public void savePlan() {
		InsurencePlan plan = new InsurencePlan();
		plan.setPlanName("SNPA");
		plan.setPlanStatus("DN");
		planRepository.save(plan);
	}

}
