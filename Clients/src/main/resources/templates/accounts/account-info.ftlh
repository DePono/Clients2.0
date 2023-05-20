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
<h4>Подробная информация об аккаунтах</h4>
<b>Уровень доступа: </b>${account.title}<br>
<b>Описание возможностей: </b>${account.descriptionAccount}<br>
<b>Время подписки: </b>${account.subscriptionTime}<br>
<hr>
<#list companies as company>
    <div>
        <p><b>${company.title}</b> <a href="/company/${company.phone}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Компаний нет</h3>
</#list>
</body>
</html>