INSERT INTO adherent (statut, prix_adhesion, nombre_livre_pret, duree) VALUES
('Etudiant', 10000.00, 3, 10),
('Enseignant', 20000.00, 5, 20),
('Professionnel', 25000.00, 4, 15);

INSERT INTO type_pret (type_pret) VALUES
('Sur place'),
('A domicile');


INSERT INTO statut_membre (statut) VALUES
('Actif'),
('Inactif');

INSERT INTO type_mouvement_membre (type_mouvement) VALUES
('Inscription'),
('Réinscription');