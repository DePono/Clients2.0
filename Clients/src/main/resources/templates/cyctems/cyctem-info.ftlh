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
<h4>Подробная информация о системах</h4>
<b>Название: </b>${cyctem.title}<br>
<b>Описание: </b>${cyctem.description}<br>
<b>Время создания: </b>${cyctem.timeCreate}<br>
<b>Время обновления: </b>${cyctem.timeUpdate}<br>
<hr>
<#list stewarts as stewart>
    <div>
        <p><b>${stewart.title}</b> <a href="/stewart/${stewart.port}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Клиентов нет</h3>
</#list>
<form action="/cyctem/delete/${cyctem.title}" method="post">
    <input type="submit" value="Удалить систему"/>
</form>
</body>
</html>