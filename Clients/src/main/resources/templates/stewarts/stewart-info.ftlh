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
<h4>Подробная информация о платформах</h4>
<b>Название: </b>${stewart.title}<br>
<b>Описание: </b>${stewart.description}<br>
<b>Адрес ИП: </b>${stewart.ipAddress}<br>
<hr>
<form action="/stewart/delete/${stewart.port}" method="post">
    <input type="submit" value="Удалить платформу"/>
</form>
</body>
</html>