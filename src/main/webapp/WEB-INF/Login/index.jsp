<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Cadastro</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Rubik:wght@300;400;500;600;700;900&display=swap" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link href="./style.css" rel="stylesheet">

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous" defer></script>
    <script src="./script.js" defer></script>
</head>
<body>
    <div class="form-text">
        <h2>Faça seu login</h2>
        <p>Informe seu e-mail e senha</p>
    </div>
    <form>
        <div class="form-group">
            <label for="formEmail">Email</label>
            <input type="email" class="form-control" id="formEmail" placeholder="Ex: roberto.porto@ucsal.edu.br" required>
        </div>
        <div class="form-group">
            <label for="formPassword">Senha</label>
            <input type="password" class="form-control" id="formPassword" placeholder="Ex: 12345" required>
        </div>
        <div class="btn-form">
            <button type="submit" class="btn btn-primary">ENTRAR</button>
        </div>
    </form>

</body>
</html>