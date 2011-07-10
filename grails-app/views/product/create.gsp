<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Sugestão de Produto</title>
</head>
<body>
  <div class="body">
    <h1>Sugestão de Produto</h1>
	<g:hasErrors>
	  <div class="errors">
		<g:renderErrors bean="${productInstance}" as="list" />
	  </div>
	</g:hasErrors>
	    
    <g:uploadForm action="save">
      <g:textField name="name"/>
      <g:select name="category" from="${categories}" optionKey="id" optionValue="name" noSelection="${['null':'Categoria...']}"/>
      <g:submitButton name="submit" value="Cadastrar"/>
    </g:uploadForm>
  </div>
</body>
</html>