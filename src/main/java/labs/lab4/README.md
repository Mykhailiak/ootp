### Домен

Система описує проєкт регуляції температури в будинку за допомогою приладів. Також є можливість отримати інфорацію по кожному з девайсів.
Прилади: автоматика відкривання вікон і штор, вентилятор, обігрівач.

### MacroCommands

- Пакети: `commands`.
- Основний клас: `MacroCommad`
- Похідні класи `Command` утилізують в собі якусь одну дію.
- Команди мають два методи: `execute` i `undo` для початку операції й відміни.
- `MacroCommand` дозволяє згрупувати окремі команди і використовувати їх разом.
- `MacroCommand` дозволяє виконати операції з групи команд й відмінити їх при потребі.

### Template Method

- Пакети: `devices`.
- Дозволяє підмінити проміжні функції не змінюючи при цьому основні функції.
- `Devices` описує метод `getInfo`, який є публічним методом, він викликає два протектед методи `getParsedInfo` i `renderInfo`.
- Припустимо, що кожен девайсь має свій власний інтерфес для отримання інформації про нього, тому кожен клас `Cooler` i `Heater` імплементують власні методи `getParsedInfo`, при тому, треба пам'ятати, що тип на виході має бути одинаковим для всіх класів.
