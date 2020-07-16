<%@page language="java" %>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags" %>

<acme:form>
	<acme:form-textbox code="authenticated.technologyrecord.form.label.title" path="title"/>
	<acme:form-textbox code="authenticated.technologyrecord.form.label.activitySector" path="activitySector"/>
	<acme:form-textbox code="authenticated.technologyrecord.form.label.inventor" path="invenntor"/>
	<acme:form-textbox code="authenticated.technologyrecord.form.label.description" path="description"/>
	<acme:form-textbox code="authenticated.technologyrecord.form.label.website" path="website"/>
	<acme:form-textbox code="authenticated.technologyrecord.form.label.email" path="email"/>
	<acme:form-textbox code="authenticated.technologyrecord.form.label.openSource" path="openSource"/>
	<acme:form-textbox code="authenticated.technologyrecord.form.label.stars" path="stars"/>
	
	<acme:form-return code="authenticated.technologyrecord.form.button.return" />	
</acme:form> 