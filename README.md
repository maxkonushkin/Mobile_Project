# Проект по автоматизации мобильного приложения ["Ренессанс Банк"](https://rencredit.ru).

## :pushpin: Содержание:

- <a href="#tools">Технологии и инструменты</a>
- <a href="#allure">Пример Allure-отчета</a>
- <a href="#video1">Пример Видео с реального Андроид устройства</a>
- <a href="#video2">Пример Видео с эмулятора</a>

<a id="tools"></a>
## :computer: Использованный стек технологий

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="media/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="media/logo/Java.svg">
<img width="6%" title="Selenide" src="media/logo/Selenide.svg">
<img width="6%" title="Selenoid" src="media/logo/androidstudio.svg">
<img width="6%" title="Allure Report" src="media/logo/Allure_Report.svg">
<img width="6%" title="Gradle" src="media/logo/Gradle.svg">
<img width="6%" title="JUnit5" src="media/logo/JUnit5.svg">
<img width="6%" title="GitHub" src="media/logo/GitHub.svg">
</p>

- В данном проекте автотесты написаны на языке <code>Java</code> с использованием фреймворка для тестирования Selenide.
- В качестве сборщика был использован - <code>Gradle</code>.
- Использованы фреймворки <code>JUnit 5</code> и [Selenide](https://selenide.org/).

- ```
## Запуск автотестов

### Локальный запуск тестов из терминала

Запуск на эмуляторе через Android Studio:
```bash 
 gradle clean local.properties
```

Запуск на реальном устройстве на Андроид:
```bash 
 gradle clean emulator.properties
```

<a id="allure"></a>
## <img src="media/logo/Allure_Report.svg" title="Allure Report" width="4%"/> Пример [Allure-отчета](https://allurereport.org)


### Результат выполнения тестов

<p align="center">
<img title="Test Results in Alure" src="media/screens/Result.PNG">
</p>

<p align="center">
<img width="70%" title="Telegram Notifications" src="media/video/1.mp4">
</p>

<a id="video1"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Андроид
____
<p align="center">
<img title="Selenoid Video" src="media/video/1.gif" width="350" height="650"  alt="video">   
</p>

<a id="video2"></a>
## <img alt="Selenoid" height="25" src="images/logo/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Эмуляторе
____
<p align="center">
<img title="Selenoid Video" src="media/video/2.gif" width="350" height="650"  alt="video">   
</p>
