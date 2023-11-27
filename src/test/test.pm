func calcYearOfBirth() {

    int age;
    int-> agePointer = $age;
    int year;
    int-> yearPointer;

    int yearOfBirth;
  print("Qual o ano atual?");
  yearPointer = $year;

  read(yearPointer);

   print("Qual ano você nasceu? ");
   read(yearOfBirth);

    &agePointer = year - yearOfBirth;

    print("Sua idade: ");
    print(age);

}
calcYearOfBirth();
