<%@page language="java"%>

<%@taglib prefix="jstl" uri= "http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:form readonly="true">
	<acme:form-textbox code="administrator.sysconfig.form.label.spamwords" path="spamwords"/>
	<acme:form-textbox code="administrator.sysconfig.form.label.threshold" path="threshold"/>
	
	<acme:form-return code="administrator.sysconfig.form.button.return" />	
</acme:form>