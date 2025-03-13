package lesson33;

public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isEmailValid(email)){
        this.email = email;

        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*
    Требования к паролю (password):
    1. Длинна пароля >= 8
    2. Должна быть минимум одна цифра
    3. Должна быть минимум 1 маленькая буква -> Character.isLowerCase()
    4. Должна быть минимум 1 большая буква
    5. Должен быть минимум один спец символ: " !%$@&*()[],. "

    Пароль должен удовлетворять всем требованиям сразу.
    5 boolean переменных. Каждая отвечает за свой пункт.
    Пароль будет подходить,только если все 5 имеют true
     */

    // 1. Длинна пароля >= 8
    private boolean isLengthValid(String password){
        return password != null && password.length() >= 8;
    }
    // 2. Должна быть мин. одна цифра
    private boolean hasDigit(String password){
        for (char ch : password.toCharArray()){
            if (Character.isDigit(ch)){
                return true;
            }
        }
        return false;
    }
//    3. Должна быть минимум 1 маленькая буква -> Character.isLowerCase()
    private boolean hasLowerCase(String password){
        for (char ch : password.toCharArray()){
            if (Character.isLowerCase(ch)){
                return true;
            }
        }
        return false;
    }
    //    4. Должна быть минимум 1 большая буква
    private boolean hasUpperCase(String password){
        for (char ch : password.toCharArray()){
            if (Character.isUpperCase(ch)){
                return true;
            }
        }
        return false;
    }
//    5. Должен быть минимум один спец символ: " !%$@&*()[],. "
    private boolean hasSpecialCharacter(String password){
        String specialChar = "!%$@&*()[],.";
        for (char ch : password.toCharArray()){
            if (specialChar.indexOf(ch) >= 0){
                return true;
            }
        }
        return false;
    }
    private boolean isPasswordValid(String password){
        return isLengthValid(password) &&
                hasDigit(password) &&
                hasLowerCase(password) &&
                hasUpperCase(password) &&
                hasSpecialCharacter(password);
    }


    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    /*
    test@email.com.net
    1. Должна присутствовать @ и только одна
    2. Точка после собаки
    3. После последней точки есть 2 или более символов
    4. Алфавит, цифры, '-', '_', '@', '.'
    5. До собаки должен быть хотя бы один символ
    6. Первый символ - должна быть буква
     */

    private boolean isEmailValid(String email){

        // 1.Должна присутствовать @
        int indexAt = email.indexOf('@');
        int lastAt = email.lastIndexOf('@');
        if (indexAt == -1 || indexAt != lastAt) return false;


        // 2.Точка после собаки
        int dotIndexAfterAt = email.indexOf('.', indexAt + 1);
        if (dotIndexAfterAt == -1) return false;

        // 3. После последней точки есть 2 или более символов
        int lastDotIndex = email.lastIndexOf('.');
        if (lastDotIndex + 2 >= email.length() -2) return false;

        // 4. Алфавит, цифры, '-', '_', '@', '.'
        /*
        Перебираю все символы в строке.Проверяю текущий символ.
        Если нахожу хоть один не правильный, сразу возврат false
         */

        // string.toCharArray() -> char[]
        for (char ch : email.toCharArray()){
            //проверка символа на правильность
            boolean isPass = Character.isAlphabetic(ch)
                    || Character.isDigit(ch)
                    || ch == '-'
                    || ch == '_'
                    || ch == '.'
                    || ch == '@';

            // Если символ не подходит (isPass = false) возвращаем false
            if (!isPass) return false; // делай что-то, если переменная false
        }

            // 5. До собаки должен быть хотя бы один символ
            // Индекс собаки не равен 0
            if (indexAt == 0) return false;

            // 6. Первый символ - должна быть буква
            // Символ с индексом 0 должен быть буква
            if (!Character.isLetter(email.charAt(0))) return false;





        // Все проверки пройдены. mail подходит
        return true;
    }






}
