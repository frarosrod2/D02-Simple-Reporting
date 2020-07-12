
package acme.features.anonymous.pazosBulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
import acme.entities.bulletin.PazosBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/pazos-bulletin/")
public class AnonymousPazosBulletinController extends AbstractController<Anonymous, PazosBulletin> {
=======
import acme.entities.bulletin.Pazosbulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/pazosbulletin/")
public class AnonymousPazosBulletinController extends AbstractController<Anonymous, Pazosbulletin> {
>>>>>>> branch 'master' of https://github.com/frarosrod2/D02-Simple-Reporting.git

	@Autowired
	private AnonymousPazosBulletinListService	listService;

	@Autowired
	private AnonymousPazosBulletinCreateService	createService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
