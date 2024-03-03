
# Maven ve OpenJDK tabanlı bir imaj kullanarak başlayın
FROM maven:3-openjdk-17-slim
# Uygulamanın çalıştırılacağı dizini oluşturun
WORKDIR /sedef/app
# Uygulamanın çalışacağı portu expose edin
EXPOSE 8080
# Derlenen JAR dosyasını kopyalayın
COPY /target/*.jar /sedef/app/app.jar

# Uygulamayı başlatmak için ENTRYPOINT belirtin
ENTRYPOINT ["java", "-jar", "app.jar"]
