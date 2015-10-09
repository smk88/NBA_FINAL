<%@ page import="nba_vit.Institute" %>



<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'address', 'error')} ">
	<label for="address">
		<g:message code="institute.address.label" default="Address" />
		
	</label>
	<g:textField name="address" value="${instituteInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'establishment_date', 'error')} required">
	<label for="establishment_date">
		<g:message code="institute.establishment_date.label" default="Establishmentdate" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="establishment_date" precision="day"  value="${instituteInstance?.establishment_date}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'mission', 'error')} ">
	<label for="mission">
		<g:message code="institute.mission.label" default="Mission" />
		
	</label>
	<g:textField name="mission" value="${instituteInstance?.mission}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="institute.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${instituteInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'vision', 'error')} ">
	<label for="vision">
		<g:message code="institute.vision.label" default="Vision" />
		
	</label>
	<g:textField name="vision" value="${instituteInstance?.vision}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: instituteInstance, field: 'vm_created_date', 'error')} required">
	<label for="vm_created_date">
		<g:message code="institute.vm_created_date.label" default="Vmcreateddate" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="vm_created_date" precision="day"  value="${instituteInstance?.vm_created_date}"  />
</div>

