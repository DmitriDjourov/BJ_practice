package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// 38.       Найти произведение пар чисел в одномерном массиве. Парой считаем первый и последний элемент,
//           второй и предпоследний и т.д.
//=============================38=============================================*/
        // 1. Создаем массив
        //      Задаем размер массива
        //      Заполняем размер массива
        //      Создаем массив
        //      Заполняем массив
        // 2. Находим произведения пар в массиве
        // 3. Проверяем есть ли в середине непарный номер (нечетное количество цифр в массиве)
        //    и умножаем на него произведение
        // 4. Выводим на печать итог
        Scanner sc = new Scanner(System.in);
//        Создаем переменную для размера массива
        int N;
//        Задаем размер массива
        System.out.println(" Задайте размер массива :");
        N = sc.nextInt();
//        Создаем массив
        int[] array = createArray(N);
//        Заполняем массив ручками
        fillArray(array, sc);
//        System.out.printf(" %s ",Arrays.toString(array));
//        2. Находим произведения пар в массиве
        int product = productOfNumbersArray(array);
//        4. Выводим на печать итог
        System.out.println("Произведение пар чисел в одномерном массиве: " + product);
    }

    // Метод для создания массива размером N
    public static int[] createArray(int N) {
        return new int[N];
    }

    // Метод для заполнения массива пользователем
    public static void fillArray(int[] array, Scanner sc) {
        System.out.println("Введите " + array.length + " элементов массива :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    // Метод нахождения произведения пар в массиве
    public static int productOfNumbersArray(int[] array) {
        int product = 1;
        int countStart = 0;
        int countEnd = array.length - 1;

        while (countStart < countEnd) {
            product = product * array[countStart] * array[countEnd];
            countEnd--;
            countStart++;
        }
        //  Проверяем есть ли в середине непарный номер (нечетное количество цифр в массиве)
        //  и умножаем на него произведение
        if (countEnd == countStart) {
            product = product * countStart;
        }
        return product;
    }
}

//        37. Найти сумму чисел одномерного массива стоящих на нечетной позиции
//=============================37=============================================*/
//1. Создаем одномерный массив
//   1.1 Создаем переменную для размера массива
//   1.2 Задаем размер массива
//   1.3 Создаем массив
//   1.4 Заполняем массив
// 2. Находим числа на каждой нечетной позиции
// 3. Суммируем числа массива на каждой нечетной позиции
// 4. Выводим результат на печать

/*        Scanner sc = new Scanner(System.in);
//        Создаем переменную для размера массива
        int N;
//        Задаем размер массива
        System.out.println(" Задайте размер массива :");
        N = sc.nextInt();
//        Создаем массив
        int[] array = createArray(N);
//        Заполняем массив ручками
        fillArray(array, sc);
//        System.out.printf(" %s ",Arrays.toString(array));
//        Находим числа на каждой нечетной позиции
//        Суммируем числа массива на каждой нечетной позиции
        int oddNumSun = oddNumbers(array);
//        Выводим результат на печать
        System.out.println("Сумма чисел находящихся на нечетной позиции будет равна : " + oddNumSun);
    }

    // Метод для создания массива размером N
    public static int[] createArray(int N) {
        return new int[N];
    }

    // Метод для заполнения массива пользователем
    public static void fillArray(int[] array, Scanner sc) {
        System.out.println("Введите " + array.length + " элементов массива :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    // Метод для нахождения чисел на каждой нечетной позиции
    public static int oddNumbers(int[] array) {
        int oddSum = 0;

        for (int i = 1; i < array.length; i = i + 2) {
            //  Суммируем числа массива на каждой нечетной позиции
            oddSum = oddSum + array[i];
        }
        return oddSum;
    }
}*/
//36. В одномерном массиве из 123 чисел найти количество элементов из отрезка [10,99]
//=============================36=============================================*/
/*      //1. Создаем одномерный массив из 123 чисел
        //2. Заполняем массив случайными числами от 0 до 123 включительно
        //3. Находим количество элементов из отрезка [10, 99]
        //4. Выводим результат на печать

        //1. Создаем одномерный массив из 123 чисел
        int[] array = createArray();
        //2. Заполняем массив случайными числами от 0 до 123 включительно
        //3. Находим количество элементов из отрезка [10, 99]
        int countInRange = countElementsInRange(array);
        //4. Выводим результат на печать
        System.out.println("Количество элементов из отрезка [10, 99]: " + countInRange);
    }

    //Метод для создания и заполнения массива случайными числами из диапазона  [0, 123]
    public static int[] createArray() {
        // 3. Создаем массив размера 123
        int[] array = new int[123];
        //4. Заполнения массива случайными числами из диапазона  [0, 123]
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 123) + 1; // генерируем случайные число от 0 до 123 включительно
        }
        return array;
    }

    // Метод для подсчета количества элементов в массиве, находящихся в отрезке [10, 99]
    public static int countElementsInRange(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num >= 10 && num <= 99) {
                count++;
            }
        }
        return count;
    }
}*/
//35.    Задать массив, заполнить случайными положительными трёхзначными числами. Показать количество нечетных\четных чисел
//=============================35=============================================*/
// 1. Задаем число размер массива
// int N;
// System.out.println("Введите число , размер массива : ");
// 2.  Заполняем число размер массива
// N = sc.nextInt();
// 3. Создаем массив размера N
// int[] array = createArray(N);
// 4. Заполняем массив рандомными трехзначными положительными числами ( числами из диапазона  [100, 999])
// int[] array = new int[N];
// Random random = new Random();
// 5. Подсчитываем количество четных и нечетных чисел (eveNumbers, oddNumbers)
// int countEveNumbers = eveNumbers(array);
// int countOddNumbers = oddNumbers(array);
// if (array[i]%2 == 0) для четных , и array[i]%2 != 0 для нечетных
// 6. Распечатываем массив, количество четных, количество нечетных чисел
// printArrayEveOdd(countEveNumbers, countOddNumbers, array)
// System.out.printf("В массиве %s , четных чисел %d , нечетных чисел %d ", Arrays.toString(array),countEveNumbers, countOddNumbers);
/*
        Scanner sc = new Scanner(System.in);
        // 1. Задаем число размер массива
        int N;
        System.out.println("Введите размер массива N :");
        // 2.  Заполняем число размер массива
        N = sc.nextInt();
        //3. Создаем массив размера N
        //4. Заполняем массив рандомными трехзначными положительными числами ( числами из диапазона  [100, 999])
        int[] array = createArray(N);
        // 5. Подсчитываем количество четных и нечетных чисел (eveNumbers, oddNumbers)
        int countEveNumbers = eveNumbers(array);
        int countOddNumbers = oddNumbers(array);
        // 6. Распечатываем массив, количество четных, количество нечетных чисел
        printArrayEveOdd(countEveNumbers, countOddNumbers, array);
    }

    //Метод для создания и заполнения массива случайными числами из диапазона  [100, 999]
    public static int[] createArray(int N) {
        // 3. Создаем массив размера N
        int[] array = new int[N];
        //4. Заполнения массива случайными числами из диапазона  [100, 999]
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(900) + 100; // генерируем случайные число от 100 до 999
            // arr[i] = random.nextInt(999 - 100 + 1) + 100;
            //array[i] = (int) (Math.random() * (999 - 100) + 1) + 100;
            //array[i] = (int) (Math.random() * (maxNum - minNum) + 1) + minNum;
        }
        return array;
    }

    // Метод для нахождения количества четных элементов массива
    public static int eveNumbers(int[] array) {
        int eveCount = 0;

        for (int j : array) {
            if (j % 2 == 0) {
                eveCount = eveCount + 1;
            }
        }
        return eveCount;
    }

    // Метод для нахождения количества нечетных элементов массива
    public static int oddNumbers(int[] array) {
        int oddCount = 0;
        for (int j : array) {
            if (j % 2 != 0) {
                oddCount = oddCount + 1;
            }
        }
        return oddCount;
    }

    // 6. Распечатываем массив, количество четных, количество нечетных чисел
    public static void printArrayEveOdd(int countEveNumbers, int countOddNumbers, int[] array) {
        System.out.printf("В массиве %s , четных чисел %d , нечетных чисел %d ", Arrays.toString(array),
                countEveNumbers, countOddNumbers);
    }
}*/
// 34.       Определить, присутствует ли в заданном массиве, некоторое число
//=============================34=============================================*/
// 1. Задаем число размер массива
// int N;
// System.out.println("Введите число , размер массива : ");
// 2.  Заполняем число размер массива
// N = sc.nextInt();
// 3. Создаем массив размера N
// int[] array = createArray(N);
// 4. Заполняем массив
// fillArray(array, sc);
// 5. Задаем число для поиска
// int X;
// System.out.println("Введите число для поиска в массиве : ");
// 6. Вводим число для поиска
// X = sc.nextInt();
// 7. Ищем в массиве наше число
// int ourNumber = forEachNumSearch(array, X);
// 8. Печатаем ответ
// printArray(ifOurNumber, X, array);
/*
        Scanner sc = new Scanner(System.in);
        //1. Задаем число размер массива
        int N;
        System.out.println("Введите число , размер массива : ");
        // 2.  Заполняем число размер массива
        N = sc.nextInt();
        // 3. Создаем массив размера N
        int[] array = createArray(N);
        // 4. Заполняем массив
        fillArray(array, sc);
        // 5. Задаем число для поиска его в массиве
        int X;
        System.out.println("Введите число для поиска его в массиве : ");
        // 6. Вводим число для поиска
        X = sc.nextInt();
        // 7. Ищем в массиве наше число
        boolean ifOurNumber = forEachNumSearch(array, X);
        // 8. Печатаем решение
        printArray(ifOurNumber, X, array);
    }

    // 3. Создаем массив размера N
    public static int[] createArray(int N) {
        return new int[N];
    }

    // 4. Заполняем массив
    public static void fillArray(int[] array, Scanner sc) {
        System.out.println("Введите " + array.length + " элементов массива :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }

    // 7. Ищем в массиве наше число
    public static boolean forEachNumSearch(int[] array, int X) {
        for (int num : array) {
            if (num == X) {
                return true;
            }
        }
        return false;
    }

    // 8. Печатаем решение
    public static void printArray(boolean ifOurNumber, int X, int[] array) {
        if (ifOurNumber) {
            System.out.printf("Ваше число %d найдено в массиве %s ", X, Arrays.toString(array));
        } else {
            System.out.printf("Ваше число %d не найдено в массиве %s ", X, Arrays.toString(array));
        }
    }
}*/
//33. Написать программу разворота массива. Пример: [1, 2, 3] => [3, 2, 1]
//=============================33=============================================*/
/*        *//* Scanner sc = new Scanner(System.in);*//*
        // Задаем массив
        int[] arr = {1, 2, 3};
        System.out.println("Исходный массив: " + Arrays.toString(arr));
        // Заполняем массив
        reverseArray(arr);
        // печатаем развернутый массив
        System.out.println("Развёрнутый массив: " + Arrays.toString(arr));
    }
    public static void reverseArray(int[] arr) {
        //получаем размер массива
        int length = arr.length;
        //рассматриваем массив
        for (int i = 0; i < length / 2; i++) {
            // Меняем местами элементы, находящиеся на индексах i и length - i - 1
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
    }
}*/
//32. Написать программу замены элементов массива на противоположные Пример: [1, 2, 3] => [-1, -2, -3]
//=============================32=============================================*/
/*        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Введите число , размер массива : ");
        N = sc.nextInt();

        // Создаем массив
        int[] array = createArray(N);

        //заполняем массив
        fillArray(array, sc);

        //меняем знак у элементов массива на -
        array = minusArray(array);

        //печатаем массив
        printArray(array);
    }
    //метод для создания массива
    public static int[] createArray(int N) {
        return new int[N];
    }
    //Пользователь заполняет массив
    public static void fillArray(int[] array, Scanner sc) {
        System.out.println("Введите " + array.length + " элементов массива :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    // Меняем знак у элементов массива на -
    public static int[] minusArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(("-" + array[i]));
        }
        return array;
    }
    // распечатываем массив
    public static void printArray(int[] array) {
        System.out.println("Эллементы массива :");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
}*/
// 31. Задать массив из N элементов, заполненных числами из [0, A]. Найти сумму положительных/отрицательных элементов массива
//=============================31=============================================*/
/*        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Введите размер массива N :");
        N = sc.nextInt();

        int A;
        System.out.println("Введите верхнюю границу массива A :");
        A = sc.nextInt();

        //Создаем массив и заполняем его случайными числами из диапазона [0, A]
        int[] array = createAndFillArray(N, A);

        //Выводим элементы массива на экран
        System.out.println("Массив : ");
        printArray(array);

        // Находим сумму положительных и отрицательных элементов массива
        int sumPositive = sumPositiveElem(array);
        int sumNegative = sumNegativeElem(array);

        // Печать сумм
        System.out.println("Сумма положительных элементов = " + sumPositive);
        System.out.println("Сумма отрицательных элементов = " + sumNegative);

        sc.close();
    }

    //Метод для создания и заполнения массива случайными числами из диапазона  [0, A]
    public static int[] createAndFillArray(int N, int A) {
        int[] array = new int[N];
        Random random = new Random();

        for (int i = 0; i < N; i++) {
            array[i] = random.nextInt(A + 1); // генерируем случайное число от 0 до A
        }
        return array;
    }
    // Вывод массива на печать
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }
    // Метод для нахождения суммы положительных элементов массива
    public static int sumPositiveElem(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
    // Метод для нахождения суммы отрицательных элементов массива
    public static int sumNegativeElem(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}*/
// 30. Задать массив из N элементов, заполненных нулями и единицами вывести их на экран
//=============================30=============================================*/
/*        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Введите размер массива N :");
        N = sc.nextInt();

        // Создаем массив и инициализируем его
        int[] array = createAndFillArray(N, sc);
        // Выводим элементы массива на экран
        printArray(array);

        sc.close();
    }
    //метод для создания и заполнени массива
    public static int[] createAndFillArray(int N, Scanner sc) {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = getValidInput(i, sc);
        }
        return array;
    }
    // Метод для проверки ввода (только 0 и 1)
    public static int getValidInput(int index, Scanner sc) {
        while (true) {
            System.out.println("Введите 0 или 1 для элементов массива" + index + "  :");
            int input = sc.nextInt();
            if (input == 0 || input == 1) {
                return input;
            } else {
                System.out.println("Вы ввели число отличное от 0 и 1");
            }
        }
    }
    //метод для вывода массива в консоль
    public static void printArray(int[] array) {
        System.out.println("Эллементы массива :");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println();//пустая строка для красоты
    }
}*/
// 29. Задать массив из N элементов и вывести их на экран
//=============================29=============================================*/
// Решение с использованием методов
/*        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Введите размер массива N :");
        N = sc.nextInt();

        int[] array = createArray(N);

        fillArray(array, sc);

        printArray(array);

        sc.close();
    }
//метод для создания массива
    public static int[] createArray(int N) {
        return new int[N];
    }
    //метод для заполнени массива
    public static void fillArray(int[] array, Scanner sc) {
        System.out.println("Введите " + array.length + " элементов массива :");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
    }
    //метод для вывода массива в консоль
    public static void printArray(int[] array){
        System.out.println("Эллементы массива :");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        System.out.println();//пустая строка для красоты
    }
}*/
/*      Простой вариант решения.
        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Введите размер массива N: ");
        N = sc.nextInt();

        int[] array = new int[N];

        System.out.println("Элементы массива: ");
        for (int i = 0; i < N; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(("Элементы массива : "));
        for (int i = 0; i < N; i++) {
            System.out.println(array[i] + " ");
        }
        sc.close();
    }
}*/
//28. Показать кубы чисел, заканчивающихся на четную цифру
//=============================28=============================================*/
/*        Scanner sc = new Scanner(System.in);

        int A;
        System.out.println("Введите нижнюю границу диапазона : ");
        A = sc.nextInt();

        int B;
        System.out.println("Введите верхнюю границу диапазона : ");
        B = sc.nextInt();

        System.out.println("Таблица кубов чисел от " + A + " до " + B + " заканчивающиеся на четную цифру;");
        System.out.println("===================");
        System.out.println("| Число |   Куб   |");
        System.out.println("===================");

        for (int i = A; i <= B; i++) {
            int cube = i * i * i;
            if (cube % 2 == 0) {
                System.out.printf("| % 5d | %7d |%n", i, cube);
            }
        }
        System.out.println("===================");
    }
}*/
//27.Написать программу вычисления произведения чисел от 1 до N
//=============================27=============================================*/
/*        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Enter you number : ");
        N = sc.nextInt();

        int multiplyN = 1;

        System.out.println("Произведение чисел от 1 до " + N + ";");
        for (int i = 1; i <= N; i++) {
            multiplyN = multiplyN * i;
        }
        System.out.println(multiplyN);
        System.out.println("===================");
    }
}*/
// 26. Подсчитать сумму цифр в числе
//=============================26=============================================*/
/*        Scanner sc = new Scanner(System.in);

        int numN;
        System.out.println("Enter you number: ");
        numN = sc.nextInt();

        int sumNum = 0;
        while (numN != 0) {
            sumNum = sumNum + (numN % 10); // прибавляем последнюю цифру к сумме
            numN = numN / 10;// убираем последний знак
        }
        System.out.println(sumNum);
    }
}*/
// 25. Определить количество цифр в числе
//=============================25=============================================*/
/*        Scanner sc = new Scanner(System.in);

        String NumN;
        System.out.println("Enter you number : ");
        NumN = sc.next();

        int length = NumN.length();

        System.out.printf("Колличества цифр в числе %s будте равно %d ", NumN, length);
    }
}*/
// 24. Возведите число А в натуральную степень B используя цикл
//=============================24=============================================*/
/*        Scanner sc = new Scanner(System.in);

        int A;
        System.out.println("ВВедите число которое хотите возвести в степень: ");
        A = sc.nextInt();

        int B;
        System.out.println("Введите степень в которую хотите возвести число: ");
        B = sc.nextInt();

        int countA = 1;
        for (int i = 1; i <= B; i++) {
            countA = countA * A;
        }
        System.out.printf("Число %d возведенное в степень %d, будет равно %d ", A, B, countA);
    }
}*/
//23.Найти сумму чисел от 1 до А
//=============================23=============================================*/
/*        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Enter you number : ");
        N = sc.nextInt();

        int sumN = 0;

        System.out.println("Сумма чисел от 1 до " + N + ";");
        for (int i = 1; i <= N; i++) {
            sumN = sumN + i;
        }
        System.out.println(sumN);
        System.out.println("===================");
    }
}*/
//=============================22=============================================*/
// 22. Найти кубы чисел от 1 до N
/*        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Enter you number : ");
        N = sc.nextInt();

        System.out.println("Таблица квадратов чисел от 1 до " + N + ";");
        System.out.println("===================");
        System.out.println("| Число |   Куб   |");
        System.out.println("===================");

        for (int i = 1; i <= N; i++) {
            int cube = i * i * i;
            System.out.printf("| % 5d | %7d |%n", i, cube);
        }
        System.out.println("===================");
    }
}*/
//=============================21=============================================*/
//21.Показать таблицу квадратов чисел от 1 до N
/*        Scanner sc = new Scanner(System.in);

        int N;
        System.out.println("Enter you number : ");
        N = sc.nextInt();

        System.out.println("Таблица квадратов чисел от 1 до " + N + ";");
        System.out.println("===================");
        System.out.println("| Число | Квадрат |");
        System.out.println("===================");

        for (int i = 1; i <= N; i++) {
            int squ = i * i;
            System.out.printf("| % 5d | %7d |%n", i, squ);
        }
        System.out.println("===================");
    }
}*/
//20. Найти расстояния между двумя точками в трехмерном пространстве
//=============================20=============================================*/
/*        Scanner sc = new Scanner(System.in);

        double x1;
        System.out.println("Задайте Х координату первой точки:  ");
        x1 = sc.nextDouble();

        double y1;
        System.out.println("Задайте Y координату первой точки:  ");
        y1 = sc.nextDouble();

        double z1;
        System.out.println("Задайте Z координату первой точки:  ");
        z1 = sc.nextDouble();

        double x2;
        System.out.println("Задайте Х координату второй точки:  ");
        x2 = sc.nextDouble();

        double y2;
        System.out.println("Задайте Y координату второй точки:  ");
        y2 = sc.nextDouble();

        double z2;
        System.out.println("Задайте Y координату второй точки:  ");
        z2 = sc.nextDouble();

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double deltaZ = z2 - z1;

        double distanceSq = deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ;
        double distance = Math.sqrt(distanceSq);

        System.out.printf("Расстояние между двумя точками А(%.2f;%.2f;%.2f) и В(%.2f;%.2f;%.2f)) будет равно %.2f", x1, y1, z1, x2, y2, z2, distance);
    }
}*/
//=============================19=============================================*/
//19. Найти расстояния между двумя точками в двухмерном пространстве
/*        Scanner sc = new Scanner(System.in);

        double x1;
        System.out.println("Задайте Х координату первой точки:  ");
        x1 = sc.nextDouble();

        double y1;
        System.out.println("Задайте Y координату первой точки:  ");
        y1 = sc.nextDouble();

        double x2;
        System.out.println("Задайте Х координату второй точки:  ");
        x2 = sc.nextDouble();

        double y2;
        System.out.println("Задайте Y координату второй точки:  ");
        y2 = sc.nextDouble();

        double deltaX = x2 - x1;
        double deltaY = y2 - y1;

        double distanceSq = deltaX * deltaX + deltaY * deltaY;
        double distance = Math.sqrt(distanceSq);

        System.out.printf("Расстояние между двумя точками А(%.2f,%.2f) и В(%.2f,%.2f) будет равно %.2f", x1, y1, x2, y2, distance);
    }
}*/
//       18. Программа проверяет пятизначное число на палиндромом(12321).
//=============================18=============================================*/
/*        Scanner sc = new Scanner(System.in);

        int a;
        System.out.println("Введите палиндромное пятизначное число(например 12321): ");
        a = sc.nextInt();

        if ((10000 <= a) && (a <= 99999)) {
            int digit1 = a / 10000;
            int digit2 = (a / 1000) % 10;
            int digit4 = (a / 10) % 10;
            int digit5 = a % 10;

            if ((digit5 == digit1) && (digit4 == digit2)) {
                System.out.printf("Число %d, является палиндромом", a);
            } else {
                System.out.printf("Число %d, не является палиндромом", a);
            }
        } else {
            System.out.println("Число должно быть пятизначным");
        }
    }
}*/
//=============================17=============================================*/
//        17.По двум заданным числам проверять является ли одно квадратом другого
/*        Scanner sc = new Scanner(System.in);

        double a, b;
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();

        double result1 = a * a;
        double result2 = b * b;

        if (a == result2 || b == result1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}*/
//=============================16=============================================*/
//       16. Дано число обозначающее день недели. Выяснить является номер дня недели выходным
/*        Scanner sc = new Scanner(System.in);

        int dayOfWeek;
        System.out.println("Введите номер дня недели : ");
        dayOfWeek = sc.nextInt();

        if (dayOfWeek > 0 && dayOfWeek < 8) {
            if (dayOfWeek == 7 || dayOfWeek == 6) {
                System.out.println("Это выходной день надели.");
            } else {
                System.out.println("Это рабочий день недели.");
            }
        } else {
            System.out.println("Это не день недели. Выбери от 1 до 7");
        }
    }
}*/
//==================;============15=============================================*/
//        15. Дано число. Проверить кратно ли оно 7 и 23
/*        Scanner sc = new Scanner(System.in);

        int numStat;
        System.out.println("Enter you number: ");
        numStat = sc.nextInt();

        if (numStat == 0) {
            System.out.printf("Вы выбрали число 0 ");
            return;
        }

        if (numStat % 7 == 0 && numStat % 23 == 0 ) {
            System.out.printf("Число %d кратно и 7 и 23", numStat);
        } else if (numStat % 7 == 0) {
            System.out.printf("Число %d кратно 7 ", numStat);
        } else if (numStat % 23 == 0) {
            System.out.printf("Число %d кратно 23 ", numStat);
        } else {
            System.out.printf("Число %d не кратно ни 23 ни 7", numStat);
        }
    }
}*/
//==============================14=============================================*/
//     14.   Найти третью цифру числа или сообщить, что её нет
/*        Scanner sc = new Scanner(System.in);

        String numStr;
        String resultStr;
        int resultNum;

        int numStat;
        System.out.println("Введите число : ");
        numStat = sc.nextInt();

        if (numStat >= 99) {
            numStr = Integer.toString(numStat);//String
            resultStr = numStr.substring(2, 3);//String
            resultNum = Integer.parseInt(resultStr);//int
            System.out.printf("Третий знак у числа %d это %d", numStat, resultNum);
        } else {
            System.out.printf("Нет третьего знака у числа %d ", numStat);
        }
    }
}*/
//==============================13=============================================*/
//    13.    Выяснить, кратно ли число заданному, если нет, вывести остаток.
/*        Scanner sc = new Scanner(System.in);

        int numStat;
        System.out.println("Введите номер : ");
        numStat = sc.nextInt();

        int numKrat;
        System.out.println("Введите кратный номер для предыдущего числа: ");
        numKrat = sc.nextInt();
        if (numKrat < numStat) {
            if (numStat % numKrat == 0) {

                System.out.println("kratno");
            } else {
                System.out.printf("Остаток от деления: %d", numStat % numKrat);
            }
        } else {
            System.out.println(numKrat + ">" + numStat);
        }
    }
}*/
//==============================12=============================================*/
//     12.   Удалить вторую цифру трёхзначного числа
/*        Scanner sc = new Scanner(System.in);

        int numN3;
        System.out.println("Enter you three-digits number: ");
        numN3 = sc.nextInt();

        if (99 <= numN3 && numN3 <= 999) {
            int hungredDigit = numN3 / 100;
            int oneDigit = numN3 % 10;
            System.out.println(hungredDigit + "" + oneDigit);
        } else {
            System.out.println("The number is not three digits.");
        }
    }
}*/
//==============================11=============================================*/
//       11. Дано число из отрезка [10, 99]. Показать наибольшую цифру числа
    /*    Scanner sc = new Scanner(System.in);

        int numN2;
        System.out.println("Enter you two digits number: ");
        numN2 = sc.nextInt();

        if (10 <= numN2 && numN2 <= 99) {
            int oneDigit = numN2 % 10;
            int tenDigit = numN2 / 10;

            int MaxDigit = Math.max(oneDigit, tenDigit);

            System.out.println(MaxDigit);// 33 = max 3

        } else {
            System.out.println("The number is not two digits.");
        }
    }
}*/
//==============================10=============================================*/
/*        Scanner sc = new Scanner(System.in);
//   10.     Показать вторую цифру трёхзначного числа
        int numN;
        System.out.println("Enter your three digit number: ");
        numN = sc.nextInt();
        if (numN >= 100 && numN <= 999) {
            System.out.println((numN / 10) % 10);
        } else {
            System.out.println("The number is not three digits.");
        }
//        System.out.println((345/10)%10);
    }
}*/
//==============================9=============================================*/
/*        Scanner sc = new Scanner(System.in);
//      9.  Показать последнюю цифру трёхзначного числа
        int numN;
        System.out.println("Enter your three digit number: ");
        numN = sc.nextInt();
        if (numN >= 100 && numN <= 999) {
            System.out.println(numN%10);
        }
        else {
            System.out.println("The number is not three digits.");
        }
    }
}*/
//==============================8=============================================*/
/*        Scanner sc = new Scanner(System.in);
//       8.  Показать четные числа от 1 до N
        int numN;
        System.out.println("Enter you number: ");
        numN = sc.nextInt();

        for (int i = 2; i <= numN; i = i + 2) {
            System.out.println(i);
        }
    }
}*/
//==============================7=============================================*/
//    7.    Показать числа от -N до N
/*        Scanner sc = new Scanner(System.in);

        int numN ;
        int minusNumN ;
        System.out.println("Enter you number: ");
        numN = sc.nextInt();
        minusNumN = (-numN);
//        System.out.println(numN+"  "+minusNumN);
        for (int i = minusNumN; i <= numN ; i++) {
            System.out.println(i);
        }
    }
}*/
//==============================6=============================================*/
//       6. Выяснить является ли число чётным
/*        Scanner sc = new Scanner(System.in);

        int intNum ;
        System.out.println("ВВедите число : ");
        intNum = sc.nextInt();
        if (intNum%2 == 0) {
            System.out.println("Четное число : " + intNum );
        }
        else{
            System.out.println("Неетное число : " + intNum );
        }*/
/*
    }
}
*/
//==============================5=============================================*/
/*        //5. Найти максимальное из трех чисел
        Scanner sc = new Scanner(System.in);

        int firstNum;
        System.out.println("Введите первое число : ");
        firstNum = sc.nextInt();

        int secNum;
        System.out.println("Введите второе число : ");
        secNum = sc.nextInt();

        int thirdNum;
        System.out.println("Введите третье число : ");
        thirdNum = sc.nextInt();

        if (firstNum >= secNum && firstNum >= thirdNum ) {
            System.out.printf("Max number: %d ", firstNum);
        } else if (secNum >= firstNum && secNum >= thirdNum) {
            System.out.printf("Max number: %d ", secNum);
        }
        else {
            System.out.printf("Max number: %d ", thirdNum);
        }*/
//    }
//}


//4. По заданному номеру дня недели вывести его название
//==============================4=============================================*/
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int day;
//        System.out.println("Введите номер дня недели от 1 до 7: ");
//        day = sc.nextInt();
//        if (day > 0 && day < 8) {
//            if (day == 1) {
//                System.out.println("понедельник");
//
//            } else if (day == 2) {
//                System.out.println("вторник");
//            } else if (day == 3) {
//                System.out.println("среда");
//            } else if (day == 4) {
//                System.out.println("четверг");
//            } else if (day == 5) {
//                System.out.println("пятница");
//            } else if (day == 6) {
//                System.out.println("суббота");
//            } else {
//                System.out.println("воскресенье");
//            }
//
//        } else {
//            System.out.println("Вы ввели неверное число. ");
//        }
//    }
//}
//==========================================================================*/
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//        По двум заданным числам проверять является ли одно квадратом другого
//==============================2=============================================*/
/*public class Main {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        double result1 = a * a;
        double result2 = b * b;
        if (a == result2 || b == result1) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}==============================3=============================================*/
//public class Main {
//    public static void main(String[] args) {
////        Даны два числа. Показать большее и меньшее число
//        Scanner sc = new Scanner(System.in);
//        int fistNum;
//        System.out.println("Введите первое число: ");
//        fistNum = sc.nextInt();
//
//        int lastNum;
//        System.out.println("Введите второе число: ");
//        lastNum = sc.nextInt();
//        if (fistNum > lastNum) {
//            System.out.printf("Max number: %d Min number: %d", fistNum, lastNum);
//        } else {
//            if (fistNum < lastNum) {
//                System.out.printf("Min number: %d Max number: %d", fistNum, lastNum);
//            } else {
//                System.out.println("Равны ");
//            }
//        }
//    }
//}==========================================================================*/

/*        Scanner sc = new Scanner(System.in);

        double first;
        System.out.println("Enter number first : ...");
        first = sc.nextByte();

        double second;
        System.out.println("Enter number second : ...");
        second = sc.nextByte();

        double result1;
        double result2;

        result1 = (first * first);
         result2 = (second * second);

        if (result1 == second) {
            System.out.println("second == first**2");
        }
        else {
            if (result2 == second) {
                System.out.println("first == second**2");
            }
            else {
                System.out.println("no");*/

//    }
//}
////==========================================
  /*      double a;
        double b;

        Scanner = new Scanner(System.in);
        System.out.println("Enter number a : ...");
        a = scanner.nextByte();
        System.out.println("Enter number b : ...");
        b = scanner.nextByte();
        double result = (b * b);

        if (a == result) {
            System.out.println("Yes");
        } else {
            System.out.println("no");
        }*/

//===ili==========
/*    double x, y;
    Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
                x = sc.nextDouble();
                System.out.print("y: ");
                y = sc.nextDouble();
                System.out.println(x == y * y);*/
//==========================================
//    }
//            }


/*        Ctrl + Space — стандартное автодополнение кода;
        Ctrl + Shift + Space — умное автодополнение кода;
        Двойной Shift — искать везде;
        Alt + Enter — показать возможные варианты исправления;
        Alt + Ins — генерация кода (геттеры, сеттеры, конструктор и т.д.);
        Ctrl + P — информация о параметре (применяется на аргументе метода при вызове);
        Ctrl + W — расширить область выделения;
        Ctrl + Shift + W — уменьшить область выделения;
        Ctrl + E — список недавних файлов;
        Shift + F6 — переименовать (переменную, функцию и т.д.);
        Ctrl + R — сделать замену;
        Ctrl + Q — быстрый просмотр документации;
        Ctrl + / — закомментировать/раскомментировать строку;
        Ctrl + Shift + / — закомментировать/раскомментировать блок кода;
        Ctrl + Alt + I — автоматически добавить нужные отступы для строки/строк;
        Ctrl + Shift + A — найти действие;
        Shift + Alt + ↑ — переместить выбранные строки вверх;
        Shift + Alt + ↓ — переместить выбранные строки вниз;
        Ctrl + Shift + F7 — показать все упоминания в файле;
        Ctrl + Alt + L — реформатировать код.*/

 /*        Scanner sc = new Scanner(System.in);

       int value;
        value = 12345;
        System.out.print("value...");
        value = sc.nextInt();

        while (value != 0) {
            System.out.println(value % 10);
            value = value / 10;
        }*/
//==========================================
/*        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number: ");
        number = sc.nextInt();

//        double result = Math.pow(number, 2);
        int result = number * number;
        System.out.printf("result = %d", result);
*//*        String output = String.format("result = %d", result);
        System.out.printf(output);*/
//==========================================

/*    }
}*/
