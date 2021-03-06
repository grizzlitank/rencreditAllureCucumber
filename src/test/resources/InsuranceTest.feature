#language: ru
Функционал: Ренкредит

  Сценарий: Калькулятор вкладов

  Когда выбран калькулятор для вкладов
  Тогда заголовок соответствует "Рассчитайте доходность по вкладу"

  Когда заполняются поля:
    |Валюта|Доллары США|
    |Сумма вклада|50000|
    |Срок|9 месяцев|
    |Пополнение|1000|
    |Чекбоксы|1|

  Тогда поля имеют значения:
    |Ставка|0.75%|
    |Начислено|301,42|
    |Пополнение|8 000|
    |К снятию|58 301,42|

  Сценарий: Калькулятор вкладов

    Когда выбран калькулятор для вкладов
    Тогда заголовок соответствует "Рассчитайте доходность по вкладу"

    Когда заполняются поля:
      |Валюта|Рубли|
      |Сумма вклада|2000000|
      |Срок|6 месяцев|
      |Пополнение|30000|
      |Чекбоксы|2|

    Тогда поля имеют значения:
      |Ставка|6.25%|
      |Начислено|65 132,87|
      |Пополнение|150 000|
      |К снятию|2 215 132,87|
