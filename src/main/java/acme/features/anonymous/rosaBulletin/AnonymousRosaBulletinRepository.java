
package acme.features.anonymous.rosaBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import acme.entities.bulletin.RosaBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRosaBulletinRepository extends AbstractRepository {

	@Query("select r from RosaBulletin r")
	Collection<RosaBulletin> findMany();
=======
import acme.entities.bulletin.Rosabulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousRosaBulletinRepository extends AbstractRepository {

	@Query("select r from Rosabulletin r")
	Collection<Rosabulletin> findMany();
>>>>>>> branch 'master' of https://github.com/frarosrod2/D02-Simple-Reporting.git

}
