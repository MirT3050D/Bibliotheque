<!DOCTYPE html>
<html lang="fr">

<head>
    <meta charset="UTF-8">
    <title>Page de Connexion</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
</head>

<body>
    <div class="form-container">
        <h2>Page de Connexion</h2>
        <form action="checkLogin" method="post">
            <label for="mail">Adresse mail :</label>
            <input type="email" id="mail" name="email" required>

            <label for="mdp">Mot de passe :</label>
            <input type="password" id="mdp" name="password" required>

            <button type="submit">Se connecter</button>
        </form>
    </div>
</body>

</html>