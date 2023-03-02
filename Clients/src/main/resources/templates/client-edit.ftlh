<!DOCTYPE html>
<html>
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h3>Редактирование клиента ${client.firstName}</h3>
<form action="/admin/client/edit" method="post">
    <input type="hidden" value="${client.id}" name="userId">
    <button type="submit">Сохранить</button>
</form>
</body>
</html>