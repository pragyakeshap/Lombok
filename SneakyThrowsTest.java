import lombok.SneakyThrows;

public class SneakyThrowsTest {

    public void testSneakyThrows(){
        //throw new IllegalAccessException();
    }

    @SneakyThrows
    public void testSneakyThrowsWithLombok(){
        throw new IllegalAccessException();
    }


    //Equivalent Java code
    public void testSneakyThrowsWithLombokJava() {
        try {
            throw new IllegalAccessException();
        } catch (java.lang.Throwable $ex) {
            throw lombok.Lombok.sneakyThrow($ex);
        }
    }
}
