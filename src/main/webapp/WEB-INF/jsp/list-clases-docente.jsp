<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>

<div class="container">

	<div class="panel panel-primary">
		<div class="panel-heading">
			<h3>Lista de Clases</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="20%">Clase</th>
						<th width="20%">Docente</th>
						<th width="20%">Horario</th>
						<th width="20%">Salon</th>
						<th width="20%">Estado</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${clases}" var="clase">
						<tr>
							<td>${clase.nombre}</td>
							<td>${clase.docente}</td>
							<td>${clase.horario}</td>
							<td>${clase.salon}</td>
							<td>${clase.estado}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
<%@ include file="common/footer.jsp"%>
