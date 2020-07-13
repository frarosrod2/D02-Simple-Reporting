
package acme.features.anonymous.rosaBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import acme.entities.bulletin.RosaBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousRosaBulletinListService implements AbstractListService<Anonymous, RosaBulletin> {

	@Autowired
	AnonymousRosaBulletinRepository repository;


	@Override
	public boolean authorise(final Request<RosaBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<RosaBulletin> request, final RosaBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "title", "moment", "description");

	}

	@Override
	public Collection<RosaBulletin> findMany(final Request<RosaBulletin> request) {
		assert request != null;

		Collection<RosaBulletin> result;
=======
import acme.entities.bulletin.Rosabulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousRosaBulletinListService implements AbstractListService<Anonymous, Rosabulletin> {

	@Autowired
	AnonymousRosaBulletinRepository repository;


	@Override
	public boolean authorise(final Request<Rosabulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Rosabulletin> request, final Rosabulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "title", "moment", "description");

	}

	@Override
	public Collection<Rosabulletin> findMany(final Request<Rosabulletin> request) {
		assert request != null;

		Collection<Rosabulletin> result;
>>>>>>> branch 'master' of https://github.com/frarosrod2/D02-Simple-Reporting.git

		result = this.repository.findMany();

		return result;
	}

}
