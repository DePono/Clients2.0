<!DOCTYPE html>
<html lang="en">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Список платформ</h4>
<#list stewarts as stewart>
    <div>
        <p><b>${stewart.port}</b> <a href="/stewart/${stewart.port}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Платформ нет</h3>
</#list>
<hr>
</body>
</html>