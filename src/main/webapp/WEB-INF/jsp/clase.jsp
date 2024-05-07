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
                            <form:label path="nombre">Clase:</form:label>
                            <form:input path="nombre" type="text" class="form-control" required="required" />
                            <form:errors path="nombre" cssClass="text-warning" />
						</fieldset>

                        <fieldset class="form-group">
                            <form:label path="docente">Docente:</form:label>
                            <form:input path="docente" type="text" class="form-control" required="required" />
                            <form:errors path="docente" cssClass="text-warning" />
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <form:label path="salon">Salon:</form:label>
                            <form:input path="salon" type="text" class="form-control" required="required" />
                            <form:errors path="salon" cssClass="text-warning" />
                        </fieldset>
                        
                        <fieldset class="form-group">
                            <form:label path="horario">Horario:</form:label>
                            <form:input path="horario" type="number" class="form-control" required="required" />
                            <form:errors path="horario" cssClass="text-warning" />
                        </fieldset>
                        
						<fieldset class="form-group">
						    <form:label path="estado">Estado:</form:label>
						    <form:select path="estado" class="form-control" required="required">
						        <form:option value="">Selecciona un estado</form:option>
						        <form:options items="${estados}" itemValue="id" itemLabel="nombre" />
						    </form:select>
						    <form:errors path="estado" cssClass="text-warning" />
						</fieldset>



                        <button type="submit" class="btn btn-success">Guardar</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
	
<%@ include file="common/footer.jsp"%>