<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>Insert title here</title>
</head>
<body>
  <div class="body">
    <table width="500" cellpadding="2" cellspacing="5">
      <thead style="background:gray;color:white;">
        <tr>
          <td>Produto</td>
          <td>Categoria</td>
        </tr>
      </thead>
      <tbody>
        <g:each var="p" in="${productInstanceList}">
	      <tr>
	        <td>
	          <g:if test="${p.photo}"><img src="${p.photo}"/></g:if>
	          ${p.name}</td>
	        <td>${p.category.name}</td>
	      </tr>
        </g:each>    
      </tbody>
    </table>
    
  </div>
</body>
</html>