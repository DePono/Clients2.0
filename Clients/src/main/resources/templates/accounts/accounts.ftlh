<!DOCTYPE html>
<html lang="">
<head>
    <title>PlayStew</title>
</head>
<body>
<h1>PlayStew</h1><hr>
<h4>Информация про типы аккаунтов</h4>
<#list accounts as account>
    <div>
        <p><b>${account.title}</b> | ${account.descriptionAccount}</p>
    </div>
</#list>
<hr>
</body>
</html>