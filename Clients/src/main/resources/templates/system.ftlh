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
    Поиск по названию системы: <label>
        <input type="text" name="title">
    </label><br>
    <input type="submit" value="Поиск"/>
</form>
<#list products as product>
    <div>
        <p><b>${product.title}</b> ${product.price} руб. | <a href="/product/${product.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Товаров нет</h3>
</#list>
<hr>
<h3>Создать новый товар</h3>
<form action="/product/create" method="post">
    Название объявления: <label>
        <input type="text" name="title"/>
    </label><br><br>
    Описание объявления: <label>
        <input type="text" name="description"/>
    </label><br><br>
    Цена: <label>
        <input type="number" name="price"/>
    </label><br><br>
    Город: <label>
        <input type="text" name="city"/>
    </label><br><br>
    Имя: <label>
        <input type="text" name="author"/>
    </label><br><br>
    <input type="submit" value="Добавить товар"/>
</form>
</body>
</html>