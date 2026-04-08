# Application-Builder

Ссылка на утилиты: https://disk.yandex.ru/d/5WZudjxqOaKm7Q

## 1. Установка java (File->Project stricture -> Project -> в поле SDK выбрать Download sdk -> выбрать версию 21, microsoft openJDK 21.0.10)

## 2. Установка БД (файл postgresql-17.0-rc1-windows-x64)

В процессе установки выбрать следующие логин и пароль для супер юзера:
username=postgres
password=123456

## 3. Установка графической среды для работы с БД Pgadmin (pgadmin4-8.11-x64)

## 4. Установка среды (ideaIC-2023.3.7)

## 5. Для выгрузки проекта из репозитория выполнить команду в консоли из папки проекта
```
git clone https://github.com/denis20vv2/sportswear.git
```

## 6. Открыть папку проекта из IntelliJ Idea

## 7. На верхней панели выбрать "edit configurations" -> Затем "edit configurations", в открывшемся окне выбрать "Add new configuration"

![Описание скриншота](screens/Screen1.png)


затем "Application", выбрать sdk 21 и в поле "main class" прописать "SportswearApplication".

![Описание скриншота](screens/Screen2.png)

По кнопке на верхней панели "Run SportswearApplication" можно запустить проект

В случае если вылетит ошибка установки jdk, то на верхней панеели Main menu выбрать File -> Project structure,
add new sdk -> add jdk -> Указать путь к jdk-21 (Если удобнее можно установить другой пакет: download jdk -. выбрать 21 версию)

##Настройка БД
- Для настройки БД нужно зайти в pgAdmin (при входе на сервер потребуется ввести пароль супер юзера)
- Создать новую БД с названием "sportswear_db"
- Порт: 5432



