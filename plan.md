# План автоматизации тестирования сервиса покупки туров #

**Тестируемое приложение:** ![aqa-shop.jar](https://github.com/netology-code/qa-diploma/blob/master/aqa-shop.jar).

**Предмет тестирования:** различные сценарии покупки тура.

**Цель тестирования:** проверить работоспособность функционала приложения, отвечающую за покупку тура.

## Перечень используемых инструментов ##

- Selenide 5.20.1;
- JUnit Jupiter 5.7.1;
- Java 11;
- Gradle;
- Allure;
- Google chrome 91.0.4472.77;
- ![симулятор банковский сервисов](https://github.com/netology-code/qa-diploma/tree/master/gate-simulator);
- mysql 8.0.25;
- postgres 13.3;
- node:10-alpine;
- docker.

Выбор данных инструментов обусловлен необходимостью обеспечения качественного написания и проведения тестов.

## Сценарии покупки тура, подлежащие автоматизации тестирования ##

**Сценарий № 1:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: произошла успешная покупка тура и получено сообщение об успешной покупке.

**Сценарий № 2:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4442";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, получено сообщение об ошибке при покупке.

**Сценарий № 3:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) оставит пустым;
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Месяц.

**Сценарий № 4:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) оставить пустым;
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Год.

**Сценарий № 5:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) оставить пустым;
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Владелец.

**Сценарий № 6:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) оставить пустым;
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля CVC/CVV.

**Сценарий № 7:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "20";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление о неверном заполнении поля CVC/CVV.

**Сценарий № 8:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: произошла успешная покупка тура и получено сообщение об успешной покупке.

**Сценарий № 9:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4442";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, получено сообщение об ошибке при покупке.

**Сценарий № 10:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) оставит пустым;
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Месяц.

**Сценарий № 11:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) оставить пустым;
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Год.

**Сценарий № 12:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) оставить пустым;
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Владелец.

**Сценарий № 13:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) оставить пустым;
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля CVC/CVV.

**Сценарий № 14:**

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- в поле ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "20";
- нажать на кнопку ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление о неверном заполнении поля CVC/CVV.

## Риски при автоматизации ##

- тестирование будет проводиться с использованием эмуляторов банковских сервисов, при работе тестируемого сервиса не с эмулятором может быть другой результат;
- из-за использования эмулятора нет возможности протестировать сервис с использованием большой выборки различных номеров карт, что снизит качество тестирования.

## Оценка сроков автоматизации ##
 
- автоматизация описанных сценариев и их запуск - 14.06.2021 г;
- отчет по автоматизации - 17.06.2021 г.