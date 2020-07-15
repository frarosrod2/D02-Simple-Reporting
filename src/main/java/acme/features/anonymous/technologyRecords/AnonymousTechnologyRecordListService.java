package acme.features.anonymous.technologyRecords;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.technologyRecords.TechnologyRecord;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousTechnologyRecordListService implements AbstractListService<Anonymous, TechnologyRecord>{

	@Autowired
	AnonymousTechnologyRecordRepository repository;
	
	@Override
	public boolean authorise(Request<TechnologyRecord> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(Request<TechnologyRecord> request, TechnologyRecord entity, Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		
		request.unbind(entity, model, "title", "inventor");
		
	}

	@Override
	public Collection<TechnologyRecord> findMany(Request<TechnologyRecord> request) {
		assert request != null;
		
		Collection<TechnologyRecord> result;
		
		result = this.repository.findMany();
		
		return result;
	}

	
	
}
