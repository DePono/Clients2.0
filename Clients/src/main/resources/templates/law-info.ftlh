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
<b>Название: </b>${law.title}<br>
<b>Время создания: </b>${law.timeCreateLaw}<br>
<b>Время запуска: </b>${law.timeUpdateLaw}<br>
<hr>
<form action="/client/delete/${law.id}" method="post">
    <input type="submit" value="Удалить закон"/>
</form>
</body>
</html>