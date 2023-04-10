<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Список законов управления</h4>
<#list laws as law>
    <div>
        <p><b>${law.lawType}</b> <a href="/law/${law.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Законов нет</h3>
</#list>
</body>
</html>