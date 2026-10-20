package w09_java_topic_6_exceptions_and_files;

public class ProgrammingExceptions {
//    Exception	Meaning
//    NullPointerException	Trying to use an object reference that is null
//    ArrayIndexOutOfBoundsException	Accessing an invalid array index
//    IndexOutOfBoundsException	Accessing an invalid index, such as in an ArrayList
//    ConcurrentModificationException	Modifying a collection while iterating over it in an unsupported way

    public static void main(String[] args) {
        String numberString = "cat";

        try {
            int number = Integer.parseInt(numberString);
            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number!"); // result
        }
        // Integer.parseInt() converts a String into an integer.
        // If the String does not contain a valid integer,
        // Java throws a NumberFormatException. We can handle this exception using try-catch.


        // 1. Errors outside of our control — ошибки вне нашего контроля
        //Это ситуации, когда код может быть написан правильно, но что-то пошло не так по внешним причинам.
        //
        //Например:
        //- Пользователь ввёл "cat" вместо числа.
        //- Программа пытается прочитать файл, который был удалён.
        //- Интернет-соединение пропало.
        //- Сервер базы данных перестал отвечать.

        // 2. Coding errors — ошибки программиста
        //String[] names = {"Anna", "Ben", "Kate"};
        //System.out.println(names[3]); // ERROR!
        //Это ситуации, когда мы сами допустили ошибку в логике программы.

        // Проблема	Что это означает
        //File doesn't exist	Файл не существует
        //Read-only directory	Нет разрешения записывать в папку
        //Another program is using the file	Другая программа использует файл и может блокировать доступ
        //File moved or deleted	Файл переместили или удалили
        //Permission denied	Недостаточно прав доступа
        //Disk full	На диске закончилось место

        // 2. Что должна делать программа в такой ситуации?
        //Преподаватель предлагает задуматься:
        //
        //What will your program do if it tries to open a file, but fails?
        //
        //Перевод: Что должна делать программа, если она пытается открыть файл, но не может?
        //
        //Возможные варианты:
        //- Crash — аварийно завершиться из-за необработанной ошибки.
        //- Quit gracefully — сообщить о проблеме и корректно завершиться.
        //- Ask for another file — попросить пользователя выбрать другой файл.
        //- Retry — попробовать открыть файл снова.

        // 1. Что такое IOException?
        //IOException = Input/Output Exception
        //
        //Это исключение, которое возникает при проблемах с вводом или выводом данных — например, при чтении или записи файлов.
        // FileReader reader = new FileReader("students.txt");
        //Но файла students.txt не существует.
        // Java выбросит FileNotFoundException, который является разновидностью IOException.

        // 3. Разница между throws и try-catch
        //throws IOException	                                                 |  try-catch
        //Объявляет, что метод может передать исключение дальше	                 |  Перехватывает исключение
        //Не обрабатывает ошибку сам	                                         |  Позволяет обработать ошибку
        //Если исключение дойдёт необработанным до main, программа завершится    |	Можно показать сообщение или предпринять другое действие

        // IOException — Key Notes
        //- IOException stands for Input/Output Exception.
        //- It occurs when something goes wrong during input or output operations, such as reading or writing files.
        //- IOException is a checked exception, which means Java requires us to handle it or declare it.
        //- We can use throws IOException to pass the exception to the calling method.
        //- We can use try-catch to handle the exception.
        //Главная мысль: throws IOException и try-catch — это не одно и то же.
        // Первый вариант передаёт ответственность за обработку исключения дальше,
        // а второй позволяет обработать его прямо здесь.


        // Наглядное сравнение
        //	                                    Checked               	Unchecked
        //Проверяется компилятором	            Да                     	Нет
        //Обязательно try-catch или throws  	Да                   	Нет
        //Типичная причина                  	Внешние проблемы        Ошибки в коде
        //Пример	IOException	NullPointerException
        //Что делать	                        Обработать или передать дальше	  Обычно исправить код

        // Finally and Multiple Catch Blocks
        //- finally executes whether an exception occurs or not, and is commonly used to clean up resources.
        //- Multiple catch blocks allow us to handle different types of exceptions separately.
        //- When an exception is thrown, Java looks for a matching catch block.
        //- catch (Exception e) should be placed last because it catches many types of exceptions.
        //- If an error occurs before close(), the file may remain open.

        // Prevention vs. Cure
        //- It is usually better to prevent exceptions than to catch them.
        //- Exception handling can be slower than checking for errors.
        //- Use conditions like if (name != null) to prevent common programming errors.
        //- For external problems, such as file operations, exception handling is still necessary.
        //- Code readability and performance are also important.

        // try (...) — здесь создаём ресурс, который Java потом автоматически закроет.

        //BufferedReader reader — переменная для чтения.

        //new FileReader("hello.txt") — открывает файл.

        //{ ... } — код, использующий этот файл.

        //Конец блока } — Java автоматически вызывает close().


    }

}
