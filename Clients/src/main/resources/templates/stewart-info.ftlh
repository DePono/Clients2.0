<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Подробная информация о платформе</h4>
<b>Название платформы: </b>${stewarts.title}<br>
<b>Описание платформы: </b>${stewarts.descriptionPlatform}<br>
<b>Адрес IP: </b>${stewarts.ipAddressPlatform}<br>
<b>Порт: </b>${stewarts.portPlatform}<br>
<hr>
<form action="/stewart/delete/${stewarts.id}" method="post">
    <input type="submit" value="Удалить платформу"/>
</form>
</body>
</html>