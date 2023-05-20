<!DOCTYPE html>
<html lang="en">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Информация об уровнях доступа</h4>
<#list accounts as account>
    <div>
        <p><b>${account.title}</b> <a href="/account/${account.title}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Компаний нет</h3>
</#list>
</body>
</html>