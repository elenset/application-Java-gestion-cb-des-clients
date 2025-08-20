# Application de Gestion des Comptes Bancaires

## Description du Projet

Cette application Java a été développée dans le cadre d'un exercice de Programmation Orientée Objet. Elle permet de gérer les comptes bancaires des clients avec des fonctionnalités de base comme les dépôts, les retraits et l'affichage des informations de compte.

Le projet illustre les concepts fondamentaux de la POO en Java, notamment l'encapsulation, les constructeurs, les getters/setters, et la gestion des données privées.

## Structure du Projet

Le projet est composé de deux classes principales :

### 1. Classe `Compte`
Cette classe représente un compte bancaire avec les caractéristiques suivantes :

**Attributs privés :**
- `num` (long) : Numéro unique du compte
- `nomClient` (String) : Nom du propriétaire du compte
- `solde` (double) : Solde actuel du compte

**Méthodes principales :**
- Constructeurs (par défaut et avec paramètres)
- Getters et setters pour tous les attributs
- `afficherCompteInfo()` : Affiche les détails du compte
- `deposer(double montant)` : Effectue un dépôt sur le compte
- `retirer(double montant)` : Effectue un retrait avec vérification du solde

### 2. Classe `GestionComptesApp`
Cette classe contient la méthode `main` et sert à tester toutes les fonctionnalités de la classe `Compte`. Elle démontre :
- La création de comptes avec différents constructeurs
- Les opérations de dépôt et de retrait
- La gestion des erreurs (solde insuffisant, montants invalides)

## Fonctionnalités Implémentées

### ✅ Gestion des Comptes
- Création de comptes bancaires avec numéro, nom du client et solde initial
- Affichage détaillé des informations de compte
- Encapsulation complète des données (attributs privés)

### ✅ Opérations Bancaires
- **Dépôt** : Ajout de fonds au compte avec validation du montant
- **Retrait** : Soustraction de fonds avec vérification du solde disponible
- Messages informatifs pour chaque opération

### ✅ Sécurité et Validation
- Vérification du solde avant autorisation des retraits
- Validation des montants (pas de montants négatifs)
- Messages d'erreur clairs pour les opérations invalides

## Comment Utiliser l'Application

### Prérequis
- Java JDK 8 ou version supérieure installé
- Un terminal ou invite de commande

### Étapes d'Exécution

1. **Compilation des fichiers Java :**
   ```bash
   javac *.java
   ```

2. **Exécution de l'application :**
   ```bash
   java GestionComptesApp
   ```

### Exemple de Sortie Attendue
```
=== Application de Gestion des Comptes Bancaires ===

Compte 1 créé avec constructeur par défaut:
Numéro de compte: 123456
Nom du client: Ahmed Alami
Solde: 5000.0 DH

Compte 2 créé avec constructeur paramétré:
Numéro de compte: 789012
Nom du client: Fatima Benali
Solde: 3500.0 DH

=== Opérations sur le compte 1 ===
Dépôt de 1000.0 DH effectué. Nouveau solde: 6000.0 DH
Retrait de 2000.0 DH effectué. Nouveau solde: 4000.0 DH
Solde insuffisant. Solde actuel: 4000.0 DH
```

## Concepts POO Illustrés

### Encapsulation
- Tous les attributs sont déclarés `private`
- Accès contrôlé via les méthodes getters et setters
- Protection des données contre les modifications non autorisées

### Constructeurs
- **Constructeur par défaut** : Permet la création d'objets vides
- **Constructeur paramétré** : Initialise directement les attributs lors de la création

### Méthodes d'Instance
- Chaque compte possède ses propres méthodes pour gérer son état
- Les opérations modifient l'état interne de l'objet de manière contrôlée

## Extensions Possibles

Pour enrichir cette application, vous pourriez ajouter :

- **Historique des transactions** : Enregistrer tous les mouvements de fonds
- **Types de comptes** : Comptes courants, épargne, etc.
- **Intérêts** : Calcul automatique des intérêts
- **Frais bancaires** : Déduction de frais sur certaines opérations
- **Interface utilisateur** : GUI avec JavaFX ou Swing
- **Persistance des données** : Sauvegarde dans un fichier ou base de données
- **Authentification** : Système de mot de passe pour sécuriser les comptes

## Auteur

Développé dans le cadre du cours de Programmation Orientée Objet Java 2022
Professeur : Mr. Abdelmajid BOUSSELHAM

---

*Cette application démontre l'implémentation pratique des concepts fondamentaux de la POO en Java, en particulier l'encapsulation et la gestion d'état des objets dans un contexte bancaire simplifié.*