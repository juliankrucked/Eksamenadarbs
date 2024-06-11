
# Eksāmena Darbs - Jautājumu un Atbilžu Testa Programma

Šīs ir vienkāršs Java kods, kas izveido jautājumu un atbilžu testu, izmantojot `JOptionPane` grafisko interfeisu, lai parādītu jautājumus un saņemtu atbildes no lietotāja. Programma arī saglabā rezultātus failā.
![image](https://github.com/juliankrucked/Eksamenadarbs/assets/153814717/c6652d38-305c-4a22-8e19-60e70ee97cc9)

## Programmas apraksts

Programma sastāv no šādām galvenajām daļām:
- `Jautajumi` klase: Šī klase satur vienu jautājumu, atbilžu variantus un pareizo atbildi.
- `Test` klase: Šī klase pārvalda jautājumu ielādi no faila, testa izpildi un rezultātu saglabāšanu.
- `tests` klase: Šī ir galvenā klase, kas izpilda programmu.

## Programmas darbības soļi

1. Programma ielādē jautājumus no faila `JautajumiUnAtbildes.txt`.
2. Programma parāda jautājumus lietotājam, izmantojot `JOptionPane`.
3. Lietotājs ievada savas atbildes.
4. Programma pārbauda atbildes un skaita pareizās un nepareizās atbildessniedzot atiecīgos punktus procesā.
   ![image](https://github.com/juliankrucked/Eksamenadarbs/assets/153814717/3545b89c-65ab-4eb0-abef-7a6589ad6351)

5. Programma saglabā rezultātus failā `rezultats.txt`.

## Jautājumu faila formāts

Jautājumu fails (`JautajumiUnAtbildes.txt`) ir teksta fails ar šādu formātu:
- Katrs jautājums sastāv no piecām rindiņām.
- Pirmā rindiņa ir jautājuma teksts.
- Nākamās četras rindiņas ir atbilžu varianti.
- Pēdējā (sestā) rindiņa ir pareizā atbilde (viens simbols, piemēram, 'a').

![image](https://github.com/juliankrucked/Eksamenadarbs/assets/153814717/b45ad8a3-d497-496b-bd39-3ac68d24a769)


