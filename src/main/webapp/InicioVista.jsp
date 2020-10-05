<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario</title>
<link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
</head>
<body>
<h1 id="title" class="color1">Formulario para rellenar</h1>

<h2>Nuevo Alumno</h2>
				<!--
					Path absoluto al dominio
				-->
				<form action="<%=request.getContextPath()%>/alumno/nuevo">
					<div>
						<input type="text" name="nombre" placeholder="Nombre" value="nombre" />
					</div>
					<div>
						<select name="curso">
							<c:forEach var="itemCurso" items="${arrCursos}">
								<c:choose>
									<c:when test="${itemCurso==curso}">
										<option value='${itemCurso}' selected='selected'>${itemCurso}</option>
									</c:when>
									<c:otherwise>
										<option value='${itemCurso}'>${itemCurso}</option>
									</c:otherwise>
								</c:choose>				
							</c:forEach>
						</select>
					</div>
					<div>
						<input type="submit" value="Enviar" name="btnEnviar" />
					</div>
					
					<div>${mensaje}</div>
					<ul>
						<c:forEach var="itemAsignatura" items="${lstAsignaturas}">
							<li>${itemAsignatura}</li>
						</c:forEach>
					</ul>
				</form>
			
</body>
</html>