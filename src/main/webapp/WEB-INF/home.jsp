<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

	<div class="container">

		<div class="row my-2">
			<div class="col-12">
				<h3>Bodega - Tienda de Zapatos</h3>
			</div>
		</div>

		<form name="frm"  id="frm" action="/" method="POST">

			<div class="row">
				<div class="col-12">
					id <br> <input type="number" name="producto" id="producto" value="0">
				</div>
			</div>

			<div class="row">
				<div class="col-12">
					Region <br> <select name="region" id="region">
						<option value="0">Seleccione...</option>
						<c:forEach var="data" items="${regiones}">
							<option value="${data.id}">${data.nombre}</option>
						</c:forEach>
					</select>
				</div>
			</div>

			<div class="row">
				<div class="col-12">
					Comuna <br> <select name="comuna" id="comuna">
						<option value="0">Seleccione...</option>
						<c:forEach var="data" items="${comunas}">
							<option value="${data.id}">${data.nombre}</option>
						</c:forEach>
					</select>
				</div>
			</div>


			<div class="row">
				<div class="col-12">
					Bodega <br> <select name="bodega" id="bodega">
						<option value="0">Seleccione...</option>
						<c:forEach var="data" items="${bodegas}">
							<option value="${data.id}">${data.nombre}</option>
						</c:forEach>
					</select>
				</div>
			</div>

			<div class="row my-3">
				<div class="col-12">
					<button type="submit" id="buscar">Buscar </button>
				</div>
			</div>

		</form>


	</div>

	<br>
	<div class="container">
		<div class="row">
			<div class="col-12">
				<table width="100%">
					<tr>
						<td>Id</td>
						<td>Region</td>
						<td>Comuna</td>
						<td>Bodega</td>
						<td>Producto</td>
					</tr>
					<c:forEach  var="dato" items="${listado}">
					<tr>
					    <td><c:out value="${dato.getId() }" /></td>
					    <td><c:out value="${dato.getRegion().getNombre()}" /></td>
				        <td><c:out value="${dato.getComuna().getNombre()}" /></td>
				        <td><c:out value="${dato.getBodega().getNombre()}" /></td>
				        <td><c:out value="${dato.getProducto().getNombre()}" /></td>
					</c:forEach>
					
					</tr>
              
				</table>
			</div>
		</div>
	</div>

<br>
 <div id="feedback"></div>
 <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<script>
$(document).ready( function (){
	$("#buscar").click( function(){
		event.preventDefault();
		//var idProducto = document.getElementById("id").value;
		var idProducto = $("#producto").val();
		if( idProducto.length == 0 ) {
			idProducto = 0;
			$("#producto").val(0);
		}

		var region = $("#region option:selected" ).val();
		var comuna = $("#comuna option:selected" ).val();
		var bodega = $("#bodega option:selected" ).val();

		if( idProducto == 0 && region == 0 && comuna == 0 && bodega == 0  ) {
			alert("debe ingresar al menos un valor");
			return false;
		}
		
		$("#frm").submit();
		
		
});
	/*
   alert("jquery");
   $("#region").change(function() {
	   alert( "Handler for .change() called." );
	   var opcion = $("#region option:selected" ).val();
	   alert( opcion);
	   event.preventDefault();
       fire_ajax_submit( opcion );
	   
   });
	   */
});

function fire_ajax_submit( opcion ) {
     

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "/api/search",
        data: JSON.stringify(opcion),
        dataType: 'json',
        cache: false,
        timeout: 600000,
        success: function (data) {

            var json = "<h4>Ajax Response</h4>&lt;pre&gt;"
                + JSON.stringify(data, null, 4) + "&lt;/pre&gt;";
            $('#feedback').html(json);

            console.log("SUCCESS : ", data);
           // $("#btn-search").prop("disabled", false);

        },
        error: function (e) {

            var json = "<h4>Ajax Response ERROR</h4>&lt;pre&gt;"
                + e.responseText + "&lt;/pre&gt;";
            $('#feedback').html(json);

            console.log("ERROR : ", e);
           // $("#btn-search").prop("disabled", false);

        }
    });

}
</script>
</body>

</html>