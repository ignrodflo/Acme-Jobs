<%@page language="java"%>

<%@taglib prefix="jstl" uri= "http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="administrator.announcement.form.label.title" path="title"/>
	<acme:form-moment code="administrator.announcement.form.label.moment" path="moment"/>
	<acme:form-url code="administrator.announcement.form.label.moreInfo" path="moreInfo"/>
	<acme:form-textarea code="administrator.announcement.form.label.text" path="text"/>
	
	<acme:form-return code="administrator.announcement.form.button.return" />	
</acme:form>