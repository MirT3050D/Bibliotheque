CREATE DATABASE IF NOT EXISTS bibliotheque;
USE bibliotheque;

-- LIVRE
CREATE TABLE livre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titre VARCHAR(255),
    auteur VARCHAR(255),
    editeur VARCHAR(255),
    annee_publication YEAR,
    ibns VARCHAR(20),
    langue VARCHAR(50),
    resume TEXT
);

-- ADHERENT
CREATE TABLE adherent (
    id INT AUTO_INCREMENT PRIMARY KEY,
    statut VARCHAR(50),
    prix_adhesion DECIMAL(10,2),
    nombre_livre_pret INT,
    duree INT
);

-- STOCK LIVRE
CREATE TABLE stock_livre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_livre INT,
    nombre_exemplaire INT,
    FOREIGN KEY (id_livre) REFERENCES livre(id)
);

-- HISTORIQUE PRET
CREATE TABLE historique_pret (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_type_pret INT,
    id_livre INT,
    id_adherent INT,
    date_emprunt DATE,
    date_retour DATE,
    nombre_exemplaire INT,
    FOREIGN KEY (id_livre) REFERENCES livre(id),
    FOREIGN KEY (id_adherent) REFERENCES adherent(id),
    FOREIGN KEY (id_type_pret) REFERENCES type_pret(id)
);

-- TYPE PRET
CREATE TABLE type_pret (
    id INT AUTO_INCREMENT PRIMARY KEY,
    type_pret VARCHAR(100)
);

-- TYPE STATUT RESERVATION
CREATE TABLE type_statut_reservation (
    id INT AUTO_INCREMENT PRIMARY KEY,
    statut VARCHAR(100)
);

-- HISTORIQUE DEMANDE RESERVATION
CREATE TABLE historique_demande_reservation (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_adherent INT,
    id_livre INT,
    nombre_exemplaire INT,
    date_reservation DATE,
    date_demande DATE,
    id_statut INT,
    FOREIGN KEY (id_adherent) REFERENCES adherent(id),
    FOREIGN KEY (id_livre) REFERENCES livre(id),
    FOREIGN KEY (id_statut) REFERENCES type_statut_reservation(id)
);

-- HISTORIQUE RESERVATION
CREATE TABLE historique_reservation (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_adherent INT,
    id_livre INT,
    nombre_exemplaire INT,
    date_reservation DATE,
    FOREIGN KEY (id_adherent) REFERENCES adherent(id),
    FOREIGN KEY (id_livre) REFERENCES livre(id)
);

-- CATEGORIE
CREATE TABLE categorie (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom_categorie VARCHAR(100),
    description TEXT
);

-- CATEGORIE_LIVRE
CREATE TABLE categorie_livre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_livre INT,
    id_categorie INT,
    PRIMARY KEY (id_livre, id_categorie),
    FOREIGN KEY (id_livre) REFERENCES livre(id),
    FOREIGN KEY (id_categorie) REFERENCES categorie(id)
);

-- PENALITE
CREATE TABLE penalite (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_adherent INT,
    jour_min INT,
    jour_max INT,
    nb_jour_penalite INT,
    FOREIGN KEY (id_adherent) REFERENCES adherent(id)
);

-- HISTORIQUE PENALITE
CREATE TABLE historique_penalite (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_historique_pret INT,
    id_penalite INT,
    date DATE,
    FOREIGN KEY (id_historique_pret) REFERENCES historique_pret(id),
    FOREIGN KEY (id_penalite) REFERENCES penalite(id)
);

-- HISTORIQUE INSCRIPTION
CREATE TABLE historique_inscription (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    num_tel VARCHAR(20),
    adresse_mail VARCHAR(100),
    date_inscription DATE,
    date_fin_inscription DATE
);

-- HISTORIQUE REINSCRIPTION
CREATE TABLE historique_reinscription (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_membre INT,
    date_reinscription DATE,
    date_fin_reinscription DATE,
    FOREIGN KEY (id_membre) REFERENCES historique_inscription(id)
);

-- HISTORIQUE LIVRE RECU
CREATE TABLE historique_livre_recu (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pret INT,
    date_reception DATE,
    FOREIGN KEY (id_pret) REFERENCES historique_pret(id)
);

-- STATUT MEMBRE
CREATE TABLE statut_membre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    statut VARCHAR(100)
);

-- MEMBRE
CREATE TABLE membre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    num_tel VARCHAR(20),
    adresse_mail VARCHAR(100),
    mdp VARCHAR(255),
    id_adherent INT,
    id_status INT,
    FOREIGN KEY (id_adherent) REFERENCES adherent(id),
    FOREIGN KEY (id_status) REFERENCES statut_membre(id)
);

-- TYPE MOUVEMENT MEMBRE
CREATE TABLE type_mouvement_membre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    type_mouvement VARCHAR(100)
);

-- MOUVEMENT MEMBRE
CREATE TABLE mouvement_membre (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_membre INT,
    id_type_mouvement INT,
    FOREIGN KEY (id_membre) REFERENCES membre(id),
    FOREIGN KEY (id_type_mouvement) REFERENCES type_mouvement_membre(id)
);

-- STATUT DEMANDE PROLONGEMENT
CREATE TABLE statut_demande_prolongement (
    id INT AUTO_INCREMENT PRIMARY KEY,
    statut VARCHAR(100)
);

-- HISTORIQUE DEMANDE PROLONGEMENT
CREATE TABLE historique_demande_prolongement (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pret INT,
    date_demande DATE,
    date_retour DATE,
    id_statut INT,
    FOREIGN KEY (id_pret) REFERENCES historique_pret(id),
    FOREIGN KEY (id_statut) REFERENCES statut_demande_prolongement(id)
);

-- HISTORIQUE PROLONGEMENT
CREATE TABLE historique_prolongement (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_pret INT,
    date_debut DATE,
    date_retour DATE,
    FOREIGN KEY (id_pret) REFERENCES historique_pret(id)
);

-- ADMIN
CREATE TABLE admin (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    mdp VARCHAR(255),
    num_tel VARCHAR(20),
    mail VARCHAR(100)
);
