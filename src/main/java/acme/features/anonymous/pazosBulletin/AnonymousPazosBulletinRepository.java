
package acme.features.anonymous.pazosBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import acme.entities.bulletin.PazosBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousPazosBulletinRepository extends AbstractRepository {

	@Query("select p from PazosBulletin p")
	Collection<PazosBulletin> findMany();
=======
import acme.entities.bulletin.Pazosbulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousPazosBulletinRepository extends AbstractRepository {

	@Query("select p from Pazosbulletin p")
	Collection<Pazosbulletin> findMany();
>>>>>>> branch 'master' of https://github.com/frarosrod2/D02-Simple-Reporting.git

}
