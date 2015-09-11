<%@ page import="nba_vit.Institute" %>



<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="institute.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${instituteInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="institute.address.label" default="Address" />
		
	</label>
	<g:textField name="address" value="${instituteInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'est_date', 'error')} required">
	<label for="est_date">
		<g:message code="institute.est_date.label" default="Estdate" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="est_date" precision="day"  value="${instituteInstance?.est_date}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'vision', 'error')} ">
	<label for="vision">
		<g:message code="institute.vision.label" default="Vision" />
		
	</label>
	<g:textField name="vision" value="${instituteInstance?.vision}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'mission', 'error')} ">
	<label for="mission">
		<g:message code="institute.mission.label" default="Mission" />
		
	</label>
	<g:textField name="mission" value="${instituteInstance?.mission}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'vm_crtd_date', 'error')} required">
	<label for="vm_crtd_date">
		<g:message code="institute.vm_crtd_date.label" default="Vmcrtddate" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="vm_crtd_date" precision="day"  value="${instituteInstance?.vm_crtd_date}"  />
</div>

