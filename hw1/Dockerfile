# Устанавливаем образ, содержащий JDK
FROM openjdk:latest
# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /usr/src/app
# Копируем исходный код приложения внутрь контейнера
COPY ./src/main/java .
# Компилиоуем Java исходный код
RUN javac -sourcepath . -d out ./task/console/Main.java
# Теперь рабочая директория - директория с файлами .class
WORKDIR /usr/src/app/out
# CMD java -classpath . task.console.Main
ENTRYPOINT ["java", "task.console.Main"]
