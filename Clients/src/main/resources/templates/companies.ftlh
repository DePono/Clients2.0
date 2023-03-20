<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Список компаний</h4>
<form action="/company" method="get">
    Поиск по компаниям: <label>
        <input type="text" name="title">
    </label><br>
    <input type="submit" value="Поиск"/>
</form>
<#list companies as company>
    <div>
        <p><b>${company.title}</b> <a href="/company/${company.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Компаний нет</h3>
</#list>
<hr>
<h3>Создать новую компанию</h3>
<form action="/company/create" th:method="post">
    Название компании: <label>
        <input type="text" name="title"/>
    </label><br><br>
    Описание компании: <label>
        <input type="text" name="description"/>
    </label><br><br>
    Город: <label>
        <input type="text" name="city"/>
    </label><br><br>
    Почта: <label>
        <input type="text" name="email"/>
    </label><br><br>
    Номер телефона: <label>
        <input type="number" name="phone"/>
    </label><br><br>
    <label for="accounts">Выберите тип аккаунта</label>
    <label>
        <select>th:object='accounts' th:field="*{id}" id="accounts">
        <option>each="accounts: "</option></select>
    </label>
    <input type="submit" value="Добавить компанию"/>
</form>
</body>
</html>