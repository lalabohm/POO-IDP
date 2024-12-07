<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Usuários</title>
</head>
<body>
    <h1>Lista de Usuários</h1>
    <form action="usuarios" method="post">
        Nome: <input type="text" name="nome"><br>
        Email: <input type="email" name="email"><br>
        Senha: <input type="password" name="senha"><br>
        <button type="submit">Adicionar Usuário</button>
    </form>
    <h2>Lista de Usuários:</h2>
    <ul>
        <c:forEach var="usuario" items="${usuarios}">
            <li>${usuario.nome} - ${usuario.email}</li>
        </c:forEach>
    </ul>
</body>
</html>
