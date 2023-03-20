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
<h4>Подробная информация о комании</h4>
<b>Название компании: </b>${company.title}<br>
<b>Описание компании: </b>${company.description}<br>
<b>Город: </b>${company.city}<br>
<b>Почта: </b>${company.email}<br>
<b>Телефон: </b>${company.phone}<br>
<hr>
<form action="/company/delete/${company.id}" method="post">
    <input type="submit" value="Удалить компанию"/>
</form>
</body>
</html>