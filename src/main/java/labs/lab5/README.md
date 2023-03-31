### Домен

Система описує проєкт для HR відділу компанії, яка займається вантажними й пасажирськими перевезеннями.
Можливості: поглянути поточний графік водіїв; моніторинг статусу водія; нотифікація менеджерів від водія.

### Iterator

- Пакети: `categories`, `iterators`.
- Основний клас: `EmployeeIterator`.
- Патерн використовується для відображення робочого графіку водіїв, графік відображається по фільтру, який власне й користується ітератор під час вибірки з списку всіх водіїв.
- `ScheduleBoard` використовує ітератор, передаючи йому список працівників.
- Ітератор імплементує два основних методи `getNext` i `hasValue`, також один додатковий метод – `reset`.
- `getNext` бере наступний елемент в списку.
- `hasNext` повертає бульове значення чи існує наступний елемент.

### State

- Пакети: `states`.
- Основний клас: `EmployeeMonitoring`.
- Регулює й відображає поточний статус працівника, можливі статуси: очікує, в дорозі, зареєстрований на рейс.
- Кінцевий автомат дозволє точно контролювати статус і переходити від одного стану в інший за чітко встановаленою схемою.

### Chain of responsibilities

- Пакети: `units`.
- Патерн використовується для сповіщення менеджерів, оскільки менеджерська мережа є ієрархічною, то це ідеальний кандидат для цього патерну. Якщо відсутній один юніт, то нотифікація йде наверх і так до верхівки – `TopManagementUnit`.
- Якщо юніт здатний сам обробити нотифікацію, то він не відправляє повідомлення наверх.
