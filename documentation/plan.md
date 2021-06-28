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

<details>
<summary>Сценарий № 1: Успешная покупка тура</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить" ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: произошла успешная покупка тура и получено сообщение об успешной покупке.
</details>

<details>
<summary>Сценарий № 2: Покупка не состоялась из-за отрицательного статуса при проверке карты банком</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить" ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4442";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, получено сообщение об ошибке при покупке.
</details>

<details>
<summary>Сценарий № 3: Покупка не состоялась из-за пустого поля "Месяц"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить" ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) оставит пустым;
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Месяц.
</details>

<details>
<summary>Сценарий № 4: Покупка не состоялась из-за пустого поля "Год"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить" ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) оставить пустым;
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Год.
</details>

<details>
<summary>Сценарий № 5: Покупка не состоялась из-за пустого поля "Владелец"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить" ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) оставить пустым;
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Владелец.
</details>

<details>
<summary>Сценарий № 6: Покупка не состоялась из-за пустого поля "CVC/CVV"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить" ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) оставить пустым;
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля CVC/CVV.
</details>

<details>
<summary>Сценарий № 7: Покупка не состоялась из-за не верно заполненного поля "CVC/CVV"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить" ![Купить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D0%BD%D0%BE%D0%BF%D0%BA%D0%B0%20%D0%BA%D1%83%D0%BF%D0%B8%D1%82%D1%8C.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV.png) внести "20";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C.png);

Ожидаемый результат: покупка не произошла, показано уведомление о неверном заполнении поля CVC/CVV.
</details>

<details>
<summary>Сценарий № 8: Успешная покупка тура в кредит</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить в кредит" ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: произошла успешная покупка тура и получено сообщение об успешной покупке.
</details>

<details>
<summary>Сценарий № 9: Покупка в кредит не состоялась из-за отрицательного статуса при проверке карты банком</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить в кредит" ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4442";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, получено сообщение об ошибке при покупке.
</details>

<details>
<summary>Сценарий № 10: Покупка в кредит не состоялась из-за пустого поля "Месяц"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить в кредит" ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) оставит пустым;
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Месяц.
</details>

<details>
<summary>Сценарий № 11: Покупка в кредит не состоялась из-за пустого поля "Год"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить в кредит" ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) оставить пустым;
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Год.
</details>

<details>
<summary>Сценарий № 12: Покупка в кредит не состоялась из-за пустого поля "Владелец"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить в кредит" ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) оставить пустым;
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "999";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля Владелец.
</details>

<details>
<summary>Сценарий № 13: Покупка в кредит не состоялась из-за пустого поля "CVC/CVV"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить в кредит" ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) оставить пустым;
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление об обязательно заполнении поля CVC/CVV.
</details>

<details>
<summary>Сценарий № 14: Покупка в кредит не состоялась из-за не верно заполненного поля "CVC/CVV"</summary>

Шаги:
- запустить приложение aqa-shop.jar;
- перейти на http://localhost:8080;
- нажать на кнопку "Купить в кредит" ![Купить в кредит](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9A%D1%83%D0%BF%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);
- в поле "Номер карты" ![Номер карты](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9D%D0%BE%D0%BC%D0%B5%D1%80%20%D0%BA%D0%B0%D1%80%D1%82%D1%8B%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "4444 4444 4444 4441";
- в поле "Месяц" ![Месяц](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9C%D0%B5%D1%81%D1%8F%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "08";
- в поле "Год" ![Год](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%93%D0%BE%D0%B4%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "22";
- в поле "Владелец" ![Владелец](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%92%D0%BB%D0%B0%D0%B4%D0%B5%D0%BB%D0%B5%D1%86%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "Ivanov Ivan";
- в поле "CVC/CVV" ![CVV](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/CVV%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png) внести "20";
- нажать на кнопку "Продолжить" ![Продолжить](https://github.com/Kolobokes/Diploma/blob/8f60810ca73eba51949167b4c3dbef26eabb95a1/pictures/%D0%9F%D1%80%D0%BE%D0%B4%D0%BE%D0%BB%D0%B6%D0%B8%D1%82%D1%8C%20%D0%B2%20%D0%BA%D1%80%D0%B5%D0%B4%D0%B8%D1%82.png);

Ожидаемый результат: покупка не произошла, показано уведомление о неверном заполнении поля CVC/CVV.
</details>

## Риски при автоматизации ##

- тестирование будет проводиться с использованием эмуляторов банковских сервисов, при работе тестируемого сервиса не с эмулятором может быть другой результат;
- из-за использования эмулятора нет возможности протестировать сервис с использованием большой выборки различных номеров карт, что снизит качество тестирования.

## Оценка сроков автоматизации ##
 
- автоматизация описанных сценариев и их запуск - 14.06.2021 г;
- отчет по автоматизации - 17.06.2021 г.