@RunWith(Parameterized.class)
public class CheckIsAdultTest {
    
    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        // Инициализируй поля класса в конструкторе
        this.age = age;
        this.result = result;
    }

    // Пометь метод аннотацией для параметров
    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
            // Заполни массив тестовыми данными и ожидаемым результатом
            {19, true},
            {17, false},
            {18, true},
            {21, true},
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        // Передай сюда возраст пользователя
        boolean isAdult = program.checkIsAdult(age);
        // Сравни полученный и ожидаемый результаты, не забудь про 
сообщение об ошибке
        assertEquals("Expected " + result + " for age " + age + ", but got 
" + isAdult, result, isAdult);
    }
}
