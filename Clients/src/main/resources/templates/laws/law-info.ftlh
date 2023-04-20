<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Подробная информация о законах</h4>
<b>Тип: </b>${laws.id}<br>
<b>Время создания: </b>${laws.description}<br>
<b>Время запуска: </b>${laws.condition}<br>
<hr>
<form action="/laws/delete/${laws.id}" method="post">
    <input type="submit" value="Удалить закон"/>
</form>
<#list stewarts as stewart>
    <div>
        <p><b>${stewart.port}</b> <a href="/client/${stewart.port}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Клиентов нет</h3>
</#list>
</body>
</html>