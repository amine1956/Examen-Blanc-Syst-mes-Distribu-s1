# Examen Blanc : Systèmes Distribués
On souhaite créer un système distribué basé sur les micro-services en utilisant une architecture pilotée
par les événements respectant les deux patterns Event Sourcing et CQRS. Cette application devrait
permettre de gérer les infractions concernant des véhicules suites à des dépassement de vitesses
détectés par des radars automatiques. Le système se compose de trois micro-services :
• Le micro-service qui permet de gérer les radars. Chaque radar est défini par son id, sa vitesse
maximale, des coordonnées : Longitude et Latitude.
• Le micro-service d’immatriculation qui permet de gérer des véhicules appartenant des
propriétaires. Chaque véhicule appartient à un seul propriétaire. Un propriétaire est défini par
son id, son nom, sa date de naissance, son email et son email. Un véhicule est défini par son
id, son numéro de matricule, sa marque, sa puissance fiscale et son modèle.
• Le micro-service qui permet de gérer les infractions. Chaque infraction est définie par son id,
sa date, le numéro du radar qui a détecté le dépassement, le matricule du véhicule, la vitesse
du véhicule, la vitesse maximale du radar et le montant de l’infraction.
En plus des opérations classiques de consultation et de modifications de données, le système doit
permettre de poster un dépassement de vitesse qui va se traduire par une infraction. En plus, il doit
permettre à un propriétaire de consulter ses infractions.
L’application est basée sur les Framework Spring Cloud et AXON. Chaque micro-service est découplé
en deux parties indépendantes : la partie commande et la partie Query du micro-service.

En plus des modules représentant les différents micro-services, le projet utilise un module « common-
api » sous forme d’un projet maven qui déclare les composants communs aux différents projets

comme les Commandes, les Evénements, les Queries, les DTOs, etc. Dans ce module, vous pouvez
travailler avec Java ou Kotlin
Travail à faire
Rendre un rapport et le code source de l’application répondant aux questions suivantes :
1. Etablir une architecture technique du projet
2. Etablir un diagramme de classe global du projet
3. Développer le micro-service Radar
4. Développer le micro-service Immatriculation
5. Développer le micro-service Infractions
6. Mettre en place les services techniques de l’architecture micro-service (Gateway, Eureka
Discovery service)
7. Développer votre application Frontend avec Angular ou React
8. Sécuriser votre système avec un système de d’authentification OAuth2 comme Keycloak
9. Ecrire un script docker-compose.yml pour le déploiement de ce système distribué dans des
conteneurs docker.

## 1. Etablir un diagramme de classe global du projet:

