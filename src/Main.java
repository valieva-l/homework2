public class Main {
    public static void main(String[] args) {
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
     System.out.println(dog);
     System.out.println(cat);
     System.out.println(paper);
     //Задача 2
    dog = dog + 4.0;
     System.out.println(dog);
    cat = cat + 4.0;
     System.out.println(cat);
    paper = paper + 4;
     System.out.println(paper);
        //Задача 3
    dog = dog - 3.5;
     System.out.println(dog);
    cat = cat - 1.6;
     System.out.println(cat);
     paper = paper-7639;
     System.out.println(paper);
     //Задача 4
     var friend = 19;
     System.out.println(friend);
     friend = friend + 2;
     System.out.println(friend);
     friend = friend/7;
     System.out.println(friend);
     //Задача 5
     var frog = 3.5;
     System.out.println(frog);
     frog = frog*10;
     System.out.println(frog);
     frog = frog/3.5;
     System.out.println(frog);
     frog = frog + 4;
     System.out.println(frog);
     //Задача 6
    var boxerWeight1 = 78.2;
    var boxerWeight2 = 82.7;
    var boxerWeightTotal = boxerWeight1 + boxerWeight2;
    System.out.println("Общая масса двух бойцов "+ boxerWeightTotal + " кг");
    var boxerWeightDifference = boxerWeight2 - boxerWeight1;
    System.out.println("Разница между массами бойцов состовляет " + boxerWeightDifference + " кг");
     //Задача 7
        var remains = boxerWeight2%boxerWeight1;
        System.out.println("Остаток от деления между двумя весами " + remains + " кг");
   // Задача 8
        var totalHours = 640;
        var workingHours = 8;
        var numberEmployees = totalHours/ workingHours;
        System.out.println("Всего работников в компании " + numberEmployees + " человек");
        numberEmployees = numberEmployees + 94;
        System.out.println(numberEmployees);
        var workingHours1 = totalHours/numberEmployees;
        System.out.println("Если в компании работает " + numberEmployees + "  человека, то всего " + workingHours1 + " часа работы может быть поделено между сотрудниками");
    }
}