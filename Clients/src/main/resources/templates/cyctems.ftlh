<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Список систем</h4>
<form action="/" method="get">
    Поиск по системам: <label>
        <input type="text" name="title">
    </label><br>
    <input type="submit" value="Поиск"/>
</form>
<#list cyctems as cyctem>
    <div>
        <p><b>${cyctem.title}</b> <a href="/cyctem/${cyctem.id}">Подробнее...</a></p>
    </div>
<#else>
    <h3>Систем нет</h3>
</#list>
</body>
</html>