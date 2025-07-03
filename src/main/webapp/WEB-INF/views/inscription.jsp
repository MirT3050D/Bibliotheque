<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Inscription Membre</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/inscription.css">
</head>
<body>
<div class="form-container">
    <h2>Inscription Membre</h2>

    <form action="/membre/save" method="post">
        <label for="nom">Nom :</label>
        <input type="text" id="nom" name="nom" required>

        <label for="prenom">Prénom :</label>
        <input type="text" id="prenom" name="prenom" required>

        <label for="numTel">Numéro de téléphone :</label>
        <input type="text" id="numTel" name="numTel" required>

        <label for="adresseMail">Adresse mail :</label>
        <input type="email" id="adresseMail" name="adresseMail" required>

        <label for="mdp">Mot de passe :</label>
        <input type="password" id="mdp" name="mdp" required>

        <label for="idStatus">Statut :</label>
        <select name="idStatus" id="idStatus" required>
            <c:forEach var="s" items="${statuts}">
                <option value="${s.id}">${s.statut}</option>
            </c:forEach>
        </select>

        <button type="submit">S'inscrire</button>
    </form>
</div>
</body>
</html>
