<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>PlayStews</title>
</head>
<body>
<h1>PlayStews</h1><hr>
<h4>Платформы для всех</h4>
<form action="/" method="get">
    Поиск по названию платформы: <label>
        <input type="text" name="title">
    </label><br>
    <input type="submit" value="Поиск"/>
</form>

<table border="1">
    <tr>
        <th>Название</th>
        <th>Описание</th>
        <th>Адрес IP</th>
        <th>Порт платфомы</th>
        <th>Управление платформой</th>
    </tr>
    <#list systems as system>
        <tr>
            <th>${system.title}</th>
            <th>${system.descriptionPlatform}</th>
            <th>${system.ipAddressPlatform}</th>
            <th>${system.portPlatform}</th>
            <th><a href="/admin/stewart/edit/${system.id}">Редактирование</a></th>
        </tr>
    <#else>
        <h3>Систем нет</h3>
    </#list>
</table>
<#list stewarts as stewart>
    <div>
        <p><b>${stewart.title}</b> ${stewart.descriptionPlatform} | <a href="/stewart/${stewart.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Платформ нет</h3>
</#list>
<hr>
<a href="/admin">Панель администратора</a>
<h3>Создать новую платформу</h3>
<form action="/stewart/create" method="post">
    Название платформы: <label>
        <input type="text" name="title"/>
    </label><br><br>
    Описание патформы: <label>
        <input type="text" name="descriptionPlatform"/>
    </label><br><br>
    Адрес IP: <label>
        <input type="number" name="ipAddressPlatform"/>
    </label><br><br>
    Порт: <label>
        <input type="text" name="portPlatform"/>
    </label><br><br>
    <label>
    <input type="submit" value="Добавить платформу"/>
    </label><br><br>
</form>
</body>
</html>