<%@page language="java"%>

<%@taglib prefix="jstl" uri= "http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form>
	<acme:form-url code="administrator.banner.commercialbanner.form.label.picture" path="picture"/>
	<acme:form-url code="administrator.banner.commercialbanner.form.label.sector" path="slogan"/>
	<acme:form-url code="administrator.banner.commercialbanner.form.label.targetURL" path="targetURL"/>
	<acme:form-textbox code="administrator.banner.commercialbanner.form.label.creditCard" path="creditCard"/>
	
	<acme:form-submit test="${command == 'show'}"
		code="administrator.banner.commercialbanner.form.button.update"
		action="/administrator/banners/commercial-banner/update"/>
		
	<acme:form-submit test="${command == 'show'}"
		code="administrator.banner.commercialbanner.form.button.delete"
		action="/administrator/banners/commercial-banner/delete"/>
		
	<acme:form-submit test="${command == 'create'}"
		code="administrator.banner.commercialbanner.form.button.create"
		action="/administrator/banners/commercial-banner/create"/>
		
	<acme:form-submit test="${command == 'update'}"
		code="administrator.banner.commercialbanner.form.button.update"
		action="/administrator/banners/commercial-banner/update"/>
		
	<acme:form-submit test="${command == 'delete'}"
		code="administrator.banner.commercialbanner.form.button.delete"
		action="/administrator/banners/commercial-banner/delete"/>
	
	<acme:form-return 
		code="administrator.banner.commercialbanner.form.button.return" />	
</acme:form>