![image](https://user-images.githubusercontent.com/73759527/209451610-eea1fbc8-37a5-41c9-b6ff-c82440a94047.png)


## 2. Etablir une architecture technique du projet

![image](https://user-images.githubusercontent.com/73759527/209451630-ac631e49-d9b2-4b53-a623-33760f3b40da.png)



## 3. Développer le micro-service Radar

* les dépendances principale du projet : dans tout les mecro services j'ai travaillé avec java 8 et spring version 2.5.13

![image](https://user-images.githubusercontent.com/73759527/209448502-a4417a98-2a9d-4d1b-849b-8b43c160c6e4.png)

* la configuration du fichier application.properties:

![image](https://user-images.githubusercontent.com/73759527/209448523-6decda40-010f-4ce4-8cf2-ab71259fec0f.png)

* la structure du projet :

![image](https://user-images.githubusercontent.com/73759527/209448544-51f02730-a171-4a95-a4fe-009a61aaf280.png)

* les commandes:

![image](https://user-images.githubusercontent.com/73759527/209448567-1ef732b2-9fc5-437d-9192-aa311abd498c.png)

![image](https://user-images.githubusercontent.com/73759527/209448571-6837a199-3381-423f-9891-6b58a58fbc1e.png)

![image](https://user-images.githubusercontent.com/73759527/209448579-6a33258b-4b2b-4aa4-9686-95e357238a6b.png)

* les evenments:

![image](https://user-images.githubusercontent.com/73759527/209448599-9ae4b181-8aae-4975-993f-6955e4b5d390.png)

![image](https://user-images.githubusercontent.com/73759527/209448604-4be4afcb-2af7-4a63-99ce-33ddff72737c.png)

![image](https://user-images.githubusercontent.com/73759527/209448610-b5bc95dd-1f15-4ec5-a34f-7f391b97511b.png)

* les agregats

![image](https://user-images.githubusercontent.com/73759527/209448639-2ffbb4f1-03dc-4249-9ebe-d9ca3b6b9fa1.png)

* RadarCommandeController

![image](https://user-images.githubusercontent.com/73759527/209448657-cf064cd0-5400-4dde-9fc3-141ab7c79c5a.png)


### la partie query
* les entities JPA:

![image](https://user-images.githubusercontent.com/73759527/209448699-0ba526cf-f768-4bf6-a8ad-8cf484b66698.png)

* RadarQueryController

![image](https://user-images.githubusercontent.com/73759527/209448714-85a9376d-0b11-468d-adc5-1eb5f2758119.png)

![image](https://user-images.githubusercontent.com/73759527/209448733-51faf054-776b-48a7-959a-3b1738b9529f.png)

![image](https://user-images.githubusercontent.com/73759527/209448743-741bd855-b68e-4ab1-a02d-3dc9e4b37d03.png)



## 4. Développer le micro-service Immatriculation:
* j'ai suivi les mêmes étapes du premier microservice la seule différence c'est que dans le deuxième microservice j'ai traivailé sur deux tables Vehicule et prioritaire

* la structure du projet:

![image](https://user-images.githubusercontent.com/73759527/209448866-a8398da5-2718-4dc1-bb19-ba97509ec53e.png)


![image](https://user-images.githubusercontent.com/73759527/209448883-39fa5798-8b6b-4efc-8eb8-058b0d3f760b.png)

* les entities JPA:

![image](https://user-images.githubusercontent.com/73759527/209448904-0ad104d2-bfd9-469e-b2d2-1e6d1eab56cd.png)

![image](https://user-images.githubusercontent.com/73759527/209448912-3283d755-984b-4af8-96ad-8d8ea8f83c06.png)

![image](https://user-images.githubusercontent.com/73759527/209448942-383768a6-ef52-4f46-9aad-b2ffcc857af5.png)

## 5. Développer le micro-service Infractions:ce micro-service est similaire au premier micro-service :

* resultat:

![image](https://user-images.githubusercontent.com/73759527/209449043-6374ff49-ac62-432c-8182-0ae92b8d0037.png)


![image](https://user-images.githubusercontent.com/73759527/209449066-c7ef6447-3b86-4859-a313-687d544b70ed.png)


## 6. Mettre en place les services techniques de l’architecture micro-service (Gateway, Eureka
Discovery service)


### Gateway

*  les dépandances:

![image](https://user-images.githubusercontent.com/73759527/209449102-fc53525d-00d8-4b7f-92a7-7a03cb7c9a75.png)

* le fichier application.properties

![image](https://user-images.githubusercontent.com/73759527/209449108-4ad4c0c2-4fdf-421d-9200-249acafa26ee.png)

* la class main:

![image](https://user-images.githubusercontent.com/73759527/209449122-95f8af5d-ca0e-491f-8e4b-e41d6fac3e15.png)

##  Eureka Discovery service:

* les dépandanes:

![image](https://user-images.githubusercontent.com/73759527/209449166-023ecc29-f705-47c1-bbce-f2e04eb36885.png)


* le fichier application.properties:

![image](https://user-images.githubusercontent.com/73759527/209449210-44fcd4e6-9228-4cad-82d5-e9253c81bf69.png)

* http://localhost:8761/

![image](https://user-images.githubusercontent.com/73759527/209449247-ec36ed3c-c609-480e-9f42-e9f4003ab2ca.png)

![image](https://user-images.githubusercontent.com/73759527/209449272-4da4edba-963e-4ced-90d1-b8a15c1d3721.png)


## 7. Développer votre application Frontend avec Angular ou React

* Angular: dans cette partie j'ai utilisé Angular avec Primeng et aussi primeFlex

* Angular est un framework d'application Web gratuit et open source basé sur TypeScript, dirigé par l'équipe Angular de Google et par une communauté d'individus et d'entreprises. Angular est une réécriture complète de la même équipe qui a construit AngularJS.

* PrimeNG is a collection of rich UI components for Angular. All widgets are open source and free to use under MIT License. PrimeNG is developed by PrimeTek Informatics, a vendor with years of expertise in developing open source UI solutions.

* PrimeFlex est une bibliothèque utilitaire CSS réactive et légère qui accompagne également les bibliothèques Prime UI et les pages Web statiques .

![image](https://user-images.githubusercontent.com/73759527/209449560-3658f4c8-7b2e-426b-a705-6a66c8c5c12e.png)

## listes des preoritaires et vehicule:

![image](https://user-images.githubusercontent.com/73759527/209451672-aa18ed1e-08ed-4615-a870-cf085daff147.png)






















