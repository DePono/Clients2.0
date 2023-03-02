<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1>
<hr>
<h4>Панель администратора</h4>
<table border="1">
    <tr>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Email</th>
        <th>Номер телефона</th>
        <th>Управление аккаунтом</th>
    </tr>
    <#list clients as client>
        <tr>
            <th>${client.lastName}</th>
            <th>${client.firstName}</th>
            <th>${client.email}</th>
            <th>${client.phoneNumber}</th>
            <th><a href="/admin/client/edit/${client.id}">Редактирование</a></th>
        </tr>
    <#else>
        <h3>Клиентов нет</h3>
    </#list>
</table>
</body>
</html>