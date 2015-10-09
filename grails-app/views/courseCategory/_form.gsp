<%@ page import="nba_vit.CourseCategory" %>



<div class="fieldcontain ${hasErrors(bean: courseCategoryInstance, field: 'category', 'error')} ">
	<label for="category">
		<g:message code="courseCategory.category.label" default="Category" />
		
	</label>
	<g:textField name="category" value="${courseCategoryInstance?.category}"/>
</div>

