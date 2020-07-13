
package acme.features.anonymous.rosaBulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

<<<<<<< HEAD
import acme.entities.bulletin.RosaBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/rosa-bulletin/")
public class AnonymousRosaBulletinController extends AbstractController<Anonymous, RosaBulletin> {
=======
import acme.entities.bulletin.Rosabulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/rosabulletin/")
public class AnonymousRosaBulletinController extends AbstractController<Anonymous, Rosabulletin> {
>>>>>>> branch 'master' of https://github.com/frarosrod2/D02-Simple-Reporting.git

	@Autowired
	private AnonymousRosaBulletinListService	listService;

	@Autowired
	private AnonymousRosaBulletinCreateService	createService;


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
