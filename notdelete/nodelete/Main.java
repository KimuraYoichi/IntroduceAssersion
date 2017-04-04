package nodelete;
public class Main {
    private static final boolean ASSERT = true;    // アサーションを削除するならfalse

    public static void main(String[] args) {
        int x = -123;
        if (ASSERT) {
            assert x > 0;
        }
    }
}
