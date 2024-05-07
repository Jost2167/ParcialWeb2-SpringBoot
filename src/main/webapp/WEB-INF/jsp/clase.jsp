<%@ include file="common/header.jsp"%>
<%@ include file="common/navigation.jsp"%>


<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Adicionar Clase</div>
                <div class="panel-body">
                    <form:form method="post" modelAttribute="clase">
						
						
						
						<fieldset class="form-group">
                            <form:label path="nombre">Asignatura:</form:label>
                            <form:input path="nombre" type="text" class="form-control" required="required" />
                            <form:errors path="nombre" cssClass="text-warning" />
						</fieldset>

						<fieldset class="form-group">
							<form:label path="descripcion">Descripcion</form:label>
							<form:input path="descripcion" type="text" class="form-control"
								required="required" />
							<form:errors path="descripcion" cssClass="text-warning" />
						</fieldset>
						
						 <fieldset class="form-group">
                            <form:label path="salon">Salon:</form:label>
                            <form:input path="salon" type="number" class="form-control" required="required" />
                            <form:errors path="salon" cssClass="text-warning" />
                        </fieldset>

						<fieldset class="form-group">
                            <form:label path="horarioInicio">Horario inicio:</form:label>
                            <form:input path="horarioInicio" type="text" class="form-control" required="required" />
                            <form:errors path="horarioInicio" cssClass="text-warning" />
						</fieldset>
						
						<fieldset class="form-group">
                            <form:label path="horarioFin">Horario fin:</form:label>
                            <form:input path="horarioFin" type="text" class="form-control" required="required" />
                            <form:errors path="horarioFin" cssClass="text-warning" />
						</fieldset>
   
						<fieldset class="form-group">
						    <form:label path="docente">Docente:</form:label>
						    <form:select path="docente" class="form-control" required="required">
						        <form:option value="">Selecciona un docente</form:option>
						        <form:options items="${docentes}" itemValue="nombre" itemLabel="nombre" />
						    </form:select>
						    <form:errors path="docente" cssClass="text-warning" />
						</fieldset>

                        <button type="submit" class="btn btn-success">Guardar</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
	
<%@ include file="common/footer.jsp"%>