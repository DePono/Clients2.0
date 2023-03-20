<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Список законов управления</h4>
<form action="/" method="get">
    Поиск по законам: <label>
        <input type="text" name="title">
    </label><br>
    <input type="submit" value="Поиск"/>
</form>
<#list laws as law>
    <div>
        <p><b>${law.title}</b> <a href="/law/${law.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Законов нет</h3>
</#list>
</body>
</html>