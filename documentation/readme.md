# Инструкция по запуску тестов #

1. Скопируйте проект
2. Запустите базы данных, выполнив команду docker-compose up. При этом у вас уже должен быть установлен Docker
3. Запустите тестируемое приложение на базе Postgres, выполнив команду java -jar -Dspring.datasource.url=jdbc:postgresql://localhost:5432/app -Dspring.datasource.username=app -Dspring.datasource.password=pass aqa-shop.jar
4. Запустите тесты
5. Запустите приложение на базе MySQL java -jar -Dspring.datasource.url=jdbc:mysql://localhost:3306/app -Dspring.datasource.username=app -Dspring.datasource.password=pass aqa-shop.jar
6, Запустите тесты