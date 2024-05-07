<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">
	<div>
			<a type="button" class="btn btn-primary btn-md" href="/add-clase">Nueva clase</a>
	</div>
	<br>
	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>Lista de Asignaturas</h3>
			
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="20%">Asignatura</th>
						<th width="20%">Descripcion</th>
						<th width="20%">Salon</th>
						<th width="20%">Horario inicio</th>
						<th width="20%">Horario fin</th>
						<th width="20%">Docente</th>
						<th width="20%"></th>
						<th width="20%"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${clases}" var="clase">
						<tr>
							<td>${clase.nombre}</td>
							<td>${clase.descripcion}</td>
							<td>${clase.salon}</td>
							<td>${clase.horarioInicio}</td>
							<td>${clase.horarioFin}</td>
							<td>${clase.docente}</td>
							<td><a type="button" class="btn btn-success" href="/update-clase?id=${clase.id}">Actualizar</a></td>
							<td><a type="button" class="btn btn-warning"href="/delete-clase?id=${clase.id}">Eliminar</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jsp"%>