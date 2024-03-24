# Utiliser l'image adoptopenjdk/openjdk17:alpine comme base
FROM openjdk:17-alpine

# Copier le fichier .jar de l'application dans le conteneur à l'emplacement /app
COPY target/projet_service_cloud-0.0.1-SNAPSHOT.jar /app/projet_service_cloud.jar

# Définir le répertoire de travail dans le conteneur
WORKDIR /app

# Commande pour exécuter l'application Spring Boot lorsque le conteneur démarre
CMD ["java", "-jar", "projet_service_cloud.jar"]
