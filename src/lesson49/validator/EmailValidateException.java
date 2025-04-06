package lesson49.validator;

// RuntimeException - для НЕпроверяемых исключений
// extends Exception - для проверяемых исключений

public class EmailValidateException extends Exception {

    /*
    getMessage() - возвращает строку с коротким описанием исключения
    getCause() - возвращает исключения,которое вызвало текущее исключение
    toString() - строковое представление исключения
    printStackTract() - выводит трассировку исключения
     */

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }
}
