<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Список клиентов</h4>
<#list clients as client>
    <div>
        <p><b>${client.username}</b> <a href="/client/${client.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Клиентов нет</h3>
</#list>
<hr>
</body>
</html>